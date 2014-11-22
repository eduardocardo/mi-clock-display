
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
    //un String de 5 caracteres que indica la hora y minutos
    private String newTime;
    //objeto NumberDisplay que guarda el dia
    private NumberDisplay day;
    //objeto NumberDisplay que guarda el mes
    private NumberDisplay month;
    //objeto NumberDisplay que guarda el año
    private NumberDisplay year;
    //String de de 8 caracteres que indica el dia,mes y año
    String newDate;

    /**
     * Constructor for objects of class ClockDisplay
     * con atributos inicializados a 0
     */
    public ClockDisplay()
    {
        
        hour= new NumberDisplay(24);
        minutes=new NumberDisplay(60);
        day = new NumberDisplay(31);
        month = new NumberDisplay(13);
        year = new NumberDisplay(100);
        updateDisplay();
       
    }

    /**
     * Constructor que crea un reloj con las horas y minutos 
     * 
     */
    public ClockDisplay(int newHour, int newMinutes,int newDay,int newMonth,int newYear)
    {
      hour = new NumberDisplay(24);
      hour.setValue(newHour);
      minutes = new NumberDisplay(60);
      minutes.setValue(newMinutes);
      day = new NumberDisplay(31);
      day.setValue(newDay);
      month = new NumberDisplay(13);
      month.setValue(newMonth);
      year = new NumberDisplay(100);
      year.setValue(newYear);
      updateDisplay();
    }
    
    /**
     * Metodo que fije el tiempo actual del reloj
     */
    public void setTime(int newHour,int newMinutes,int newDay,int newMonth,int newYear)
    {
        hour.setValue(newHour);    
        minutes.setValue(newMinutes);
        day.setValue(newDay);
        month.setValue(newMonth);
        year.setValue(newYear);
        updateDisplay();
    }
    /**
     * Metodo que devuelve la hora como una cadena de 5 caracteres
     */
    public String getTime()
    {                       
         return newTime + " " + newDate;
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
            if(hour.getValue() == 0)
            {
                day.increment();
                if(day.getValue() == 0)
                {
                    day.increment();
                    month.increment();
                    if(month.getValue() == 0)
                    {
                        month.increment();
                        year.increment();
                    }            
                }
            }
        }   
       updateDisplay();
    }  
    /**
     * Actualiza el atributo newTime y da formato de 12 horas al reloj
     */
    private void updateDisplay()
    {
        newTime = (hour.getDisplayValue())+":"+(minutes.getDisplayValue());
        if(hour.getValue() >12)
        {
           int format;
           format = hour.getValue() - 12;
            if(format>=10)
           {
                newTime= format + ":" + minutes.getDisplayValue()+ " PM";
           }   
           else
           {
               newTime = "0" + format + ":" + minutes.getDisplayValue()+ " PM";
           }
        }
        else if(hour.getValue() == 12)
        {
            newTime = hour.getDisplayValue() + ":" + minutes.getDisplayValue() + " PM";
        }    
        else
        {
            if(hour.getValue() == 0)
            {
                newTime = "12" + ":" + minutes.getDisplayValue() + " AM";
            }
            else
            {
                newTime = hour.getDisplayValue()+ ":" + minutes.getDisplayValue()+ " AM";
            }    
        }
        newDate = day.getDisplayValue() + "/" + month.getDisplayValue() + "/" + year.getDisplayValue();
    }
    }