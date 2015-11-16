
/**
 * Tener 2 atributos de tipo NumberDisplay, uno para las horas y otro para los minutos.
Tener un atributo de tipo String donde se almacena la hora actual del reloj con 5 caracteres.
Tener 2 constructores: uno sin parámetros, que fija la hora a "00:00" y otro con 2 parámetros de tipo int, que representan las horas y los minutos a los que fijar la hora actual.
Tener un método setTime que acepte dos parámetros de tipo int, que representan horas y minutos, y que fije dichos valores como el tiempo actual del reloj.
Tener un método getTime que devuelva la hora como String de 5 caracteres.
Tener un método timeTick que haga avanzar un minuto la hora actual (sea esta la que sea originalmente).
Una vez que hayas comprobado que funciona, sube el repositorio a GitHub e indica la URL del último commit como respuesta de esta actividad.
 * 
 
 */
public class ClockDisplay
{
    // instance variables - replace the example below with your own
    private NumberDisplay horas;
    private NumberDisplay minutos;
    private String horaActual;
    
    

    /**
     * Constructor inicia la hora a 00:00 
     */
    public ClockDisplay()
    {
       //fija la hora a 00:00
       horas = new NumberDisplay(23);
       minutos = new NumberDisplay(59);
    }
    /**
     * constructor para representar horas y minutos
     */
    public ClockDisplay(int horasActual, int minutosActual)
    {
       horas = new NumberDisplay(23);
       minutos = new NumberDisplay(59);
       horas.setValue(horasActual);
       minutos.setValue(minutosActual);
       
       
    }
    /**
     * Tener un método setTime que acepte dos parámetros de tipo int, que representan horas y minutos, 
     * y que fije dichos valores como el tiempo actual del reloj.
     */
    public void setTime(int horasActual , int minutosActual)
    {
        horas = new NumberDisplay(23);
        minutos = new NumberDisplay(59);
        horas.setValue(horasActual);
        minutos.setValue(minutosActual);
    }
    /**
     *  un método getTime que devuelva la hora como String de 5 caracteres.
     */
    public String getTime ()
    {
        horaActual = horas.getDisplayValue() + ":" + minutos.getDisplayValue();
        return horaActual;
        
    }
   
}
    
    



