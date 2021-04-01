package com.hanqing.project.service;

import com.hanqing.project.entity.Account;
import com.hanqing.project.dto.LoginDTO;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 账号表 服务类
 * </p>
 *
 * @author 含情
 * @since 2021-03-24
 */
public interface IAccountService extends IService<Account> {
    LoginDTO login (String username , String password);
}
