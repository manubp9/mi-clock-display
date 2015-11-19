
/**
 * Tener 2 atributos de tipo NumberDisplay, uno para las horas y otro para los minutos.
Tener un atributo de tipo String donde se almacena la hora actual del reloj con 5 caracteres.
Tener 2 constructores: uno sin parámetros, que fija la hora a "00:00" y otro con 2 parámetros de tipo int, que representan las horas y los minutos a los que fijar la hora actual.
Tener un método setTime que acepte dos parámetros de tipo int, que representan horas y minutos, y que fije dichos valores como el tiempo actual del reloj.
Tener un método getTime que devuelva la hora como String de 5 caracteres.
Tener un método timeTick que haga avanzar un minuto la hora actual (sea esta la que sea originalmente).
Una vez que hayas comprobado que funciona, sube el repositorio a GitHub e indica la URL del último commit como respuesta de esta actividad.
/**
 * 
 * Se pide que modifiques el código del proyecto del reloj para que funcione como un reloj
 * en formato de 12 horas en vez de 24.

 * El funcionamiento del reloj en formato de 12 horas debe ser conforme al que describe la Wikipedia:

 * http://es.wikipedia.org/wiki/Sistema_horario_de_12_horas

 * Solo puedes modificar el código de 

 * la clase ClockDisplay y no puedes cambiar bajo ningún concepto las cabeceras de los métodos 

 * y constructores.
 * El sistema horario de 12 horas es una convención de medición del tiempo en la que las 24 horas del día
 * se dividen en dos períodos1 ante merídiem (a. m., español: "antes del mediodía") y post merídiem 
 * (p. m., español: "después del mediodía").2 Cada período se compone de 12 horas, cuya numeración comienza en el 12
 * (actuando como 0), 1, 2 y sucesivamente hasta 11. Para las doce de la mañana se recomienda el empleo de la abreviatura Md(Medio-Día).
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
       horas = new NumberDisplay(24);
       minutos = new NumberDisplay(60);
       horaActual = horas.getDisplayValue() + ":" + minutos.getDisplayValue();
    }
    /**
     * constructor para representar horas y minutos
     */
    public ClockDisplay(int horasActual, int minutosActual)
    {
       horas = new NumberDisplay(24);
       minutos = new NumberDisplay(60);
       horas.setValue(horasActual);
       minutos.setValue(minutosActual);
       if ( horasActual > 12 )
       horaActual = horas.getValue() - 12 + ":" + minutos.getDisplayValue() + "pm";
       else horaActual = horas.getValue() + ":" + minutos.getDisplayValue() + "am";
       
       
       
       
    }
    /**
     * Tener un método setTime que acepte dos parámetros de tipo int, que representan horas y minutos, 
     * y que fije dichos valores como el tiempo actual del reloj.
     */
    public void setTime(int horasActual , int minutosActual)
    {
        horas = new NumberDisplay(24);
        minutos = new NumberDisplay(60);
        horas.setValue(horasActual);
        minutos.setValue(minutosActual);
        if ( horasActual > 12 )
       horaActual = horas.getValue() - 12 + ":" + minutos.getDisplayValue() + "pm";
       else horaActual = horas.getValue() + ":" + minutos.getDisplayValue() + "am";
       
       
        
        
    }
    /**
     *  un método getTime que devuelva la hora como String de 5 caracteres.
     */
    public String getTime ()
    {
        
       return horaActual;
        
    }
   /**
    * método timeTick que haga avanzar un minuto la hora actual (sea esta la que sea originalmente).
    */
   public void timeTick()
   {
       minutos.increment();
       if ( minutos.getValue() == 0){
           horas.increment();
        }
       if ( horasActual > 12 ) horaActual =  horaActual = horas.getValue() - 12 + ":" +( minutos.getDisplayValue() + 1) + "pm";
       else horaActual = horas.getValue() + ":" + (minutos.getDisplayValue() +1) + "am";
    }  
}
       

    
    



