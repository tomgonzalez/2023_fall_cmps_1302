package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class KennelCostController {

    @FXML
    private TextField weightTextField;

    @FXML
    private TextField daysTextField;

    @FXML
    private Label priceLabel;

    @FXML
    void handleDaysTextField(ActionEvent event) {
    	validateInput();
    }

    @FXML
    void handleWeightTextField(ActionEvent event) {
    	validateInput();
    }
    
    private void validateInput()
    {
    	String weightString = weightTextField.getText();
    	double weight = 0;
    	
    	try
    	{
    		weight = Double.parseDouble(weightString);
    		
    	}
    	catch(NumberFormatException e)
    	{
    		Alert a = new Alert(AlertType.WARNING);
    		a.setHeaderText("Invalid Weight Amount");
    		a.setContentText(String.format("You entered an invalid amount " +
    				"for weight:  %s", weightString));
    		a.show();
    		return;
    	}
    	
    	String daysString = daysTextField.getText();
    	int days = 0;
    	
    	try
    	{
    		days = Integer.parseInt(daysString);   		
    	}
    	catch(NumberFormatException e)
    	{
    		Alert a = new Alert(AlertType.WARNING);
    		a.setHeaderText("Invalid Days Amount");
    		a.setContentText(String.format("You entered an invalid amount " +
    				"for days:  %s", daysString));
    		a.show();
    		return;
    	}
    	
        computeDisplayPrice(weight, days);
    }
    
    public void computeDisplayPrice(double weight, int days)
    {
    	double price = 0.5 * weight * days;
    	priceLabel.setText(String.format("$%,.2f", price));
    }
    
}