package com.bscllc.frontend;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
public class MyApplication {

    public static Logger log = LoggerFactory.getLogger(MyApplication.class);

    public static void main(String... args) {

//        log.info("*********** HI ED **************");
//
//        try {
//            TimeUnit.MINUTES.sleep(5);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        ConfigurableApplicationContext context =
                SpringApplication.run(MyApplication.class, args);


        ConfigurableEnvironment env = context.getEnvironment();

        log.warn("Host: " + env.getProperty("spring.cloud.consul.host"));
        log.warn("Port: " + env.getProperty("spring.cloud.consul.port"));
    }
}
