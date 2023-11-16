package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class DisableButtonAfterEightClicksController {

    @FXML
    private Button clickButton;

    @FXML
    private Label enoughLabel;
    
    private int numberClicks;
    
    @FXML
    void handleClickButton(ActionEvent event) {
    	numberClicks++;
    	if(numberClicks == 8)
    	{
    		enoughLabel.setVisible(true);
    		clickButton.setDisable(true);
    	}
    }
}
