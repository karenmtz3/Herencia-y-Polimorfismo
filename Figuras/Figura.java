import java.awt.Graphics;
import java.awt.Graphics2D;
/**
 * Write a description of class Figura here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
 abstract public class Figura
{
    private int posx;
    private int posy;
    
    public Figura(int x, int y)
    {
        posx = x;
        posy = y;
    }
    
    public int DevolverX()
    {
        return posx;
    }
    
    public int DevolverY()
    {
        return posy;
    }
    
    public abstract void dibuja(Graphics g); 
    
    /*protected float area;
    
    public Figura()
    {
        area = 0;
    }
    
    public float accedeArea()
    {
        return area;
    }
    
    public void CalculaArea()
    {
        System.out.println("ups...");
    }
    
    public String dimeInfo()
    {
        return "" + area;
    }*/
    
    
}
