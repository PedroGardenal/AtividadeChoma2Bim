package com.kanban.demo.dto;

import lombok.Data;

@Data
public class RegisterRequest {
    private String username;
    private String password;
    private String role;

    public String getUsername() {
        this.username = username;
        return username;
    }

    public String getRole() {
        this.role = role;
        return role;
    }

    public CharSequence getPassword() {
        this.password = password;
        return password;
    }
}