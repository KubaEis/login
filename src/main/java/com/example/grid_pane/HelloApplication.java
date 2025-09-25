package com.example.grid_pane;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.io.IOException;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        GridPane root = new GridPane();
        Label lbl = new Label("Label1");
        Label lbl2 = new Label("Label2");
        Button btn = new Button("Button");
        root.add(lbl, 0, 0);
        root.add(lbl2, 1, 1);
        root.add(btn, 0, 1);
        Scene scene = new Scene(root , 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}