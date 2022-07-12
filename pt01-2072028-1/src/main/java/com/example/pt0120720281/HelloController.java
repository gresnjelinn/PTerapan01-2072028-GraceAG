package com.example.pt0120720281;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    public TextField bilangan1;
    public TextField bilangan2;
    public TextField hasil;
    public Button divideButton;
    public Button multiplyButton;
    public Button minusButton;
    public Button plusButton;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void countTheResult(ActionEvent actionEvent) {
        int input1 = Integer.parseInt(bilangan1.getText());
        int input2 = Integer.parseInt(bilangan2.getText());
        int result = 0;

        if (actionEvent.getSource() == plusButton) {
            result = input1 + input2;
            hasil.setText(Integer.toString(result));
        }
        if (actionEvent.getSource() == minusButton) {
            result = input1 - input2;
            hasil.setText(Integer.toString(result));
        }
        if (actionEvent.getSource() == multiplyButton) {
            result = input1 * input2;
            hasil.setText(Integer.toString(result));
        }
        if (actionEvent.getSource() == divideButton) {
            result = input1 / input2;
            hasil.setText(Integer.toString(result));
        }

    }
}