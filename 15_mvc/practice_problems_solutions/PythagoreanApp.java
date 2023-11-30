import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;
import java.io.IOException;

public class PythagoreanApp extends Application
{
   @Override
   public void start(Stage stage) throws IOException
   {
      AnchorPane root = FXMLLoader.load(getClass().getResource("PythagoreanAppFXML.fxml"));
      Scene scene = new Scene(root);
      stage.setScene(scene);
      stage.setTitle("Pythagorean Calculator");
      stage.show();
   }
}