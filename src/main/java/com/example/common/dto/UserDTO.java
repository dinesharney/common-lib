package com.example.common.dto;

import lombok.Data;

import java.util.UUID;

/**
 * DTO classes for API communication.
 */
@Data
public class UserDTO {
    private UUID id;
    private String name;
    private String email;
    private String detail;

    // Getters and setters
}
