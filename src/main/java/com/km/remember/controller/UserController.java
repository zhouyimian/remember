package com.km.remember.controller;

import com.km.remember.domain.User;
import com.km.remember.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@Api
@Controller
@RequestMapping("/users")
@CrossOrigin
public class UserController {

    @Autowired
    UserService userService;

    @ResponseBody
    @GetMapping(value = "/login/{username}/{password}")
    @ApiOperation(value="输入用户名和密码进行登录", notes="当数据库成功查询到对象后，返回该对象，否则返回null")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="path", name = "username", value = "用户名", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="path", name = "password", value = "密码", required = true, dataType = "String")
    })
    public User login(@PathVariable String username,@PathVariable String password) {
        User user = userService.login(username,password);
        return user;
    }

}
