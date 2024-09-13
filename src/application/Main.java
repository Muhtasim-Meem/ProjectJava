package application;
	
import java.io.IOException;

import banking.Bank;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

public class Main extends Application {
	public static CallFXML fxml=new CallFXML();
	public static Bank bank=new Bank("Bikrom Bank");
	public static Stage primaryStage=null;
	@Override
	public void start(Stage stage) {
		try {
			primaryStage = stage;
			AnchorPane root = FXMLLoader.load(getClass().getResource("Homepage.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		try {
			bank.loadData();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		launch(args);
	}
}
