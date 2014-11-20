
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    // objeto NumberDisplay que guarda la hora
    private NumberDisplay hour;
    //objeto NumberDisplay que guarda los minutos
    private NumberDisplay minutes;
    //un String de 5 caracteres
    private String newTime;

    /**
     * Constructor for objects of class ClockDisplay
     * con atributos inicializados a 0
     */
    public ClockDisplay()
    {
        
        hour= new NumberDisplay(24);
        minutes=new NumberDisplay(60);
        updateDisplay();
       
    }

    /**
     * Constructor que crea un reloj con las horas y minutos 
     * 
     */
    public ClockDisplay(int newHour, int newMinutes)
    {
      hour = new NumberDisplay(24);
      hour.setValue(newHour);
      minutes = new NumberDisplay(60);
      minutes.setValue(newMinutes);
      updateDisplay();
    }
    
    /**
     * Metodo que fije el tiempo actual del reloj
     */
    public void setTime(int newHour,int newMinutes)
    {
        hour.setValue(newHour);    
        minutes.setValue(newMinutes);
        updateDisplay();
    }
    /**
     * Metodo que devuelve la hora como una cadena de 5 caracteres
     */
    public String getTime()
    {                       
         return newTime;
    }
    /**
     * Avanza la hora actual 1 minuto
     */
    public void timeTick()
    {
        minutes.increment();
        if(minutes.getValue()== 0)
        {
            hour.increment();
        }    
       updateDisplay();
    }  
    /**
     * Actualiza el atributo newTime y da formato de 12 horas al reloj
     */
    private void updateDisplay()
    {
        newTime = (hour.getDisplayValue())+":"+(minutes.getDisplayValue());
        if(hour.getValue() >11)
        {
           int format;
           format = hour.getValue() - 12;
            if(format>10)
           {
                newTime= format + ":" + minutes.getDisplayValue()+ " PM";
           }   
           else
           {
               newTime = "0" + format + ":" + minutes.getDisplayValue()+ " PM";
           }
        }   
        else
        {
            newTime =hour.getDisplayValue()+":"+ minutes.getDisplayValue()+ " AM";
        }
    }    
}