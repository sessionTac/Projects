package cn.ssdp.ssdp_eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * ssdp-eurekaserver
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(EurekaServerApplication.class, args);
        System.out.println( "EurekaServer is Start." );
    }
}
