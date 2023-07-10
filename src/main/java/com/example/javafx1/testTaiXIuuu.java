package com.example.javafx1;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class testTaiXIuuu extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader  = new FXMLLoader(testTaiXIuuu.class.getResource("test_layout.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1000, 1000);
        primaryStage.setTitle("Duy Khanh");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
