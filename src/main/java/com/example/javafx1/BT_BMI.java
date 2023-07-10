package com.example.javafx1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class BT_BMI extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(BT_BMI.class.getResource("layou_BMI.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 500);
        primaryStage.setTitle("BMI");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
