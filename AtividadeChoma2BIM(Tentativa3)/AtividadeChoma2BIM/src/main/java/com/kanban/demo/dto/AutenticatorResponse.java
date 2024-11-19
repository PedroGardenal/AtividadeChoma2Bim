package com.kanban.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AutenticatorResponse {
    private String token;
}