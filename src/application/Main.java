package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {
    public static Bank bank = new Bank("Bikrom Bank");

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/MainView.fxml"));
        BorderPane root = loader.load();
        Scene scene = new Scene(root, 800, 600);

        // Apply CSS
        scene.getStylesheets().add(getClass().getResource("/application/MainView.css").toExternalForm());

        primaryStage.setTitle("Bank Management System");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
