package com.example.demo.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Template {
    @Id
    private Long id;
    private String seriesNumber;
    private String producer;
    private Double price;
    private Integer restCount;
}
