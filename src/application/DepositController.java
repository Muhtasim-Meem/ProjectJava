package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DepositController {
    @FXML
    private TextField accountNumberField;
    @FXML
    private TextField amountField;
    @FXML
    private Label statusLabel;

    @FXML
    private void handleDeposit() {
        // Handle deposit logic
        String accNum = accountNumberField.getText();
        double amount = Double.parseDouble(amountField.getText());
        try {
            Main.bank.deposit(accNum, amount);
            statusLabel.setText("Deposit successful!");
        } catch (Exception e) {
            statusLabel.setText("Error: " + e.getMessage());
        }
    }
}
