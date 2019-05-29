package com.eureka.client.controlle;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@PropertySource({"classpath:application.properties"})
@RestController
public class UserController {
    @Value("${spring.profiles.active}")
    private String activeName;

    @GetMapping("/getActiveName")
    private String getActiveName(){
        return activeName;
    }
}
