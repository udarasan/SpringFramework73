package org.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = "org.example.bean")
@Import({AppConfigOne.class,AppConfigTwo.class})
@ImportResource("classpath:hibernate.cfg.xml")
//@ImportResource("file:C:/config/hibernate.cfg.xml")
public class AppConfig {
    public AppConfig() {
        System.out.println("AppConfig Constructor");
    }
}
