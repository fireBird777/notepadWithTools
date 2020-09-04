package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.input.DragEvent;


public class NavBarController {

	@FXML
	private TextArea textArea;
	
	public void makeTextBold(ActionEvent event) {
		
	}
	
	public void selectedText() {
		
		String str = textArea.getText();
		System.out.println(str);
	}
}
