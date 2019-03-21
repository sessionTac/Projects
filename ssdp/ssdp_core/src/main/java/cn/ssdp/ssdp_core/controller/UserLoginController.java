package cn.ssdp.ssdp_core.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import cn.ssdp.ssdp_core.entity.UserInfoEntity;

@RestController
public class UserLoginController {

    @GetMapping("/select/{userId}")
    public UserInfoEntity call(@PathVariable Integer userId){
    	UserInfoEntity userInfo = new UserInfoEntity();
    	userInfo.setUserID(userId);
    	userInfo.setUserName("张三");
    	userInfo.setPassWord("AAA");

        return userInfo;
    }
}
