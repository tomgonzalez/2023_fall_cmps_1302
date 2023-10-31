import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import java.util.concurrent.ThreadLocalRandom;
import javafx.geometry.Pos;
import javafx.scene.control.Alert.AlertType;

public class MinutesToHoursDays extends Application
{
      
   @Override
   public void start(Stage stage)
   {
      Pane root = new Pane();
      
      Label minutesLabel = new Label("Minutes");
      minutesLabel.relocate(10,10);
      Label hoursLabel = new Label("Hours");
      hoursLabel.relocate(10,40);      
      Label daysLabel = new Label("Days");
      daysLabel.relocate(10,70);
                  
      TextField minutesBox = new TextField();
      minutesBox.relocate(60,10);
      TextField hoursBox = new TextField();
      hoursBox.relocate(60,40);
      TextField daysBox = new TextField();
      daysBox.relocate(60,70);
                  
      Button button = new Button("Convert");
      button.relocate(240, 20);   
      root.getChildren().addAll(minutesLabel, hoursLabel,
         daysLabel, minutesBox, hoursBox, daysBox, button); 
      
      button.setOnAction(e -> 
         {
            hoursBox.setText(String.format("%,.2f", 
               calculateHoursAndDays(minutesBox.getText(), true)));
            daysBox.setText(String.format("%,.2f", 
               calculateHoursAndDays(minutesBox.getText(), false)));
         });
               
      Scene scene = new Scene(root, 400, 250);
      stage.setTitle("Convert Minutes to Hours and Days");
      stage.setScene(scene);
      stage.show();
   }
   
   private double calculateHoursAndDays(String minutesString, boolean isHours)
   {
      try
      {
         double minutes = Double.parseDouble(minutesString);
                  
         if(isHours)
         {
            return minutes / 60.0;
         }
         else
         {
            return minutes / 1440.0;
         }      
      }
      catch(NumberFormatException e)
      {
         if(isHours)
         {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Invalid Input");
            alert.setHeaderText("Invalid Input");
            alert.setContentText("Input must be numeric.");
            alert.showAndWait();
         }         
         return 0.0;
      }   
   }
}