import javafx.scene.paint.Color;
import java.util.ArrayList;

public class PaintModel
{
   private Color currentColor;
   private ArrayList<Rectangle> rectangles;   

   public PaintModel()
   {
      currentColor = Color.WHITE;
      rectangles = new ArrayList<>();
   }
   
   public void setCurrentColor(Color currentColor)
   {
      this.currentColor = currentColor;
   }
   
   public Color getCurrentColor()
   {
      return currentColor;
   }
}