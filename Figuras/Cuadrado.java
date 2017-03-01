import java.awt.Graphics;
import java.awt.Graphics2D;
/**
 * Write a description of class Cuadrado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
abstract public class Cuadrado extends Figura
{
   private float lado;
    
   public Cuadrado(int x, int y,float l)
   {
       super(x,y);
       lado = l;
   }
   
   public void dibuja(Graphics g)
   {
       
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
