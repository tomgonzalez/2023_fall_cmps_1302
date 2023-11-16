package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class MilesFeetConverterController {

    @FXML
    private Label feetLabel;

    @FXML
    private TextField milesTextBox;

    @FXML
    void handleMilesTextBox(ActionEvent event) {
    	String milesString = milesTextBox.getText();
    	double miles = 0;
    	
    	try
    	{
    		miles = Double.parseDouble(milesString);
    		
    	}
    	catch(NumberFormatException e)
    	{
    		Alert a = new Alert(AlertType.WARNING);
    		a.setHeaderText("Invalid Miles Amount");
    		a.setContentText(String.format("You entered an invalid amount " +
    				"for miles:  %s", milesString));
    		a.show();
    		return;
    	}
    	
    	double feet = miles * 5280.0; 
    	feetLabel.setText(String.format("%,.2f", feet));
    }
}