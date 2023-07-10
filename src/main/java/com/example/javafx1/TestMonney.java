package com.example.javafx1;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class TestMonney {
    @FXML
    TextField vnd;
    @FXML
    TextField usd;
    public void sumVND(){
        int usd = 23000;
        int sum = Integer.parseInt(vnd.getText()) * usd;
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("USD= " + String.valueOf(sum));
        alert.show();
    }
}
