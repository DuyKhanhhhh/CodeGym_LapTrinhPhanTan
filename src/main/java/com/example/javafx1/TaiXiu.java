package com.example.javafx1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class TaiXiu extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(TaiXiu.class.getResource("layout_TaiXiu.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 800);
        primaryStage.setTitle("Tai Xiu");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
