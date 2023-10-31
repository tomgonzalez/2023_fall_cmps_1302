import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import java.util.concurrent.ThreadLocalRandom;
import javafx.geometry.Pos;
import javafx.scene.control.Alert.AlertType;

public class KennelCost extends Application
{
      
   @Override
   public void start(Stage stage)
   {
      Pane root = new Pane();
      
      Label daysLabel = new Label("Days");
      daysLabel.relocate(10,10);
      Label weightLabel = new Label("Weight");
      weightLabel.relocate(10,40);      
      Label costLabel = new Label("Cost");
      costLabel.relocate(10,70);
            
      TextField daysBox = new TextField();
      daysBox.relocate(60,10);
      TextField weightBox = new TextField();
      weightBox.relocate(60,40);
      TextField costBox = new TextField();
      costBox.relocate(60,70);
            
      Button button = new Button("Compute Cost");
      button.relocate(240, 20);   
      root.getChildren().addAll(daysLabel, weightLabel,
         costLabel, daysBox, weightBox, costBox, button); 
      
      button.setOnAction(e -> costBox.setText(String.format("$%,.2f", 
         calculateCost(daysBox.getText(), weightBox.getText()))));             
    
      Scene scene = new Scene(root, 400, 250);
      stage.setTitle("Kennel Cost");
      stage.setScene(scene);
      stage.show();
   }
   
   private double calculateCost(String daysString, String weightString)
   {
      try
      {
         int days = Integer.parseInt(daysString);
         double weight = Double.parseDouble(weightString);
         return 0.5 * days * weight;      
      }
      catch(NumberFormatException e)
      {
         Alert alert = new Alert(AlertType.ERROR);
         alert.setTitle("Invalid Input");
         alert.setHeaderText("Invalid Input");
         alert.setContentText("Input must be numeric.  Days must be an integer.");
         alert.showAndWait();      
      
         return 0.0;
      }   
   }
}