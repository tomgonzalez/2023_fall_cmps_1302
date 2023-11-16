import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class PaintApp extends Application
{
   @Override
   public void start(Stage stage)
   {
      PaintModel model = new PaintModel();
      PaintView view = new PaintView();
      PaintController controller = new PaintController(view, model);
      view.registerController(controller);
      
      Scene scene = new Scene(view.getRoot(), 800, 600);
      stage.setScene(scene);
      stage.setTitle("Paint App");
      stage.show();
   }
}