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
   private ArrayList<Pais> pais;
   
   public Planeta()
   {
       pais = new ArrayList<Pais>();
   }
   
   public void AddPais(Pais p)
   {
       pais.add(p);
   }
   
   public float CalculaPromedio()
   {
       float s = 0;
       return s;
   }
}
