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
   private ArrayList<CuentaBancaria> Cuentas;
   
   public Banco()
   {
       Cuentas = new ArrayList<CuentaBancaria>();
   }
   
   public void AgregaCuenta(CuentaBancaria c)
   {
       Cuentas.add(c);
   }
   
   public float CalculaPromedio()
   {
       float s = 0;
       return s;
   }
}
