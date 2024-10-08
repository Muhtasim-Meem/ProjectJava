package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TransferController {
    @FXML
    private TextField fromAccountField;
    @FXML
    private TextField toAccountField;
    @FXML
    private TextField amountField;
    @FXML
    private Label statusLabel;

    @FXML
    private void handleTransfer() {
        // Handle transfer logic
        String fromAcc = fromAccountField.getText();
        String toAcc = toAccountField.getText();
        double amount = Double.parseDouble(amountField.getText());
        try {
            Main.bank.transfer(fromAcc, toAcc, amount);
            statusLabel.setText("Transfer successful!");
        } catch (Exception e) {
            statusLabel.setText("Error: " + e.getMessage());
        }
    }
}
