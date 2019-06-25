package cn.teffanic.aigou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServcerApplication7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServcerApplication7001.class,args);
    }
}
