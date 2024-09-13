package application;


import banking.InvalidAccountException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DisplayYourAccInfoController {
@FXML
TextField accNumTf,nidTf;
@FXML
Label info;
public void shuvo1(ActionEvent event) {
	String accNum=accNumTf.getText();
	String nid=nidTf.getText();
	try {
		info.setText(Main.bank.findAccount(nid, accNum).toString());
	} catch (InvalidAccountException e) {
		info.setText(e.getMessage());
	}
}
public void shuvo2(ActionEvent event) {
	Main.fxml.call("Homepage.fxml");
}
}
