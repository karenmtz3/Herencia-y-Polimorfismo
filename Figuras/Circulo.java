
/**
 * Write a description of class Circulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circulo extends Figura
{
    private float radio;
    
    public Circulo(float r)
    {
        radio = r;
    }
    
    public void CalculaArea()
    {
        area = (float)3.1416 * (radio * radio);
    }
    
    /*public String dimeInfo()
    {
        return "Circulo " + super.dimeInfo();
    }*/
    
    @Override
    public String toString()
    {
        return "Circulo con area = " + super.toString();
    }
}