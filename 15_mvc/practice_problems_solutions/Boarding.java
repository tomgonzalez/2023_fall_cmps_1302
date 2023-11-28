import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import java.io.IOException;
import javafx.fxml.FXMLLoader;

public class Boarding extends Application
{
   @Override
   public void start(Stage stage) throws IOException
   {
      Pane root = FXMLLoader.load(getClass().getResource("BoardingFXML.fxml"));
      Scene scene = new Scene(root);
      stage.setScene(scene);
      stage.setTitle("Boarding App");
      stage.show();
   }
}