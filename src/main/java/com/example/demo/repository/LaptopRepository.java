package com.example.demo.repository;

import com.example.demo.domain.dto.LaptopDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepository extends JpaRepository<LaptopDto,Long> {
}
