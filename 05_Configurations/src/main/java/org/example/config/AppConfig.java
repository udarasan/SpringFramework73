package org.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "org.example.bean")
@Import({AppConfigOne.class,AppConfigTwo.class})
public class AppConfig {
    public AppConfig() {
        System.out.println("AppConfig Constructor");
    }
}
