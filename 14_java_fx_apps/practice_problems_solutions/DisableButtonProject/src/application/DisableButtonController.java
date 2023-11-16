package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class DisableButtonController {

    @FXML
    private Button clickButton;

    @FXML
    void handleClickButton(ActionEvent event) {
    	clickButton.setDisable(true);
    }
}