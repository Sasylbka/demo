package com.example.demo.repository;

import com.example.demo.domain.dto.MonitorDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonitorRepository extends JpaRepository<MonitorDTO,Long> {
}
