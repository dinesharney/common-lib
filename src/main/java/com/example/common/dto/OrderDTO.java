package com.example.common.dto;

import lombok.Data;

/**
 * DTO classes for API communication.
 */
@Data
public class OrderDTO {
    private Long id;
    private String product;
    private Double price;
    private String detail;

    // Getters and setters
}
