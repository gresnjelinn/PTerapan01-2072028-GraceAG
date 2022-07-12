package com.example.pt0120720282;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    public TextField canvas;
    public Button seven;
    public Button eight;
    public Button nine;
    public Button divideButton;
    public Button four;
    public Button five;
    public Button six;
    public Button multiplyButton;
    public Button one;
    public Button two;
    public Button three;
    public Button minusButton;
    public Button clearButton;
    public Button zero;
    public Button resultButton;
    public Button plusButton;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    String operation = "";
    int number1;
    int number2;

    public void clearCanvas(ActionEvent actionEvent) {
        canvas.setText("");
    }

    public void number(ActionEvent actionEvent) {
        String clickedNumber = ((Button)actionEvent.getSource()).getText();
        canvas.setText(canvas.getText() + clickedNumber);
    }

    public void operation(ActionEvent actionEvent) {
        String clickedOperation = ((Button)actionEvent.getSource()).getText();
        if (!clickedOperation.equals("=")) {
            if(!operation.equals("")) {
                return;
            }
            operation = clickedOperation;
            number1 = Integer.parseInt(canvas.getText());
            canvas.setText("");
        } else {
            if(operation.equals("")) {
                return;
            }
            number2 = Integer.parseInt(canvas.getText());
            calculate(number1, number2, operation);
            operation = "";
        }
    }

    public void calculate(int number1, int number2, String operation) {
        switch(operation) {
            case "+":
                canvas.setText(number1 + number2 + "");
                break;
            case "-":
                canvas.setText(number1 - number2 + "");
                break;
            case "*":
                canvas.setText(number1 * number2 + "");
                break;
            case "/":
                canvas.setText(number1 / number2 + "");
                break;
        }
    }
}