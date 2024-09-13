package application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

public class CallFXML {
public void call(String type) {
	try {
		AnchorPane root = FXMLLoader.load(getClass().getResource(type));
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Main.primaryStage.setScene(scene);
		Main.primaryStage.show();
	} catch(Exception e) {
		e.printStackTrace();
	}
}

public void comboBox(String choose) {
	if(choose.equalsIgnoreCase("Saving Account"))
		call("AddAccount.fxml");
	else if(choose.equalsIgnoreCase("Business Account"))
		call("Business Account.fxml");
	else if(choose.equalsIgnoreCase("Student Account"))
		call("Student Account.fxml");
}
}
