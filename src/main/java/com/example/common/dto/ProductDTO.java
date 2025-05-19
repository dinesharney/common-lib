package com.example.common.dto;

import lombok.Data;

/**
 * DTO classes for API communication.
 */
@Data
public class ProductDTO {
    private Long id;
    private String name;
    private Double price;
    private String detail;

    // Getters and setters
}
