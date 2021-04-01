package com.hanqing.project.service.impl;

import com.hanqing.project.entity.Role;
import com.hanqing.project.mapper.RoleMapper;
import com.hanqing.project.service.IRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色表 服务实现类
 * </p>
 *
 * @author 含情
 * @since 2021-03-24
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
