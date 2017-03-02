import java.util.ArrayList;
import java.util.Iterator;
/**
 * Write a description of class Banco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Banco
{
   private ArrayList<CuentaBancaria> Coleccion;
   
   public Banco()
   {
       Coleccion = new ArrayList<CuentaBancaria>();
   }
   
   public void AgregaCuenta(CuentaBancaria c)
   {
       Coleccion.add(c);
   }
   
   public float CalculaSaldoProm()
   {
       float s=0;
       Iterator<CuentaBancaria> it =  Coleccion.iterator();
       while(it.hasNext())
       {
           CuentaBancaria col = it.next();
           s += col.DarSaldo();
       }
       return (s/Coleccion.size());
   }
}
