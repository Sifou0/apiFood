package com.application.model;

import lombok.Data;

@Data
public class ApiResponse {
    private String product;

    private String code;

    private boolean status;

    private String statusVerbose;
}
