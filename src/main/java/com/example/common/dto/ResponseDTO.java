package com.example.common.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class ResponseDTO {

    private UUID id;
    private String errorMessage;
    private boolean success;
}
