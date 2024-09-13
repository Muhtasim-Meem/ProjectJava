package application;

import java.io.FileNotFoundException;
import java.io.IOException;

import banking.InSufficientBalanceException;
import banking.InvalidAccountException;
import banking.MaxWithdawException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class WithdrawController {
	@FXML
	TextField accNumtf, amttf;
	@FXML
	Label x;
	public void shovo1(ActionEvent event) {
		Main.fxml.call("Homepage.fxml");
	}
	public void withdraw() {
		String accNum = accNumtf.getText();
		double amt= Double.parseDouble(amttf.getText());
		try {
			Main.bank.withdraw(accNum, amt);
			x.setText("Withdraw Successfull.");
		} catch (InvalidAccountException e) {
			x.setText(e.getMessage());
		} catch (InSufficientBalanceException e) {
			x.setText(e.getMessage());
		} catch (MaxWithdawException e) {
			x.setText(e.getMessage());
		}
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
}
