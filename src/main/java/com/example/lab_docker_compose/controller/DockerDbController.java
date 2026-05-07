package com.example.lab_docker_compose.controller;

import com.example.lab_docker_compose.service.DockerDbService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/db-test")
public class DockerDbController {

    private final DockerDbService service;

    public DockerDbController(DockerDbService service) {
        this.service = service;
    }

    @GetMapping
    public String testDb() {
        return service.saveTestData();
    }
}