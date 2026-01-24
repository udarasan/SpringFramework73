package org.example.config;

import org.example.bean.MyConnection;
import org.example.newBeans.NewTestBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.example.bean","org.example.newBeans"})
//@ComponentScan(basePackageClasses =  NewTestBean.class)
public class AppConfig {
    public AppConfig() {
        System.out.println("AppConfig is created");
    }
    @Bean("connection")
    MyConnection yConnection() {
        return new MyConnection();
    }
}
