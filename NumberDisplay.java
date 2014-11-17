
/**
 * Write a description of class NumberDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumberDisplay
{
    //valor almacenado
    private int value;
    //limite al que puede llegar el valor
    private int limit;

    /**
     * Constructor for objects of class NumberDisplay
     */
    public NumberDisplay(int newLimit)
    {
        
        value = 0;
        limit = newLimit;
       
    }

    /**
     * Metodo para fijar el valor actual del display
     */
    public void setValue(int newValue)
    {
        if(newValue<limit && newValue>=0)
        {
            value = newValue;
        }
    } 
    /**
     * Metodo que devuelve el valor actual del display 
     * en forma de cadena de 2 caracteres
     */
    public String getDisplayValue()
    {
        String displayValue;
        if(value<10)
        {
            displayValue = "0" + value;
        }
        else
        {
            displayValue = "" + value;
        }    
        return displayValue;
    }
    /**
     * Metodo que devuelve el valor actual del display
     * como entero
     */
    public int getValue()
    {
        return value;
    }
    /**
     * Metodo que incrementa en 1 el display
     * y lo hace volver al principio si alcance el limite
     */
    public void increment()
    {
        value = value +1;
        //si alcanza el limite lo hace volver al principio
        if(value == limit)
        {
            value = 0;
        }
    }    
}   
  
