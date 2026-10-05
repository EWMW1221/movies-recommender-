package com.example.moviesrecommendation;

import javafx.application.Application;

public class HelloApplication {
    public static void main(String[] args) {
        // Redirect to the actual Application class to avoid JavaFX runtime component missing error
        Application.launch(MovieApplication.class, args);
    }
}