import javax.swing.JFrame;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer;
/**
 * Write a description of class Ventana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ventana extends JFrame
{
  private Lienzo dibujo;
  private Timer tiempo;  
    
   public Ventana(int ancho, int alto)
  {
      //agrega Lienzo
      dibujo = new Lienzo();
      this.add(dibujo);
      
      
      //agreg escuchador de teclado
      EscuchadorTeclado escuchaTeclado = new EscuchadorTeclado();
      this.addKeyListener(escuchaTeclado);
      
      //agrega escuchador del temporalizador
      EscuchadorTiempo esuchaTiempo = new EscuchadorTiempo();
      tiempo = new Timer(100,esuchaTiempo);
      tiempo.start();
      
      this.setSize(ancho,alto);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
    }
    
  class EscuchadorTiempo implements ActionListener
  {
      @Override
      public void actionPerformed(ActionEvent e)
      {
          dibujo.actua();
        }
      }
      
  class EscuchadorTeclado implements KeyListener
  {
      @Override
      public void keyPressed(KeyEvent e)
      {
          if(e.getKeyChar() == 'd')
          {
              tiempo.stop();
            }
            else if(e.getKeyChar() == 'i')
            {
                tiempo.start();
            }
        }
            
        @Override
        public void keyReleased(KeyEvent e)
        {
            //System.out.println("KeyReleaded: " + e.getKeyChar());
        }
          
        @Override
        public void keyTyped(KeyEvent e)
        {
            //System.out.println("KeyTyped: " + e.getKeyChar());
        }
   }
   
}
            
