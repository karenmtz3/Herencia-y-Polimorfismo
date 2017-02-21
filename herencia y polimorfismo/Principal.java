
/**
 * Write a description of class Principal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Principal
{
    public static void main(String [] args)
    {
        Triangulo t1 = new Triangulo(3,4);
        t1.CalculaArea();
        System.out.println("El area del triangulo es " + t1.accedeArea());
        
        Cuadrado c1 = new Cuadrado(5);
        c1.CalculaArea();
        System.out.println("El area del cuadrado es " + c1.accedeArea());
        
        Circulo ci1 = new Circulo(3);
        ci1.CalculaArea();
        System.out.println("El area del circulo es " + ci1.accedeArea());
    }
}
