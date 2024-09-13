package application;

import java.util.ArrayList;

import banking.BankAccount;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class ListOfYourRegisterAccController {
@FXML
TextField nidTf;
@FXML
ListView<String> lv;
@FXML
public void showRegistrarAccount(ActionEvent event) {
	String nid=nidTf.getText();
	ObservableList<BankAccount> list;
	list = FXCollections.observableArrayList(Main.bank.findAccounts(nid));
	for(BankAccount ba: list) 
		lv.getItems().add(ba.toString());
}
public void gohome() {
	Main.fxml.call("Homepage.fxml");
}
}
