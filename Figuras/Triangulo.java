import java.awt.Graphics;
import java.awt.Graphics2D;
/**
 * Write a description of class Triangulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
abstract public class Triangulo extends Figura
{
    private float base;
    private float altura;
    
    public Triangulo(int x, int y,float b, float a)
    {
        super(x,y);
        base = b;
        altura = a;
    }
    
    public void dibuja(Graphics g)
    {
        
    }
    
    /*public void CalculaArea()
    {
        area = base * altura / 2;
    }
    
    public String dimeInfo()
    {
        return "Triangulo " + super.dimeInfo();
    }*/
}
