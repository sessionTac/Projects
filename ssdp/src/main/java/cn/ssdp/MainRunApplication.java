package cn.ssdp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 启动主入口
 */
@SpringBootApplication
@EnableEurekaServer
public class MainRunApplication 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(MainRunApplication.class, args);
    }
}
