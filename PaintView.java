import javafx.scene.layout.AnchorPane;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.control.*;

public class PaintView
{
   private AnchorPane root;
   private ColorPicker colorPicker;
   private Canvas canvas;
   private GraphicsContext gc;
   
   public PaintView()
   {
      root = new AnchorPane();
      SplitPane splitPane = new SplitPane();
      colorPicker = new ColorPicker();
      canvas = new Canvas();
      canvas.setHeight(575);
      canvas.setWidth(660);
      splitPane.getItems().addAll(colorPicker, canvas);
      root.getChildren().addAll(splitPane);
      gc = canvas.getGraphicsContext2D();
   }
   
   public void drawRectangle(double x, double y, Color color)
   {
      gc.setFill(color);
      gc.fillRect(x, y, 3, 3);
   }
   
   public void registerController(PaintController controller)
   {
      colorPicker.setOnAction(e -> controller.handleColorPicker(e));
      canvas.setOnMouseDragged(e -> controller.mouseDragged(e));
   }
   
   public AnchorPane getRoot()
   {
      return root;
   }
   
   public ColorPicker getColorPicker()
   {
      return colorPicker;
   }
   
   public Canvas getCanvas()
   {
      return canvas;
   }
}