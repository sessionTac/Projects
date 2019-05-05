package cn.ssdp.ssdp_user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * USER-model
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class UserRunApplication 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(UserRunApplication.class, args);
    	System.out.println( "ssdp_user is started." );
    }
}
