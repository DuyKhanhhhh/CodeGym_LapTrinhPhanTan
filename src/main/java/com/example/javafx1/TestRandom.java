package com.example.javafx1;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class TestRandom {
    @FXML
    TextField number;
    @FXML
    private void submit(){
        double nb = Math.random() * 10;
        if (Integer.parseInt(number.getText()) == (int) nb){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("True");
            alert.show();
        }else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setContentText("False");
            alert.show();
        }
    }
}
