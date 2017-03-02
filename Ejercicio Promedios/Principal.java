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
      
      Planeta p = new Planeta();
      Pais p1 = new Pais(25);
      Pais p2 = new Pais(32);
      Pais p3 = new Pais(94);
      p.AddPais(p1);
      p.AddPais(p2);
      p.AddPais(p3);
      
      System.out.println("Saldo Promedio = " + b.CalculaSaldoProm());
      System.out.println("Promedio de habitantes= "+p.CalculaHab());
   }
}
