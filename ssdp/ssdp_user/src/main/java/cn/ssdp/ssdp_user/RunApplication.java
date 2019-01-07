package cn.ssdp.ssdp_user;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class RunApplication 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
