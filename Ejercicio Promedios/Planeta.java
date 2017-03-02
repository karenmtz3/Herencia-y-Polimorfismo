import java.util.ArrayList;
import java.util.Iterator;
/**
 * Write a description of class Planeta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Planeta
{
   private ArrayList<Pais> Coleccion;
   
   public Planeta()
   {
       Coleccion = new ArrayList<Pais>();
   }
   
   public void AddPais(Pais p)
   {
       Coleccion.add(p);
   }
   
    public int CalculaHab()
   {
       int s=0;
       Iterator<Pais> it =  Coleccion.iterator();
       while(it.hasNext())
       {
           Pais col = it.next();
           s += col.DarHab();
       }
       return (s/Coleccion.size());
   }
   
   
}
