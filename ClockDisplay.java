
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    // indica el valor de la hora
    private NumberDisplay hour;
    //indica el valor de los minutos
    private NumberDisplay minutes;
    //indica la hora con cadena de 5 caracteres
    private String newTime;

    /**
     * Constructor for objects of class ClockDisplay
     * con atributos inicializados a 0
     */
    public ClockDisplay()
    {
        
        hour= new NumberDisplay(24);
        minutes=new NumberDisplay(60);
        newTime = "0"+ ":"+"0";
       
    }

    /**
     * Constructor para la clase ClockDisplay
     * 
     */
    public ClockDisplay(int newHour, int newMinutes)
    {
      hour = new NumberDisplay(24);
      hour.setValue(newHour);
      minutes = new NumberDisplay(60);
      minutes.setValue(newMinutes);
      newTime = (hour.getDisplayValue())+":"+(minutes.getDisplayValue());
    }
    
    
}