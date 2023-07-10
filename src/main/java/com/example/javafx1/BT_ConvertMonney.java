package com.example.javafx1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class BT_ConvertMonney extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(BT_ConvertMonney.class.getResource("conver_monney.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 300);
        primaryStage.setTitle("Conver Monney");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
