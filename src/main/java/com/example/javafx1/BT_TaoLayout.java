package com.example.javafx1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class BT_TaoLayout extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(BT_TaoLayout.class.getResource("layout.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),1000,800);
        primaryStage.setTitle("Helllo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
