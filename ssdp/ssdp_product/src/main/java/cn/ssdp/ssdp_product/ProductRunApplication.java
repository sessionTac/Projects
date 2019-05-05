package cn.ssdp.ssdp_product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import cn.ssdp.ssdp_product.ProductRunApplication;

/**
 * PRODUCT-model
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class ProductRunApplication 
{
    public static void main( String[] args )
    {
        
        SpringApplication.run(ProductRunApplication.class, args);
        System.out.println( "ssdp_product is started." );
    }
}
