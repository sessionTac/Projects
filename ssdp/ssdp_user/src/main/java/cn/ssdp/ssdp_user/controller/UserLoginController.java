package cn.ssdp.ssdp_user.controller;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Configuration
public class UserLoginController {

    /*
    @LoadBalanced：该RestTemplate具有负载均衡的功能
     */
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @GetMapping("/hello/{userId}")
	@ResponseBody
	public String TestClient(@PathVariable Integer userId) {
        RestTemplate restTemplate = getRestTemplate();
        String json = restTemplate.getForObject("http://ssdpCore/select/"+String.valueOf(userId), String.class);
        return json;
	}
}
