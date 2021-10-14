package com.api.web.web_api.repository;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;


@Configuration
@ConfigurationProperties(prefix = "com.api.web.web_api")
@Data
public class CustomProperties {

    private String apiUrl;

}