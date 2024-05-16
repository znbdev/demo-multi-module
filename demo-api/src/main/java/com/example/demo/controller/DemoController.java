package com.example.demo.controller;

import com.example.demo.service.AppService;
import com.example.demo.service.MyService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/demo")
public class DemoController {
    private final AppService appService;
    private final MyService myService;

    @GetMapping("/app/info")
    public String appInfo() {
        return appService.getAppInfo();
    }

    @GetMapping("/msg")
    public String msg() {
        return myService.message();
    }
}
