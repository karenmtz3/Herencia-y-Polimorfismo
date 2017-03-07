
/**
 * Write a description of class Alumno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alumno implements Comparable 
{
    private int Creditos;
    
    public Alumno(int c)
    {
        Creditos = c;
    }
    
    @Override
    public String toString()
    {
        return "Alumno con " + Creditos + " creditos";
    }
    
    
    @Override
    public int compareTo(Object other)
    {
        Alumno tmp = (Alumno) other;
        if(this.Creditos == tmp.Creditos)
            return 0;
        else if(this.Creditos < tmp.Creditos)
            return -1;
        else
            return 1;
        
        //version economico
        //return creditos = ((Alumnos)other).Creditos;
    }
    
    
}
