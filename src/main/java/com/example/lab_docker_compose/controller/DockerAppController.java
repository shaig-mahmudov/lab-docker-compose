package com.example.lab_docker_compose.controller;

import com.example.lab_docker_compose.service.DockerAppService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/app-test")
public class DockerAppController {

    private final DockerAppService service;

    public DockerAppController(DockerAppService service) {
        this.service = service;
    }

    @GetMapping
    public String test() {
        return service.testApp();
    }

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }
}