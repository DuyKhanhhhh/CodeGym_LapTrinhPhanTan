package com.example.javafx1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class BT_Caculate extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(BT_Caculate.class.getResource("layoutCasino.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 500);
        primaryStage.setTitle("CasinoFX570!");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
