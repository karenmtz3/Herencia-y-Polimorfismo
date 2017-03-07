
/**
 * Write a description of class Pais here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pais implements Measurable
{
   private int hab;
     
   public Pais(int h)
   {
       hab = h;
   }
   
   
   public int obtenerMedida()
   {
       return hab;
   }
   
}
