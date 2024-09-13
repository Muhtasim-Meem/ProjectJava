package application;

import javafx.application.Platform;
import javafx.event.ActionEvent;

public class EmployeesController {

	public void addAccount(ActionEvent event) {
		Main.fxml.call("AddAccount.fxml");
	}
	public void deposit(ActionEvent event)
	{
		Main.fxml.call("Deposit Account.fxml");
	}
	public void withdraw(ActionEvent event) {
		Main.fxml.call("Withdraw Money.fxml");
	}
	public void transfer(ActionEvent event) {
		Main.fxml.call("Transfer.fxml");
	}
	public void displayAcc(ActionEvent event) {
		Main.fxml.call("DisplayAccInfo.fxml");
	}
	public void displayTransaction(ActionEvent event) {
		Main.fxml.call("Display Transaction.fxml");
	}
	public void displaySpecificAcc(ActionEvent event) {
		Main.fxml.call("DisplaySpecificAccInfo.fxml");
	}
	public void displayAllAccInfo(ActionEvent event) {
		Main.fxml.call("DisplayAllAccInfo.fxml");
	}
	public void exit(ActionEvent event) {
		Platform.exit();
	}
	public void goHome(ActionEvent event) {
		Main.fxml.call("Homepage.fxml");
	}
}
