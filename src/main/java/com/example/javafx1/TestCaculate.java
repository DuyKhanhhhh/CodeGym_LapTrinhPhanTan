package com.example.javafx1;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.event.ActionEvent;

public class TestCaculate {
    @FXML
    TextField textField;
    @FXML
    String textSavenumber;
    String firstNumber ="";
    String currentNumber ="";
    String calculationType;
    public void calculationSetup(String calculationType){
        this.calculationType = calculationType;
        firstNumber = currentNumber;
        currentNumber = "";
    }
}
