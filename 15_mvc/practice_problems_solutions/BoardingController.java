import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class BoardingController {

    private BoardingModel model;
    
    @FXML
    public void initialize()
    {
      model = new BoardingModel(0, 0.0, 0.0);
    }
    
    @FXML
    private Button button;

    @FXML
    private TextField daysField;

    @FXML
    private TextArea textArea;

    @FXML
    private TextField weightField;

    @FXML
    void handleButton(ActionEvent event) {
      doCalculation();
    }

    @FXML
    void handleDaysField(ActionEvent event) {
      doCalculation();
    }

    @FXML
    void handleWeightField(ActionEvent event) {
      doCalculation();
    }

    private void doCalculation()
    {
      String dayString = daysField.getText();
      String weightString = weightField.getText();
      int days = 0;
      double weight = 0.0;
      try
      {
         days = Integer.parseInt(dayString);
         weight = Double.parseDouble(weightString);
      }
      catch(NumberFormatException e)
      {
         System.out.println("ToDo: show alert");
         return;
      }
      double cost = 0.5 * days * weight;
      textArea.setText(String.format("Days: %d  Weight: %,.2f  Cost: $%,.2f", days, weight, cost));
      model.setDays(days);
      model.setWeight(weight);
      model.setCost(cost);
    }
}
