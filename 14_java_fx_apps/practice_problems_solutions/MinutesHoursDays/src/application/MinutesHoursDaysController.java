package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class MinutesHoursDaysController {

    @FXML
    private Label hoursLabel;

    @FXML
    private Label daysLabel;

    @FXML
    private TextField minutesTextField;

    @FXML
    void handleMinutesTextField(ActionEvent event) {
    	String minutesString = minutesTextField.getText();
    	int minutes = 0;
    	
    	try
    	{
    		minutes = Integer.parseInt(minutesString);
    		
    	}
    	catch(NumberFormatException e)
    	{
    		Alert a = new Alert(AlertType.WARNING);
    		a.setHeaderText("Invalid Minutes Amount");
    		a.setContentText(String.format("You entered an invalid amount " +
    				"for minutes:  %s", minutesString));
    		a.show();
    		return;
    	}
    	
    	int days = minutes / 1440;
    	int remainingMinutes = minutes % 1440;
    	int hours = remainingMinutes / 60;
    	int minutesLeft = remainingMinutes % 60;
    	String daysString = String.format("%d days %d hours %d minutes ",
    			days, hours, minutesLeft);
    	
    	hours = minutes / 60;
    	minutesLeft = minutes % 60;
       	String hoursString = String.format("%d hours %d minutes ",
    			hours, minutesLeft); 
       	
       	hoursLabel.setText(hoursString);
       	daysLabel.setText(daysString);
    }
}