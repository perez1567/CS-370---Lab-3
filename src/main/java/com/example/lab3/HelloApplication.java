package com.example.lab3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) {

        Pane root = new Pane();
        Scene scene = new Scene(root, 600, 600);

        stage.setTitle("Lab3");
        stage.setScene(scene);
        stage.show();
    }
}
