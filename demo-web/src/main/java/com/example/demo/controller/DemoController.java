package com.example.demo.controller;


import com.example.demo.controller.dto.ItemDto;
import com.example.demo.service.AppService;
import com.example.demo.service.MyService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
@ComponentScan
@Controller
@RequestMapping("")
public class DemoController {
    private final AppService appService;

    @GetMapping(value = {"i18n"})
    public String i18n(Model model) {
        String appInfo = appService.getAppInfo();
        model.addAttribute("message", appInfo);
        model.addAttribute("date", LocalDateTime.of(2018, 4, 13, 11, 12, 13));
        List<ItemDto> items = Arrays.asList(
                ItemDto.of(1L, "Item1", 10, LocalDateTime.now()),
                ItemDto.of(2L, "Item2", 30, LocalDateTime.now()),
                ItemDto.of(3L, "Item3", 10, LocalDateTime.now()),
                ItemDto.of(4L, "Item4", 40, LocalDateTime.now()));
        model.addAttribute("items", items);
        return "i18n";
    }
}
