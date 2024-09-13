package application;

import javafx.event.ActionEvent;

public class AccountHolderController {
	public void shovo1(ActionEvent event) {
		Main.fxml.call("DisplayYourAccInfo.fxml");
	}
	public void shovo2(ActionEvent event) {
		Main.fxml.call("Transaction History.fxml");
	}
	public void shovo3(ActionEvent event) {
		Main.fxml.call("ListOfYourRegistrarAccount.fxml");
	}
	public void shovo4(ActionEvent event) {
		Main.fxml.call("Homepage.fxml");
	}
}
