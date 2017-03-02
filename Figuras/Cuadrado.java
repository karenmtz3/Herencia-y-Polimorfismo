import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
/**
 * Write a description of class Cuadrado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
 public class Cuadrado extends Figura
{
   private float lado;
    
   public Cuadrado(int x, int y,float l)
   {
       super(x,y);
       lado = l;
   }
   
   @Override
   public void dibuja(Graphics g)
   {
       Graphics2D g2 = (Graphics2D) g;
       Color c = new Color(255,175,175);
       g2.setColor(c);
       g2.drawRect(super.DevolverX(), super.DevolverY(),(int)lado, (int)lado);
   }
    
    /*public void CalculaArea()
    {
        area = lado * lado;
    }
    
    public String dimeInfo()
    {
        return "Cuadrado " + super.dimeInfo();
    }*/
}
