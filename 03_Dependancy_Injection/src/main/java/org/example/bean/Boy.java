package org.example.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Boy {

    @Autowired
    Girl girl;

    public Boy(){
        System.out.println("Boy object created");
    }
    public void chatWithGirl() {
        girl.chat();
    }

}
