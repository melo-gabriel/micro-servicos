package com.gabriel.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabriel.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
