import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
/**
 * Write a description of class Circulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
 public class Circulo extends Figura
{
    private float radio;
    
   public Circulo(int x, int y,float r)
   {
       super(x,y);
       radio = r;
   }
    
   @Override
   public void dibuja(Graphics g)
   {
       Graphics2D g2;
       g2 = (Graphics2D) g;
       Color c = new Color(255,0,255);
       g2.setColor(c);
       g2.drawOval(super.DevolverX(),super.DevolverY(),(int)radio*2, (int)radio*2);
   }
   /* public void CalculaArea()
    {
        area = (float)3.1416 * (radio * radio);
    }
    
    public String dimeInfo()
    {
        return "Circulo " + super.dimeInfo();
    }*/
}
