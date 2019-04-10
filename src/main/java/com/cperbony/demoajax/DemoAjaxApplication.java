package com.cperbony.demoajax;

import com.cperbony.demoajax.domain.SocialMetaTag;
import com.cperbony.demoajax.service.SocialMetaTagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoAjaxApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DemoAjaxApplication.class, args);
    }

    @Autowired
    SocialMetaTagService service;

    @Override
    public void run(String... args) throws Exception {

        SocialMetaTag tag = service.getSocialMetaTagByUrl("https://www.udemy.com/spring-boot-mvc-com-thymeleaf/");
//        System.out.println(tag.toString());

    }
}
