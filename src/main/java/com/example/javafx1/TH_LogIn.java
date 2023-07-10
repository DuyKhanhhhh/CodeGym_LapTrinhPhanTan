package com.example.javafx1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class TH_LogIn extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader  = new FXMLLoader(TH_LogIn.class.getResource("login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 300, 400);
        primaryStage.setTitle("Duy Khanh");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void login(ActionEvent actionEvent) {
        
    }
}
