package com.example.javafx1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class SumAge {
    @FXML
    TextField year;
    @FXML
    protected void caculateAge() {
        int now = 2023;
        int age = now - Integer.parseInt(year.getText());
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Tuoi ban la: " + age);
        alert.show();
    }
} 
