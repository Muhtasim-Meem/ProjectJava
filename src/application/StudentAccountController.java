package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class StudentAccountController implements Initializable {
	@FXML
	ComboBox<String> comb;
	@FXML
	TextField nameTf;
	@FXML
	TextField nidTf;
	@FXML
	TextField balanceTf;
	@FXML
	TextField institutionIdTf;
	@FXML
	TextField institutionNameTf;
	@FXML
	Label info;
	public void CreateAccount(ActionEvent event) {
	String name=nameTf.getText();
	String nid=nidTf.getText();
	double balance=Double.parseDouble(balanceTf.getText());
	String institutionId=institutionIdTf.getText();
	String institutionName=institutionNameTf.getText();
	String accNum=Main.bank.addAccount(name, nid, balance, institutionId,institutionName);
	info.setText(accNum);
	try {
		Main.bank.saveData();
	} catch (IOException e) {
		e.printStackTrace();
	}

	}
	public void clear(ActionEvent event) {
		nameTf.clear();
		nidTf.clear();
		balanceTf.clear();
		institutionIdTf.clear();
		institutionNameTf.clear();
	}
	public void goHome(ActionEvent event) {
	Main.fxml.call("Homepage.fxml");
	}
	public void selectAccount(ActionEvent event) {
		String choose=comb.getSelectionModel().getSelectedItem().toString();
		Main.fxml.comboBox(choose);
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ObservableList<String> list=FXCollections.observableArrayList("Saving Account","Business Account","Student Account");
		comb.setItems(list);
		
	}
}
