package com.hanqing.project.controller;

import com.hanqing.project.entity.Account;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value="用户controller",description="用户操作",tags={"用户操作接口"})
public class SwaggerController {
    @ApiOperation("获取用户信息")
    @GetMapping("/getUserInfo")
    public Account User(@ApiParam(name="id",value="用户id",required=false) Long id){
        Account account = new Account();
        account.setRealName("小明");
        return account;
    }
}
