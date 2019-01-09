package cn.ssdp.ssdp_user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * ssdp_user模块
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class RunApplication 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(RunApplication.class, args);
    }
}
