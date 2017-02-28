
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
    
    /*public void CalculaArea()
    {
        area = base * altura / 2;
    }
    
    public String dimeInfo()
    {
        return "Triangulo " + super.dimeInfo();
    }*/
}
