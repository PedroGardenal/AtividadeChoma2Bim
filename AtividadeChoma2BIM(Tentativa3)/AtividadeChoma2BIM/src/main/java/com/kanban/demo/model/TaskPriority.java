package com.kanban.demo.model;

public enum TaskPriority {
    LOW("1"),
    MEDIUM("2"),
    HIGH("3");

    private final String description;

    TaskPriority(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
