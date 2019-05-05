package cn.ssdp.ssdp_user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.ssdp.ssdp_core.common.CommonResultInfo;
import cn.ssdp.ssdp_user.entity.MUserInfoEntity;
import cn.ssdp.ssdp_user.service.UserInfoService;

@RestController
public class UserLoginController {

	@GetMapping("/hello/{userName}")
	@ResponseBody
	public String TestClient(@PathVariable String userName) {
		return "client test scuess:"+userName;
	}
	
	@Autowired
	private UserInfoService userInfoService;
	
	@GetMapping("/getUserInfoList")
	public CommonResultInfo<MUserInfoEntity> getUserInfoList(
			@RequestBody MUserInfoEntity muserInfoEntity,
			@RequestParam(defaultValue = "1") int pageNumber,
            @RequestParam(defaultValue="20") int pageSize){
		CommonResultInfo<MUserInfoEntity> result = userInfoService.getUserInfoList(muserInfoEntity,pageNumber,pageSize);
		return result;
	}
	
	@GetMapping("/getUserInfo/{userId}")
	public CommonResultInfo<MUserInfoEntity> getUserInfo(@PathVariable String userId){
		CommonResultInfo<MUserInfoEntity> result = userInfoService.getUserInfo(userId);
		return result;
	}
}
