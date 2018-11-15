package com.bscllc.frontend.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.time.Instant;

@RestController
public class Webbie {

    @RequestMapping(path = "/")
    public String root() {
        return "Hi, Ed";
    }

    @RequestMapping(path = "/getTime")
    public String getTime() {
        return "The current time: " + Instant.now();
    }

    @RequestMapping(path="/health")
    public String health() {
        return "Good health: " + Instant.now();
    }


    @RequestMapping(path="nginx")
    public String nginx() {
        String contents = "";

        RestTemplate restTemplate = new RestTemplate();
        contents = restTemplate.getForObject("http://nginx/", String.class);


        return contents;
    }
}
