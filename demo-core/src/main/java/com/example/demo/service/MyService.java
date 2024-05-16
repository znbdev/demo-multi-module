package com.example.demo.service;

import com.example.demo.properties.ServiceProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
@EnableConfigurationProperties(ServiceProperties.class)
public class MyService {

    private final ServiceProperties serviceProperties;

    public String message() {
        return this.serviceProperties.getMessage();
    }
}
