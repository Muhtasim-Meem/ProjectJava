package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class WithdrawController {
    @FXML
    private TextField accountNumberField;
    @FXML
    private TextField amountField;
    @FXML
    private Label statusLabel;

    @FXML
    private void handleWithdraw() {
        // Handle withdraw logic
        String accNum = accountNumberField.getText();
        double amount = Double.parseDouble(amountField.getText());
        try {
            Main.bank.withdraw(accNum, amount);
            statusLabel.setText("Withdrawal successful!");
        } catch (Exception e) {
            statusLabel.setText("Error: " + e.getMessage());
        }
    }
}
