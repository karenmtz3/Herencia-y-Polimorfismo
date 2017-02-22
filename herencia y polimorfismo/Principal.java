import java.util.ArrayList;
import java.util.Iterator;
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
        ArrayList<Figura> ArrayF;
        ArrayF = new ArrayList<Figura>();
        
        Iterator <Figura> it = ArrayF.iterator();
        while(it.hasNext())
        {
            Figura f = it.next();
            f.CalculaArea();
        }

        while(it.hasNext())
        {
            Figura f = it.next();
            f.accedeArea();
            System.out.println("El area de la figura es " + f.accedeArea());
        }
        
        
       /* Figura [] arr = new Figura[3];
        arr [0] = new Triangulo(3,4);
        arr [1] = new Cuadrado(5);
        arr [2] = new Circulo(3);
        
        for(Figura f : arr)
        {
            f.CalculaArea();
        }
        
        for(Figura f: arr)
        {
            f.accedeArea();
            System.out.println("El area de la figura es " + f.accedeArea());
        }*/
        
        
    }
}
