package com.example.lab_docker_compose.service;

import org.springframework.stereotype.Service;

@Service
public class DockerAppService {

    public String testApp() {
        return "App is working!";
    }
}