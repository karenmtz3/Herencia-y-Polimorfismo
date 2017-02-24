
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
    
    public Triangulo(float b, float a)
    {
        base = b;
        altura = a;
    }
    
    public void CalculaArea()
    {
        area = base * altura / 2;
    }
    
    /*public String dimeInfo()
    {
        return "Triangulo " + super.dimeInfo();
    }*/
    
    @Override
    public String toString()
    {
        return "Triangulo con area = " + super.toString();
    }
}