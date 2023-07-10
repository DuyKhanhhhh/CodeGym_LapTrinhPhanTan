package com.example.javafx1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class playTaiXiu {
    @FXML
    TextField tai;
    @FXML
    TextField xiu;
    @FXML
    Label show1;
    @FXML
    Label show2;
    @FXML
    Label xx1;
    @FXML
    Label xx2;
    @FXML
    Label xx3;
    @FXML
    Button monney;
    @FXML
    TextField getMonney;
    private static int TAI = 0;
    private static int XIU = 1;
    private int human;
    private int sumTai;
    private int saveTai = 0;
    private int sumXiu;
    private int saveXiu = 0;
    int saveMonney;
    int napMonney;
    int sumMonney;

    @FXML
    public void buttonTai() {
        this.human = TAI;
    }

    @FXML
    public void buttonXiu() {
        this.human = XIU;
    }

    @FXML
    public void one(ActionEvent event) {
        if (this.human == TAI) {
            saveTai = 1;
            sumTai += saveTai;
            tai.setText("" + sumTai);
        } else {
            saveXiu = 1;
            sumXiu += saveXiu;
            xiu.setText("" + sumXiu);
        }
    }

    @FXML
    public void ten(ActionEvent event) {
        if (this.human == TAI) {
            saveTai = 10;
            sumTai += saveTai;
            tai.setText("" + sumTai);
        } else {
            saveXiu = 10;
            sumXiu += saveXiu;
            xiu.setText("" + sumXiu);
        }
    }

    @FXML
    public void fiveteen(ActionEvent event) {
        if (this.human == TAI) {
            saveTai = 50;
            sumTai += saveTai;
            tai.setText("" + sumTai);
        } else {
            saveXiu = 50;
            sumXiu += saveXiu;
            xiu.setText("" + sumXiu);
        }
    }

    @FXML
    public void onehundred(ActionEvent event) {
        if (this.human == TAI) {
            sumTai = 100;
            sumTai += saveTai;
            tai.setText("" + sumXiu);
        } else {
            saveXiu = 100;            sumXiu += saveXiu;
            xiu.setText("" + sumTai);
        }
    }

    @FXML
    public void fivehundred(ActionEvent event) {
        if (this.human == TAI) {
            saveTai = 500;
            sumTai += saveTai;
            tai.setText("" + sumTai);
        } else {
            saveXiu = 500;
            sumXiu += saveXiu;
            xiu.setText("" + sumXiu);
        }
    }

    @FXML
    public void show() {
        saveMonney = Integer.parseInt(monney.getText());
        if (saveMonney > 0) {
            double rd1 = Math.random() * 6 + 1;
            double rd2 = Math.random() * 6 + 1;
            double rd3 = Math.random() * 6 + 1;
            int saveRandom1 = (int) rd1;
            int saveRandom2 = (int) rd2;
            int saveRandom3 = (int) rd3;
            int sum = saveRandom1 + saveRandom2 + saveRandom3;
            xx1.setText("" + saveRandom1);
            xx2.setText("" + saveRandom2);
            xx3.setText("" + saveRandom3);
            if (sum <= 10) {
                if (human == XIU) {
                    saveMonney += sumXiu;
                    monney.setText("" + saveMonney);
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setContentText("Ăn Tiền: " + sumXiu + "K");
                    alert.setTitle("Thông báo");
                    alert.setHeaderText(null);
                    alert.show();
                } else {
                    saveMonney -= saveTai;
                    monney.setText("" + saveMonney);
                }
                show2.setText("Xỉu");
                show1.setText("");
            } else {
                if (human == TAI) {
                    saveMonney += sumTai;
                    monney.setText("" + saveMonney);
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setContentText("Ăn Tiền: " + sumTai + "K");
                    alert.setTitle("Thông báo");
                    alert.setHeaderText(null);
                    alert.show();
                } else {
                    saveMonney -= sumXiu;
                    monney.setText("" + saveMonney);
                }
                show2.setText("");
                show1.setText("Tài");
            }
        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Thông Báo");
            alert.setHeaderText(null);
            alert.setContentText("Không đủ tiền cược!");
            alert.show();
        }
        tai.setText("");
        xiu.setText("");
        sumTai = 0;
        sumXiu = 0;
    }

    @FXML
    public void allIn() {
        if (this.human == TAI) {
            saveTai = saveMonney;
            sumTai += saveTai;
            tai.setText("" + sumTai);
        } else {
            saveXiu = saveMonney;
            sumXiu += saveXiu;
            xiu.setText("" + sumXiu);
        }
    }

    @FXML
    public void delete() {
        xx1.setText("");
        xx2.setText("");
        xx3.setText("");
        show1.setText("");
        show2.setText("");
        tai.setText("");
        xiu.setText("");
        sumXiu = 0;
        sumTai = 0;
    }

    @FXML
    public void submit() {
        saveMonney = Integer.parseInt(monney.getText());
        napMonney = Integer.parseInt(getMonney.getText());
        sumMonney = saveMonney + napMonney;
        monney.setText("" + sumMonney);
        getMonney.setText("");
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Nạp Thành Công");
        alert.setTitle("Thông báo");
        alert.setHeaderText(null);
        alert.show();
    }
}
