package cn.ssdp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class TestConfiguration {

	@Bean
    @Profile("dev")
    public Runnable test1() {
        System.out.println("开发环境使用的 Bean");
        return () -> {};
    }
    
    @Bean
    @Profile("pro")
    public Runnable test3() {
        System.out.println("生产环境使用的 Bean");
        return () -> {};
    }
}
