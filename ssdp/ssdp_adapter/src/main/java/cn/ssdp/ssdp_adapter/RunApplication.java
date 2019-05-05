package cn.ssdp.ssdp_adapter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * ssdp_core核心组件
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
