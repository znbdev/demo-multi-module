package com.example.demo.core.service;

import com.example.demo.core.properties.AppProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AppService {
    private final AppProperties appProperties;

    public String getAppInfo() {
        return "app name: " + appProperties.getAppName() + " environment: " + appProperties.getEnv() + " port: " +  appProperties.getPort();
    }

}
