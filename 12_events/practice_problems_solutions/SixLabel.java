import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import java.util.concurrent.ThreadLocalRandom;
import javafx.geometry.Pos;

public class SixLabel extends Application
{
      
   @Override
   public void start(Stage stage)
   {
      BorderPane root = new BorderPane();
      Button button = new Button("Click Me.");   
      root.setCenter(new Label("Fact 1")); 
      root.setBottom(button);
      BorderPane.setAlignment(button, Pos.CENTER);
      button.setOnAction(e -> root.setCenter(pickRandomLabel()));

      Scene scene = new Scene(root, 400, 250);
      stage.setTitle("Six Labels");
      stage.setScene(scene);
      stage.show();
   }
   
   private Label pickRandomLabel()
   {
      Label[] labels = { new Label("Fact 1"),
         new Label("Fact 2"),
         new Label("Fact 3"),
         new Label("Fact 4"),
         new Label("Fact 5"),
         new Label("Fact 6")};
   
      int index = Math.abs(ThreadLocalRandom.current().nextInt()) % 6;
      return labels[index];
   }
}