import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;

public class DisableButton extends Application
{
   @Override
   public void start(Stage stage)
   {
      BorderPane root = new BorderPane();
      Button button = new Button("Click Me.");   
      button.setOnAction(e -> button.setDisable(true));
      root.setCenter(button);
      Scene scene = new Scene(root, 400, 250);
      stage.setTitle("Disable Button");
      stage.setScene(scene);
      stage.show();
   }
}