package com.example.javafx2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class controler_TracNhiem {
    @FXML
    protected RadioButton radioButton1A, radioButton1B, radioButton1C, radioButton1D, radioButton2A, radioButton2B, radioButton2C, radioButton2D;
    @FXML
    ToggleGroup ToggleGroup1;
    @FXML
    ToggleGroup ToggleGroup2;
    @FXML
    public void click(ActionEvent event){
        radioButton1A.setToggleGroup(ToggleGroup1);
        radioButton1B.setToggleGroup(ToggleGroup1);
        radioButton1C.setToggleGroup(ToggleGroup1);
        radioButton1D.setToggleGroup(ToggleGroup1);

        radioButton2A.setToggleGroup(ToggleGroup2);
        radioButton2B.setToggleGroup(ToggleGroup2);
        radioButton2C.setToggleGroup(ToggleGroup2);
        radioButton2D.setToggleGroup(ToggleGroup2);

        if (radioButton2B.isSelected()){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Câu 2:Đúng Thì Thấp Ngồi Thì Cao");
            alert.setContentText("Đáp Án B là đúng");
            alert.show();
        }else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Câu 2:Đúng Thì Thấp Ngồi Thì Cao");
            alert.setContentText("Sai");
            alert.show();
        }

        if (radioButton1D.isSelected()){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Câu 1:Súc Vật Có Mấy Chân");
            alert.setContentText("Đáp Án D là đúng");
            alert.show();
        }else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Câu 1:Súc Vật Có Mấy Chân");
            alert.setContentText("Sai");
            alert.show();
        }
    }
}
