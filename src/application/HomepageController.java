package application;

import javafx.application.Platform;
import javafx.event.ActionEvent;

public class HomepageController {
	public void shovo(ActionEvent event)
	{
		Main.fxml.call("Employees.fxml");
	}
	public void shovo2(ActionEvent event) {
		Main.fxml.call("Account Holder.fxml");
	}
	public void shovo3(ActionEvent event) {
		Platform.exit();
	}
}