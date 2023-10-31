import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;

public class BookLabels extends Application
{
   @Override
   public void start(Stage stage)
   {
      Pane root = new Pane();
      Label openingLine = new Label("It was the best of times; " +
         " it was the worst of times.");
      Label bookTitle = new Label();
      Button button = new Button("Click Me.");   
      openingLine.relocate(70, 50);
      bookTitle.relocate(140, 100);
      button.relocate(170, 150);
      button.setOnAction(e -> bookTitle.setText("A Tale of Two Cities"));
      root.getChildren().addAll(openingLine, bookTitle, button);
      Scene scene = new Scene(root, 400, 250);
      stage.setTitle("Book Labels");
      stage.setScene(scene);
      stage.show();
   }
}