import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
/**
 * Write a description of class Lienzo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lienzo extends JPanel
{
  ArrayList<Figura> fig = new ArrayList<Figura>();

  
  public Lienzo()
  {         
      Triangulo t = new Triangulo(100,100,90,100);
      Cuadrado c = new Cuadrado(200, 140,60);
      Circulo ci = new Circulo(300,180,50);
      Rombo r = new Rombo(400,100,50,30);
      
      fig.add(t);
      fig.add(c);
      fig.add(ci);
      fig.add(r);
  }
    
    
  @Override
    public void paintComponent(Graphics g)
    {
       Graphics2D g2 = (Graphics2D) g;
       for(Figura f: fig)
       {
           f.dibuja(g);
       }
        
    }  
}
