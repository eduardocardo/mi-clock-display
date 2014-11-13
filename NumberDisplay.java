
/**
 * Write a description of class NumberDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumberDisplay
{
    //valor de las horas/minutos
    private int value;
    //limite de las horas minutos
    private int limit;

    /**
     * Constructor for objects of class NumberDisplay
     */
    public NumberDisplay(int max)
    {
        
        value = 0;
        limit = max;
       
    }

    /**
     * Metodo para fijar el valor actual del display
     */
    public void setValue(int newTime)
    {
        value = newTime;
    }    
}     
