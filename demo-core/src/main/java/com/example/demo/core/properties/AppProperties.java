package com.example.demo.core.properties;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class AppProperties {
    @Value("${spring.application.name}")
    private String appName;
    @Value("${info.env}")
    private String env;
    @Value("${server.port}")
    private String port;
}
