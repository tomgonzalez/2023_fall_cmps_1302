import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class MilesConverterController {

    MilesConverterModel model;
    
    @FXML
    public void initialize()
    {
       model = new MilesConverterModel();
    }
    
    @FXML
    private TextField milesField;

    @FXML
    private TextArea textArea;

    @FXML
    void handleMilesField(ActionEvent event) {
      String milesString = milesField.getText();
      double miles = 0;
      try
      {
         miles = Double.parseDouble(milesString);
      }
      catch(NumberFormatException e)
      {
         // Show alert
         Alert alert = new Alert(AlertType.WARNING);
         alert.setContentText(milesString + " is no good.");
         alert.showAndWait();
         return;
      }
      model.setMiles(miles);   
      textArea.setText(model.toString());
    }

}
