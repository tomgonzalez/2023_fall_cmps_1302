package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class BookLabelController {

    @FXML
    private Label bookLabel;

    @FXML
    private Button goButton;

    @FXML
    void handleGoButton(ActionEvent event) {
    	bookLabel.setVisible(true);
    }
}
