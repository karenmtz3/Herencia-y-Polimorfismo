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
     Measurable[] acc = new Measurable[3];
     acc[0] = new CuentaBancaria(100);
     acc[1] = new CuentaBancaria(200);
     acc[2] = new CuentaBancaria(300);
     
     float promSaldo = Utileria.CalculaPromedio(acc);
     System.out.println("Promedio saldo: " + promSaldo);
      
     Measurable [] paises = new Measurable[3];
     paises[0] = new Pais(25);
     paises[1] = new Pais(32);
     paises[2] = new Pais(94);
     
     float promHab = Utileria.CalculaPromedio(paises);
     System.out.println("Promedio de habitantes: " + promHab);
   }
}
