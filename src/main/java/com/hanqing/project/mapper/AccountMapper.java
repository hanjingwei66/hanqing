package com.hanqing.project.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hanqing.project.entity.Account;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hanqing.project.entity.Resource;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 账号表 Mapper 接口
 * </p>
 *
 * @author 含情
 * @since 2021-03-24
 */
public interface AccountMapper extends BaseMapper<Account> {
    IPage<Account> accountPage(Page page,@Param(Constants.WRAPPER) Wrapper<Resource> wrapper);
}
