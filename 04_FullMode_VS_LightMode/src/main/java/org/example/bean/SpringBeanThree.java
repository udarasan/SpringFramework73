package org.example.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanThree {
    //light mode
    @Bean
    public SpringBeanOne springBeanOne(){
        //inter-bean dependency - not satisfied
        SpringBeanTwo springBeanTwo1 = springBeanTwo();
        SpringBeanTwo springBeanTwo2 = springBeanTwo();
        System.out.println(springBeanTwo1);
        System.out.println(springBeanTwo2);
        return new SpringBeanOne();
    }
    @Bean
    public SpringBeanTwo springBeanTwo(){
        return new SpringBeanTwo();
    }
}
