package com.hanqing.project.service.impl;

import com.hanqing.project.entity.Customer;
import com.hanqing.project.mapper.CustomerMapper;
import com.hanqing.project.service.ICustomerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 客户表 服务实现类
 * </p>
 *
 * @author 含情
 * @since 2021-03-24
 */
@Service
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer> implements ICustomerService {

}
