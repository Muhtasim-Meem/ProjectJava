package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import banking.Bank;
import banking.InvalidAccountException;

public class BusinessAccountController {

    @FXML
    private VBox businessAccountVBox;
    @FXML
    private TextField nameField;
    @FXML
    private TextField nidField;
    @FXML
    private TextField balanceField;
    @FXML
    private TextField tradeLicenseField;
    @FXML
    private Button createAccountButton;
    @FXML
    private Label statusLabel;

    private Bank bank;
    private Stage stage;

    // Method to initialize the Bank instance
    public void setBank(Bank bank) {
        this.bank = bank;
    }

    // Method to set the stage
    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @FXML
    private void handleCreateAccount() {
        String name = nameField.getText();
        String nid = nidField.getText();
        String tradeLicense = tradeLicenseField.getText();
        double balance;

        try {
            balance = Double.parseDouble(balanceField.getText());

            if (name.isEmpty() || nid.isEmpty() || tradeLicense.isEmpty()) {
                statusLabel.setText("All fields must be filled out.");
                return;
            }

            String accNum = bank.addAccount(name, nid, balance, tradeLicense);
            statusLabel.setText("Account created successfully. Account Number: " + accNum);

            // Clear the fields
            nameField.clear();
            nidField.clear();
            balanceField.clear();
            tradeLicenseField.clear();

        } catch (NumberFormatException e) {
            statusLabel.setText("Invalid balance amount.");
        } catch (InvalidAccountException e) {
            statusLabel.setText("Error creating account: " + e.getMessage());
        }
    }
}
