package com.example.demo.repository;

import com.example.demo.domain.dto.PCDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PCRepository extends JpaRepository<PCDto,Long> {
}
