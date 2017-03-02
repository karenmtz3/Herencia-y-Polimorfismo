import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
/**
 * Write a description of class Rombo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
 public class Rombo extends Figura
{
  private float DiagM;
  private float Diagm;
  
  public Rombo(int x, int y, float D, float d)
  {
      super(x,y);
      DiagM = D;
      Diagm = d;
  }
  
  @Override
  public void dibuja(Graphics g)
  {
      Graphics2D g2 = (Graphics2D) g;
      Color c = new Color(133,20,204);
      g2.setColor(c);
      g2.drawLine(super.DevolverX(),super.DevolverY(),super.DevolverX()+(int)Diagm/2,super.DevolverY()+(int)DiagM/2);
      g2.drawLine(super.DevolverX()+(int)Diagm/2,super.DevolverY()+(int)DiagM/2,super.DevolverX(),super.DevolverY()+(int)DiagM);
      g2.drawLine(super.DevolverX(),super.DevolverY()+(int)DiagM,super.DevolverX()-(int)Diagm/2,super.DevolverY()+(int)DiagM/2);
      g2.drawLine(super.DevolverX()-(int)Diagm/2,super.DevolverY()+(int)DiagM/2,super.DevolverX(),super.DevolverY());
  }
}
