package com.example.javafx1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class TH_SumAge extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(TH_SumAge.class.getResource("layout_age.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 360);
        primaryStage.setTitle("Helllo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
