package application;

import java.io.FileNotFoundException;
import java.io.IOException;

import banking.InvalidAccountException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DipositMoneyController {

	@FXML
	TextField accNumtf, amttf;
	@FXML
	Label x;
	public void shovo1(ActionEvent event) {
		Main.fxml.call("Homepage.fxml");
	}
	public void shovo2(ActionEvent event) {
		String accNum=accNumtf.getText();
		double amount=Double.parseDouble(amttf.getText());
		try {
			Main.bank.deposit(accNum, amount);
			x.setText("Deposit Successfull");
		} catch (InvalidAccountException e) {
			x.setText(e.getMessage());
		}
		try {
			Main.bank.saveData();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			x.setText(e.getMessage());
		}
		
	}
}
