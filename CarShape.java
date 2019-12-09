package racingGame;

import java.awt.*;
import java.awt.geom.*;
import java.util.*;

/**
   A car that can be moved around.
*/
public class CarShape implements MoveableShape
{
   /**
      Constructs a car item.
      @param x the left of the bounding rectangle
      @param y the top of the bounding rectangle
      @param width the width of the bounding rectangle
   */
   public CarShape(int x, int y, int width, Color color)
   {
      this.x = x;
      this.y = y;
      this.width = width;
      this.color = color;
   }

   public void move()
   {
      this.y+=10;
   }
   
   public int getY() 
   {
	   return this.y;
   }

   public void draw(Graphics2D g2)
   {
      Rectangle2D.Double body
            = new Rectangle2D.Double(x+width/3, y + width / 6, 
                  width/2, width);
      Rectangle2D.Double frontTire
            = new Rectangle2D.Double(x + width / 6, y + width / 3, 
                  width / 6, width/4);
      Rectangle2D.Double rearTire
            = new Rectangle2D.Double(x + (width/2)+34, y + width / 3,
                  width / 6, width /4);
      Rectangle2D.Double frontTire1
      		= new Rectangle2D.Double(x + width / 6, y + (width*1.1)-30, 
      				width / 6, width/4);
      Rectangle2D.Double rearTire2
      		= new Rectangle2D.Double(x + (width/2)+34, y + (width*1.1)-30 ,
      				width / 6, width /4);

    
      g2.fill(frontTire);
      g2.fill(frontTire1);
      g2.fill(rearTire);
      g2.fill(rearTire2);

      
      g2.setColor(this.color);
      g2.fill(body);
      g2.draw(body);
      g2.draw(frontTire);
      g2.draw(rearTire);
      g2.draw(frontTire1);
      g2.draw(rearTire2);
//      g2.draw(frontWindshield);
//      g2.draw(roofTop);
//      g2.draw(rearWindshield);
   }
   
   private int x;
   private int y;
   private Color	color;
   private int width;
}
