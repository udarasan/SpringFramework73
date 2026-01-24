package org.example;

import org.example.bean.Boy;
import org.example.config.AppConfig;
import org.example.di.TestOne;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
       AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
       context.register(AppConfig.class);
       context.refresh();

       TestOne testOne=context.getBean(TestOne.class);
       testOne.chatWithTestTwo();

       context.registerShutdownHook();
    }
}