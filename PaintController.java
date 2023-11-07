import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class PaintController
{
   private PaintView view;
   private PaintModel model;
   //private Color currentColor;
   
   public PaintController(PaintView view, PaintModel model)
   {
      this.view = view;
      this.model = model;
   }
   
   public void handleColorPicker(ActionEvent event)
   {
      model.setColor(view.getColorPicker().getValue());
      //System.out.println(currentColor);
   }
   
   public void mouseDragged(MouseEvent event)
   {
      view.drawRectangle(event.getX(), event.getY(), model.getCurrentColor);
      model.addRectangle(new Rectangle(event.getX(), event.getY(), model.getCurrentColor));
      //System.out.println("Mouse was dragged.");
   }
}