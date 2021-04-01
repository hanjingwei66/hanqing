package com.hanqing.project.service.impl;

import cn.hutool.crypto.digest.MD5;
import com.hanqing.project.entity.Account;
import com.hanqing.project.mapper.AccountMapper;
import com.hanqing.project.dto.LoginDTO;
import com.hanqing.project.service.IAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.springframework.stereotype.Service;


/**
 * <p>
 * 账号表 服务实现类
 * </p>
 *
 * @author 含情
 * @since 2021-03-24
 */
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements IAccountService {

    @Override
    public LoginDTO login(String username, String password) {
        LoginDTO loginDTO = new LoginDTO();
        loginDTO.setPath("redirect:/");
        Account account = lambdaQuery().eq(Account::getUsername, username).one();
        if (account==null){
            loginDTO.setError("用户不存在");
            return loginDTO;
        }
        MD5 md5 = new MD5(account.getSalt().getBytes());
        String digestHex16 = md5.digestHex16(password);
        if(!digestHex16.equals(account.getPassword())){
            loginDTO.setError("密码错误");
            return loginDTO;
        }
        loginDTO.setPath("login/main");
        loginDTO.setAccount(account);
        return loginDTO;
    }
}
