package com.example.javafx1;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class TestLogin {
    @FXML
    TextField username;
    @FXML
    PasswordField password;
    @FXML
    protected void login(){
        String username = this.username.getText();
        String password = this.password.getText();

        if (username.equals("khanh")&&password.equals("khanh")){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Dang nhap thanh cong");
            alert.show();
        }else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Khong dang nhap duoc");
            alert.show();
        }
    }

}
