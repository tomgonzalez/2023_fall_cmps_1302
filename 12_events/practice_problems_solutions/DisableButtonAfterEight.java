import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Pos;

public class DisableButtonAfterEight extends Application
{
   private int timesClicked;
   Button button = new Button("Click me");
   Label label = new Label();
   
   @Override
   public void start(Stage stage)
   {
      BorderPane root = new BorderPane();
      button.setOnAction(e -> processButtonClick());
      root.setCenter(button);
      root.setTop(label);
      BorderPane.setAlignment(label, Pos.CENTER);
      Scene scene = new Scene(root, 400, 250);
      stage.setTitle("Disable Button After Eight Clicks");
      stage.setScene(scene);
      stage.show();
   }
   
   private void processButtonClick()
   {
      timesClicked++;
      if(timesClicked == 8)
      {
         button.setDisable(true);
         label.setText("That's enough!");
      }
   }
}