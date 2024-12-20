package es.localchat.component.message.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/chat/local")
public class LocalChatController {

    @Value("${spring.application.name}")
    private String appName;

    @GetMapping
    public String helloWorld() {
        return "helloWorld() " + appName;
    }

    @GetMapping("/test")
    public String test() {
        return "test() " + appName;
    }
}
