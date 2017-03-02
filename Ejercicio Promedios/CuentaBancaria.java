
/**
 * Write a description of class CuentaBancaria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CuentaBancaria
{
   private int saldo;
   
   public CuentaBancaria(int c)
   {
       saldo = c;
    }
   
   public float DarSaldo()
   {
       return (float)saldo;
   }
}

