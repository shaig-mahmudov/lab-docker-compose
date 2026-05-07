package com.example.lab_docker_compose.service;

import com.example.lab_docker_compose.entity.DockerAppEntity;
import com.example.lab_docker_compose.repository.DockerAppRepository;
import org.springframework.stereotype.Service;

@Service
public class DockerDbService {

    private final DockerAppRepository repository;

    public DockerDbService(DockerAppRepository repository) {
        this.repository = repository;
    }

    public String saveTestData() {
        DockerAppEntity entity = new DockerAppEntity();
        entity.setName("Docker Test");

        repository.save(entity);

        return "Saved to DB";
    }
}