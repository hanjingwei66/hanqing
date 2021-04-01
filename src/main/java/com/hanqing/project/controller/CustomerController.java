package com.hanqing.project.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hanqing.project.entity.Customer;
import com.hanqing.project.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 客户表 前端控制器
 * </p>
 *
 * @author 含情
 * @since 2021-03-24
 */
@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private ICustomerService iCustomerService;
    @ResponseBody
    @RequestMapping("list")
    public R<Map<String,Object>> queryList(String realName , String phone, Long page, Long limit){
        LambdaQueryWrapper<Customer> wrapper = Wrappers.<Customer>lambdaQuery().like(StringUtils.isNotBlank(realName), Customer::getRealName, realName);
        Page<Customer> page1 = iCustomerService.page(new Page<>(page, limit), wrapper);
        HashMap<String, Object> data = new HashMap<>();
        data.put("totale",page1.getTotal());
        data.put("recodes",page1.getRecords());
        return R.ok(data);
    }
}
