package com.example.javafx1;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class testBMI {
    @FXML
    TextField weight;
    @FXML
    TextField height;
    @FXML
    private void getBMI(){
        double bmi;
        bmi = Double.parseDouble(weight.getText()) / Math.pow(Double.parseDouble(height.getText()),2);
        if (bmi < 18){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Underweight");
            alert.show();
        }else if (bmi < 25.0){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Normal");
            alert.show();
        }else if (bmi < 30.0){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Overweight");
            alert.show();
        }else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Obese");
            alert.show();
        }
    }
}
