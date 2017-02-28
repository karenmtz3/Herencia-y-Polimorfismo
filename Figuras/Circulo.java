
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
    
   /* public void CalculaArea()
    {
        area = (float)3.1416 * (radio * radio);
    }
    
    public String dimeInfo()
    {
        return "Circulo " + super.dimeInfo();
    }*/
}
