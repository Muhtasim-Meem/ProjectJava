package application;

import banking.InvalidAccountException;
import banking.Transaction;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class TransactionHistory {
@FXML
TextField accountNumTf;
@FXML
TextField nidTf;
@FXML
ListView<String> lv;
@FXML
Label info;

public void transactionHistroy() {
	String accountNum=accountNumTf.getText();
	String nid=nidTf.getText();
	ObservableList<Transaction> list;
	try {
		list = FXCollections.observableArrayList(Main.bank.getAccTransactions(nid, accountNum));
		for(Transaction t: list)
			lv.getItems().add(t.toString());
	} catch (InvalidAccountException e) {
		info.setText(e.getMessage());
	}
	
}
public void shuvo1() {
	Main.fxml.call("Homepage.fxml");
}
}
