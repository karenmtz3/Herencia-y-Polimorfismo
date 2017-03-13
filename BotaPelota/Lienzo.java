import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;
import java.awt.Rectangle; 

/**
 * Write a description of class Lienzo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lienzo extends JPanel
{
    private LinkedList <Pelota> pelotas;
    
    public Lienzo()
    {
        pelotas = new LinkedList<Pelota>();
        pelotas.add(new Pelota(100,100,10));
        EscuchadorRaton escuchaRaton = new EscuchadorRaton();
        this.addMouseListener(escuchaRaton);
    }
    
    public void actua()
    {
        Rectangle r = this.getBounds();
        //le indica que se meuven las pelotas
         for(Pelota p: pelotas)
        {
            p.muevete(r);
        }
        this.repaint();
    }
    
    class EscuchadorRaton extends MouseAdapter
    {
        @Override
        public void mouseClicked(MouseEvent me)
        {
            //genera un numero aleatorio entre 10 y 30 para el tamaño
            int tamRandom = 10 + (int)(Math.random() * 20);
            Pelota pelotaNueva = new Pelota(me.getX(),me.getY(),tamRandom);
            pelotas.add(pelotaNueva);
        }
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        //borra el panel para dibujar las pelotas en una nueva posicion 
        super.paintComponent(g);
        //dibuja todas las pelotas
        for(Pelota p: pelotas)
        {
            p.dibujate(g);
        }

    }
   
}
