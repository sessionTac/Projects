package cn.ssdp.ssdp_user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserLoginController {

	@GetMapping("/hello/{userName}")
	@ResponseBody
	public String TestClient(@PathVariable String userName) {
		return "client test scuess:"+userName;
	}
}
