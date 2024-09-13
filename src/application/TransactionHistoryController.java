package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;

public class TransactionHistoryController {
    @FXML
    private VBox transactionVBox;
    @FXML
    private Label statusLabel;

    @FXML
    private void initialize() {
        // Display transaction history
        ObservableList<Transaction> transactions = FXCollections.observableArrayList(Main.bank.getAllTransactions());
        for (Transaction transaction : transactions) {
            Label transactionLabel = new Label(transaction.toString());
            transactionVBox.getChildren().add(transactionLabel);
        }
    }
}
