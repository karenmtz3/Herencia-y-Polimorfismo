
/**
 * Write a description of class Utileria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Utileria
{      
    public static float CalculaPromedio(Measurable []Coleccion)
    {
       float s=0;
       for(Measurable col : Coleccion)
       {
           s += col.obtenerMedida();
       }
       if(Coleccion.length > 0 )
       {
           return s/Coleccion.length;
       }
       else
       {
           return 0;
       }
    }
}
