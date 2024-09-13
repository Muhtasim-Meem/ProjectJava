package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class MainController {
    @FXML
    private VBox mainVBox;
    @FXML
    private Button depositButton;
    @FXML
    private Button withdrawButton;
    @FXML
    private Button transferButton;
    @FXML
    private Button transactionHistoryButton;
    @FXML
    private Button accountManagementButton;
    @FXML
    private Label statusLabel;

    @FXML
    private void handleDeposit() {
        // Switch to Deposit view
    }

    @FXML
    private void handleWithdraw() {
        // Switch to Withdraw view
    }

    @FXML
    private void handleTransfer() {
        // Switch to Transfer view
    }

    @FXML
    private void handleTransactionHistory() {
        // Switch to Transaction History view
    }

    @FXML
    private void handleAccountManagement() {
        // Switch to Account Management view
    }
}
