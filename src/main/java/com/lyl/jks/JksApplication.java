package com.lyl.jks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class JksApplication {

    public static void main(String[] args) {
        SpringApplication.run(JksApplication.class, args);
    }

    @ResponseBody
    @GetMapping("/test/jks")
    public Integer test(){
        return 1;
    }

    @ResponseBody
    @GetMapping("/test/version")
    public String testVersion(){
        return "1.1.0";
    }

}
