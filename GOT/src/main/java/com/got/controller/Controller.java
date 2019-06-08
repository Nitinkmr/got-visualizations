package com.got.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.got.util.Util;

@RestController
public class Controller {


    private static final Logger log = LoggerFactory.getLogger(Controller.class);
    
    @Autowired
    Util util;

    @Bean
    RestTemplate restTemplate()
    {
    	return new RestTemplate();
    }
    
    @GetMapping("/")
    public String temp()
    {
        log.info("request");
        
        String res = util.hitRequest("http://localhost:9090/api/v1/get-tweets",
                null,String.class,null, HttpMethod.GET);
        return res;
    }

}
