import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
/**
 * Write a description of class Triangulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
 public class Triangulo extends Figura
{
    private float base;
    private float altura;
    
    public Triangulo(int x, int y,float b, float a)
    {
        super(x,y);
        base = b;
        altura = a;
    }
    
    @Override
    public void dibuja(Graphics g)
    {
        Graphics g2 = (Graphics2D) g;
        Color c = new Color(234,2,168);
        g2.setColor(c);
        g2.drawLine(super.DevolverX(), super.DevolverY(), super.DevolverX() + (int)base/2,super.DevolverY() + (int)altura);
        g2.drawLine(super.DevolverX(), super.DevolverY(), super.DevolverX() - (int)base/2,super.DevolverY() + (int)altura);
        g2.drawLine(super.DevolverX()+ (int)base/2, super.DevolverY() + (int)altura, super.DevolverX()-(int)base/2,super.DevolverY()+(int)altura);
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
