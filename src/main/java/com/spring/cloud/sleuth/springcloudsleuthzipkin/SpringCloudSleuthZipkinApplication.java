package com.spring.cloud.sleuth.springcloudsleuthzipkin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class SpringCloudSleuthZipkinApplication {
    private static final Logger log = LoggerFactory.getLogger(SpringCloudSleuthZipkinApplication.class);

    @Autowired
    private RestTemplate template;

    @GetMapping("/test-point-one")
    public String testMethod1() {
        log.info("demo-application service called....");
        return "Call has been successful";
    }

    @GetMapping("/test-point-two")
    public String testMethod2() {
        log.info("Spring cloud sleuth zipkin demo application is called....");
        return template.getForObject("http://localhost:8080/test-point-one", String.class);
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudSleuthZipkinApplication.class, args);
    }

}
