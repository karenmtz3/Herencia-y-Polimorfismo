import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer;
/**
 * Write a description of class Lienzo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lienzo extends JPanel
{
    private Pelota pelota;
    
    public Lienzo()
    {
        pelota = new Pelota(100,100,10);
        EscuchadorTiempo escuchaTiempo = new EscuchadorTiempo();
        Timer tiempo = new Timer(1000,escuchaTiempo);
        tiempo.start();
    }
    
    class EscuchadorTiempo implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            /*pelota.muevete() //cambia de posicion
            this.repaint();
            System.out.println("Hola Pelota c:");*/
        }
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        pelota.dibujate(g);
    }
   
}
