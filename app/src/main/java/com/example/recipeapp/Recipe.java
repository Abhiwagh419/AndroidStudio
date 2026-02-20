package com.example.recipeapp;

public class Recipe {

    String name;
    String description;

    public Recipe(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}