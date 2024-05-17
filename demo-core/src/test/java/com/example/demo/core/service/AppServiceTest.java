package com.example.demo.core.service;

import com.example.demo.core.properties.AppProperties;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@Slf4j
@SpringBootTest
class AppServiceTest {

    @MockBean
    AppProperties appProperties;

    @Test
    void getAppInfoTest() {
        // expected value
        String expectedAppInfo = "app name: demo-core environment: test port: 8888";

        // Analog Attribute Values
        when(appProperties.getEnv()).thenReturn("test");
        when(appProperties.getAppName()).thenReturn("demo-core");
        when(appProperties.getPort()).thenReturn("8888");

        // Creating the service object to be tested
        AppService appService = new AppService(appProperties);

        // Calling a service method and asserting the result
        String appInfo = appService.getAppInfo();
        log.info("expected: {}, actual: {}" , expectedAppInfo, appInfo);
        assertEquals(expectedAppInfo, appInfo);
    }

    @SpringBootApplication
    static class TestConfiguration {
    }
}
