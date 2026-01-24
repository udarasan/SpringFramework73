package org.example;

import org.example.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;
import java.util.Properties;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
        //_________Environment Variables__________//

        //System variables - OS Related
/*        Map<String,String> systemVariables =System.getenv();
        for(String name : systemVariables.keySet()) {
            System.out.println(name+": "+systemVariables.get(name));
        }*/
        //Java properties - Java Language Related
       /* Properties properties=System.getProperties();
        for(Object key : properties.keySet()) {
            System.out.println(key+": "+properties.get(key));
        }*/
        //Resource bundles (.env,.properties,.yml,.yaml) - Application Related

        context.registerShutdownHook();
    }
}