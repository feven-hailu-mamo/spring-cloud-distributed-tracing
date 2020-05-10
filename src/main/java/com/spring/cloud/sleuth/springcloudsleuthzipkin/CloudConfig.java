package com.spring.cloud.sleuth.springcloudsleuthzipkin;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;

@Configuration
public class CloudConfig {

    @Bean
    public RestTemplate template() {
        return new RestTemplate();
    }

    @Bean
    public AlwaysSampler defaultSampler() {
        return new AlwaysSampler();
    }

}
