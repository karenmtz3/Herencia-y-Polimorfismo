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
      Banco b = new Banco();
      CuentaBancaria b1 = new CuentaBancaria(100);
      CuentaBancaria b2 = new CuentaBancaria(200);
      CuentaBancaria b3 = new CuentaBancaria(300);
      b.AgregaCuenta(b1);
      b.AgregaCuenta(b2);
      b.AgregaCuenta(b3);
      
      System.out.println(b.CalculaSaldoProm());
   }
}
