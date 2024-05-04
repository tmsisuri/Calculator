package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HelloController {
//    @FXML
//    private Label welcomeText;
//
//    @FXML
//    protected void onHelloButtonClick() {
//        welcomeText.setText("Welcome to JavaFX Application!");
//    }
    String operator;
    double numberOne;
    double numberTwo;


    @FXML
    private TextField txtDisplay;

    @FXML
    void clickGeneralButton(ActionEvent event) {
        operator = ((Button)event.getSource()).getText();
        if(txtDisplay.getText().length()!=0) {
            numberOne = Double.parseDouble(txtDisplay.getText());
        }

        switch (operator) {
            case "+/-" :
                txtDisplay.setText(String.valueOf(Integer.parseInt(txtDisplay.getText())*(-1)));
                break;
            default :
                txtDisplay.setText("");
                break;
        }
    }

    @FXML
    void clickNumbers(ActionEvent event) {
        String newTextValue = txtDisplay.getText() + ((Button)event.getSource()).getText();
        txtDisplay.setText(newTextValue);
    }

    @FXML
    void clickPeriodic(ActionEvent event) {
        String textValue = txtDisplay.getText();
        if((!textValue.contains(".")) && (!textValue.isEmpty())) {
            txtDisplay.setText(textValue + ".");
        }
    }

    @FXML
    void clickEqlButton(ActionEvent event) {
        //getting number part two
        numberTwo = Double.parseDouble(txtDisplay.getText());
        double result = 0;
        //doing mathematical operations
        switch (operator) {
            case "+" :
                result = numberOne + numberTwo;
                break;
            case "-" :
                result = numberOne - numberTwo;
                break;
            case "*" :
                result = numberOne * numberTwo;
                break;
            case "/" :
                result = numberOne / numberTwo;
                break;
            case "%" :
                result = numberOne % numberTwo;
                break;
        }
        //setting the final result to the display
        txtDisplay.setText(String.valueOf(result));
    }
}