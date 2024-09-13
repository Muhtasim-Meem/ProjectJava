package application;

import java.net.URL;
import java.util.ResourceBundle;

import banking.BankAccount;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;

public class DisplayAllAccInfo implements Initializable {
@FXML
ComboBox<String> comb;
@FXML
ListView<String> lv;
public void accTypeInfo(ActionEvent event) {
	String type=comb.getSelectionModel().getSelectedItem().toString();
	if(type.equalsIgnoreCase("All Accounts"))
	{	lv.getItems().clear();
		ObservableList<BankAccount> list=FXCollections.observableArrayList(Main.bank.getAccounts());
		for(int i=0; i<list.size(); i++)
			lv.getItems().add(list.get(i).toString());
	}
	else if(type.equalsIgnoreCase("Current Accounts"))
	{
		lv.getItems().clear();
		ObservableList<BankAccount> list=FXCollections.observableArrayList(Main.bank.getAccounts("current"));
		for(int i=0; i<list.size(); i++)
			lv.getItems().add(list.get(i).toString());
	}
	else if(type.equalsIgnoreCase("Student Accounts")) {
		lv.getItems().clear();
		ObservableList<BankAccount> list=FXCollections.observableArrayList(Main.bank.getAccounts("student"));
	for(int i=0; i<list.size(); i++)
		lv.getItems().add(list.get(i).toString());
	}
	else if(type.equalsIgnoreCase("Saving Accounts")) {
		lv.getItems().clear();
		ObservableList<BankAccount> list=FXCollections.observableArrayList(Main.bank.getAccounts("saving"));
		for(int i=0; i<list.size(); i++)
			lv.getItems().add(list.get(i).toString());
	}
}
@Override
public void initialize(URL arg0, ResourceBundle arg1) {
	ObservableList<BankAccount> list=FXCollections.observableArrayList(Main.bank.getAccounts());
	for(int i=0; i<list.size(); i++)
		lv.getItems().add(list.get(i).toString());
	ObservableList<String> list1=FXCollections.observableArrayList("All Accounts","Saving Accounts","Current Accounts","Student Accounts");
	comb.setItems(list1);
}
public void home() {
	Main.fxml.call("Homepage.fxml");
}
}
