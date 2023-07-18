package com.example.javafx2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("student_list.fxml"));
        VBox root = loader.load();
        StudentListController controller = loader.getController();
        controller.getListView().getItems().addAll(
                new Student(1, "Khanh", 19),
        new Student(2, "Khanh", 20),
        new Student(3, "Khanh", 24),
        new Student(3, "Khanh", 24),
        new Student(3, "Khanh", 24)
        );
        primaryStage.setTitle("Helloo");
        primaryStage.setScene(new Scene(root, 200, 300));
        primaryStage.show();
        }
    }




