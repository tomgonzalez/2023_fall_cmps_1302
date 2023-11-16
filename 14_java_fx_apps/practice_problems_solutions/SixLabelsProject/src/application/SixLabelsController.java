package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class SixLabelsController {

	private Label[] labels;
	private int currentLabel;
	
    @FXML
    private BorderPane borderPane;

    @FXML
    private Button clickButton;

    @FXML
    void handleClickButton(ActionEvent event) {
    	currentLabel = (currentLabel + 1) % 6;
    	borderPane.setCenter(labels[currentLabel]);
    }
    
    @FXML
    public void initialize()
    {
    	labels = new Label[] {new Label("Fact 1"), new Label("Fact 2"),
            new Label("Fact 3"), new Label("Fact 4"), new Label("Fact 5"),
            new Label("Fact 6")};
    	
    	borderPane.setCenter(labels[0]);
    }
}
