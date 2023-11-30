import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class PythagoreanAppController {

    private PythagoreanAppModel model;

    @FXML
    public void initialize()
    {
      model = new PythagoreanAppModel();
    }
    
    @FXML
    private TextField aField;

    @FXML
    private TextField bField;

    @FXML
    private TextArea textArea;

    @FXML
    void handleAField(ActionEvent event) {
      handleFields();
    }

    @FXML
    void handleBField(ActionEvent event) {
      handleFields();
    }

    private void handleFields()
    {
      String aString = aField.getText();
      String bString = bField.getText();
      double a = 0.0;
      double b = 0.0;
      try
      {
         a = Double.parseDouble(aString);
         b = Double.parseDouble(bString);
      }
      catch(NumberFormatException e)
      {
         Alert alert = new Alert(AlertType.WARNING);
         alert.setContentText(String.format("Bad input: a %s  b %s", aString, bString));
         alert.showAndWait();
         return;
      }
      model.setA(a);
      model.setB(b);   
      double c = Math.sqrt(a * a + b * b);
      textArea.setText(String.format("a: %,.2f b: %,.2f c: %,.2f%n", a, b, c) + textArea.getText());
    }
}
