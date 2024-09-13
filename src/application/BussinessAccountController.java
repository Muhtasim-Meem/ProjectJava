package application;

import java.io.FileNotFoundException;
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

public class BussinessAccountController implements Initializable {
	@FXML
	ComboBox<String> select;
	@FXML
	TextField nametf;
	@FXML
	TextField nidtf;
	@FXML
	TextField balancetf;
	@FXML
	TextField tradelicensetf;
	@FXML
	Label info;
	
	public void createAccount(ActionEvent event) {
		String name = nametf.getText();
		String nid = nidtf.getText();
		double balance =Double.parseDouble(balancetf.getText());
		String tradelicense = tradelicensetf.getText();
		String accNum = Main.bank.addAccount(name, nid, balance, tradelicense);
		info.setText(accNum);
		try {
			Main.bank.saveData();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void selectAccount(ActionEvent event) {
		String choose=select.getSelectionModel().getSelectedItem().toString();
		Main.fxml.comboBox(choose);
	}
	public void home(ActionEvent event) {
		Main.fxml.call("Homepage.fxml");
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ObservableList<String> list=FXCollections.observableArrayList("Saving Account","Business Account","Student Account");
		select.setItems(list);
	}
	
}
