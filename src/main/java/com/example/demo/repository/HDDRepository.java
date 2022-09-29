package com.example.demo.repository;

import com.example.demo.domain.dto.HDDDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HDDRepository extends JpaRepository<HDDDto,Long> {
}
