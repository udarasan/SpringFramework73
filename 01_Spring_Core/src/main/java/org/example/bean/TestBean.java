package org.example.bean;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("exampleBean")
@Scope("prototype")
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TestBean {
    public  TestBean() {
        System.out.println("TestBean is created");
    }
    public void printMessage() {
        System.out.println("printMessage method called");
    }
}

/*
AppConfig is created
SpringBean is created
NewTestBean is called
MyConnection is created
Bean : org.example.bean.SpringBean@2a4fb17b
TestBean is created
Bean : org.example.bean.TestBean@4d5d943d
TestBean is created
Bean : org.example.bean.TestBean@368f2016
TestBean is created
Bean : org.example.bean.TestBean@4c583ecf
MyConnection : org.example.bean.MyConnection@692f203f
MyConnection : org.example.bean.MyConnection@692f203f*/

/*
AppConfig is created
SpringBean is created
TestBean is created
NewTestBean is called
MyConnection is created
Bean : org.example.bean.SpringBean@74f0ea28
Bean : org.example.bean.TestBean@351d00c0
Bean : org.example.bean.TestBean@351d00c0
Bean : org.example.bean.TestBean@351d00c0
MyConnection : org.example.bean.MyConnection@2a3b5b47
MyConnection : org.example.bean.MyConnection@2a3b5b47*/
