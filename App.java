package com.colorchange;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        Circle circle = new Circle(100, Color.WHITE);

        circle.setOnMousePressed((MouseEvent event) -> {
            circle.setFill(Color.BLACK);
        });

        circle.setOnMouseReleased((MouseEvent event) -> {
            circle.setFill(Color.WHITE);
        });

        StackPane root = new StackPane();
        root.getChildren().add(circle);

        Scene scene = new Scene(root, 300, 300);

        primaryStage.setTitle("Change Color on Mouse Click");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
