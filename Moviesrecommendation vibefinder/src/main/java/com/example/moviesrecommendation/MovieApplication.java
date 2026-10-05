package com.example.moviesrecommendation;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.WritableImage;
import javafx.stage.Stage;

import java.io.IOException;

public class MovieApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MovieApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);

        // Get the controller and pass the HostServices
        HelloController controller = fxmlLoader.getController();
        controller.setHostServices(getHostServices());

        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
        
        // Set the Window Title without the emoji
        stage.setTitle("Movie Recommender");

        // Set a transparent icon to "remove" the default Java icon
        stage.getIcons().add(new WritableImage(1, 1));

        stage.setScene(scene);
        stage.show();
    }
}