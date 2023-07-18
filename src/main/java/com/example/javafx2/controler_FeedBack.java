package com.example.javafx2;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class controler_FeedBack {
    @FXML
    private RadioButton radioButton1A, radioButton1B, radioButton1C, radioButton2A, radioButton2B, radioButton2C, radioButton3A, radioButton3B, radioButton3C;
    @FXML
    private ToggleGroup ToggleGroup1, ToggleGroup2, ToggleGroup3;

    private File file = new File("/home/titdzvl/IdeaProjects/JavaFx2/src/main/java//data.txt");


    @FXML
    public void submit() throws IOException {
        radioButton1A.setToggleGroup(ToggleGroup1);
        radioButton1B.setToggleGroup(ToggleGroup1);
        radioButton1C.setToggleGroup(ToggleGroup1);

        radioButton2A.setToggleGroup(ToggleGroup2);
        radioButton2B.setToggleGroup(ToggleGroup2);
        radioButton2C.setToggleGroup(ToggleGroup2);

        radioButton3A.setToggleGroup(ToggleGroup3);
        radioButton3B.setToggleGroup(ToggleGroup3);
        radioButton3C.setToggleGroup(ToggleGroup3);

        FileWriter fileWriter = new FileWriter(file);

        if (radioButton1A.isSelected()) {
            fileWriter.write(radioButton1A.getText() + "\n");
            fileWriter.flush();
        } else if (radioButton1B.isSelected()) {
            fileWriter.write(radioButton1B.getText() + "\n");
            fileWriter.flush();
        } else {
            fileWriter.write(radioButton1C.getText() + "\n");
            fileWriter.flush();
        }

        if (radioButton2A.isSelected()) {
            fileWriter.write(radioButton2A.getText() + "\n");
            fileWriter.flush();

        } else if (radioButton2B.isSelected()) {
            fileWriter.write(radioButton2B  .getText() + "\n");
            fileWriter.flush();

        } else {
            fileWriter.write(radioButton2C.getText() + "\n");
            fileWriter.flush();

        }

        if (radioButton3A.isSelected()) {
            fileWriter.write(radioButton3A.getText() + "\n");
            fileWriter.flush();


        } else if (radioButton3B.isSelected()) {
            fileWriter.write(radioButton3C.getText() + "\n");
            fileWriter.flush();
        } else {
            fileWriter.write(radioButton3C.getText() + "\n");
            fileWriter.flush();
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Thông Báo");
        alert.setContentText("Cảm ơn đã đánh giá");
        alert.setHeaderText(null);
        alert.show();
    }
}
