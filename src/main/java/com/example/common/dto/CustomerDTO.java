package com.example.common.dto;

import lombok.Data;

/**
 * DTO classes for API communication.
 */
@Data
public class CustomerDTO {
    private Long id;
    private String name;
    private String email;
    private String detail;

    // Getters and setters
}
