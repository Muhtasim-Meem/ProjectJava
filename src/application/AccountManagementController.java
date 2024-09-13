package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class AccountManagementController {
    @FXML
    private VBox accountVBox;
    @FXML
    private TextField nameField;
    @FXML
    private TextField nidField;
    @FXML
    private TextField balanceField;
    @FXML
    private Label statusLabel;

    @FXML
    private void handleCreateAccount() {
        // Handle account creation logic
        String name = nameField.getText();
        String nid = nidField.getText();
        double balance = Double.parseDouble(balanceField.getText());
        try {
            Main.bank.createAccount(name, nid, balance);
            statusLabel.setText("Account created successfully!");
        } catch (Exception e) {
            statusLabel.setText("Error: " + e.getMessage());
        }
    }
}
