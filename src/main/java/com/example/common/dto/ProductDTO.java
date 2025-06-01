package com.example.common.dto;

import lombok.Data;

import java.util.UUID;

/**
 * DTO classes for API communication.
 */
@Data
public class ProductDTO {
    private UUID id;
    private String name;
    private Double price;
    private String detail;

    // Getters and setters
}
