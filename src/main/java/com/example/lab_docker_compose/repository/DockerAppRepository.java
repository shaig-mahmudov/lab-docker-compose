package com.example.lab_docker_compose.repository;

import com.example.lab_docker_compose.entity.DockerAppEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DockerAppRepository extends JpaRepository<DockerAppEntity, Long> {
}
