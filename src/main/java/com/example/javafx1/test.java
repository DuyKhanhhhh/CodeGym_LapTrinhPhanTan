package com.example.javafx1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class test {

    private int result;

    private int tongtienco = 0;

    private int luutienco;

    private int luutiennap;

    @FXML
    private TextField money;

    @FXML
    private Button tien;

    @FXML
    private Label show1;

    @FXML

    private Label show2;
    @FXML
    private Label cau1;

    @FXML
    private Label cau2;
    @FXML
    private Label cau3;


    private double rd1;
    private double rd2;
    private double rd3;

    private int random1;
    private int random2;
    private int random3;

    private int index = 0;

    private String value = "";

    private int sum1 = 0;

    private int save1;

    private int sum2 = 0;

    private int save2;

    private int chooser;

    final static int TAI = 0;
    final static int XIU = 1;
    @FXML
    private TextField tai;
    @FXML
    private TextField xiu;

    private int sosanh = 0;


    @FXML
    public void cuoc1() {
        this.chooser = TAI; 
        sosanh = 15;
    }

    @FXML

    public void cuoc2() {
        this.chooser = XIU;
        sosanh = 7;
    }

    @FXML

    public void one(ActionEvent event) {


        if (this.chooser == TAI) {
            save1 = 1;
            sum1 += save1;
            tai.setText("" + sum1);
        } else {
            save2 = 1;
            sum2 += save2;
            xiu.setText("" + sum2);
        }
    }

    @FXML
    public void five(ActionEvent event) {
        if (this.chooser == TAI) {
            save1 = 5;
            sum1 += save1;
            tai.setText("" + sum1);
        } else {
            save2 = 5;
            sum2 += save2;
            xiu.setText("" + sum2);
        }
    }

    @FXML
    public void ten(ActionEvent event) {
        if (this.chooser == TAI) {
            save1 = 10;
            sum1 += save1;
            tai.setText("" + sum1);
        } else {
            save2 = 10;
            sum2 += save2;
            xiu.setText("" + sum2);
        }
    }

    @FXML
    public void fiveteen(ActionEvent event) {
        if (this.chooser == TAI) {
            save1 = 50;
            sum1 += save1;
            tai.setText("" + sum1);
        } else {
            save2 = 50;
            sum2 += save2;
            xiu.setText("" + sum2);
        }
    }

    @FXML
    public void onehundred(ActionEvent event) {
        if (this.chooser == TAI) {
            save1 = 100;
            sum1 += save1;
            tai.setText("" + sum1);
        } else {
            save2 = 100;
            sum2 += save2;
            xiu.setText("" + sum2);
        }
    }

    @FXML
    public void fivehundred(ActionEvent event) {
        if (this.chooser == TAI) {
            save1 = 500;
            sum1 += save1;
            tai.setText("" + sum1);
        } else {
            save2 = 500;
            sum2 += save2;
            xiu.setText("" + sum2);
        }
    }

    public void confirm(ActionEvent event) {
        luutienco = Integer.parseInt(tien.getText());
        if (luutienco > 0) {
            rd1 = Math.random() * 6 + 1;
            rd2 = Math.random() * 6 + 1;
            rd3 = Math.random() * 6 + 1;
            random1 = (int) rd1;
            random2 = (int) rd2;
            random3 = (int) rd3;
            result = random1 + random2 + random3;
            cau1.setText("" + random1);
            cau2.setText("" + random2);
            cau3.setText("" + random3);
            if (result <= 10) {

                if (this.chooser == XIU) {
                    tongtienco += sum2;
                    tien.setText("" + tongtienco);
                } else {
                    tongtienco -= sum1;
                    tien.setText("" + tongtienco);
                }
                show2.setText("Xỉu");
                show1.setText("");
            } else {

                if (this.chooser == TAI) {
                    tongtienco += sum1;
                    tien.setText("" + tongtienco);
                } else {
                    tongtienco -= sum2;
                    tien.setText("" + tongtienco);
                }
                show2.setText("");
                show1.setText("Tài");
            }
        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Không đủ tiền cược");
            alert.show();
        }
        tai.setText("");
        xiu.setText("");
        sum1 = 0;
        sum2 = 0;
    }

    public void continues(ActionEvent event) {
        cau1.setText("");
        cau2.setText("");
        cau3.setText("");
        show1.setText("");
        show2.setText("");
        tai.setText("");
        xiu.setText("");
    }

    public void xacnhan(ActionEvent event) {
        luutienco = Integer.parseInt(tien.getText());
        luutiennap = Integer.parseInt(money.getText());
        tongtienco = luutienco + luutiennap;
        tien.setText("" + tongtienco);
        money.setText("");
    }

    public void allin(ActionEvent event) {
        if (result <= 10) {
            if (this.chooser == XIU) {
                tongtienco += sum2;
                tien.setText("" + tongtienco);
            } else {
                tongtienco -= sum1;
                tien.setText("" + tongtienco);
            }
            show2.setText("Xỉu");
            show1.setText("");
        } else {
            if (this.chooser == TAI) {
                tongtienco += sum1;
                tien.setText("" + tongtienco);
            } else {
                tongtienco -= sum2;
                tien.setText("" + tongtienco);
            }
            show2.setText("");
            show1.setText("Tài");
        }
        if (this.chooser == TAI) {
            tai.setText("" + tongtienco);
        } else {
            xiu.setText("" + tongtienco);
        }
    }
}
