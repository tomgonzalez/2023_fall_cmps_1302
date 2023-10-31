import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import java.util.concurrent.ThreadLocalRandom;
import javafx.geometry.Pos;
import javafx.scene.control.Alert.AlertType;

public class ConvertMilesToFeet extends Application
{
      
   @Override
   public void start(Stage stage)
   {
      Pane root = new Pane();
      
      Label milesLabel = new Label("Miles");
      milesLabel.relocate(10,10);
      Label feetLabel = new Label("Feet");
      feetLabel.relocate(10,40);      
            
      TextField milesBox = new TextField();
      milesBox.relocate(60,10);
      TextField feetBox = new TextField();
      feetBox.relocate(60,40);
            
      Button button = new Button("Convert");
      button.relocate(240, 20);   
      root.getChildren().addAll(milesLabel, feetLabel,
         milesBox, feetBox, button); 
      
      button.setOnAction(e -> feetBox.setText(String.format("%,.2f", 
         calculateFeet(milesBox.getText()))));

      Scene scene = new Scene(root, 400, 250);
      stage.setTitle("Convert Miles to Feet");
      stage.setScene(scene);
      stage.show();
   }
   
   private double calculateFeet(String milesString)
   {
      try
      {
         double miles = Double.parseDouble(milesString);   
         return 5280.0 * miles;
      }
      catch(NumberFormatException e)
      {
         Alert alert = new Alert(AlertType.ERROR);
         alert.setTitle("Invalid Input");
         alert.setHeaderText("Invalid Input");
         alert.setContentText("Input must be numeric.");
         alert.showAndWait();      
         return 0.0;
      }   
   }
}