/**
     * Constructor for objects of class NumberDisplay
     * Un constructor que recibe por parámetro el límite del display y que fija el valor actual del display a 0.
     * Un método setter que fija el valor actual del display al valor pasado como parámetro (nombre del método: setValue).
     * Un método que devuelve el valor actual del display en forma de cadena de 2 caracteres (nombre del método: getDisplayValue).
     * Un método que devuelve el valor actual del display como entero (nombre del método: getValue),
     * Un método que incrementa en 1 al display y lo hace volver al principio si alcanza el límite (nombre del método: increment)
     * 
     * Añade al proyecto donde desarrollaste la clase NumberDisplay una nueva clase llamada ClockDisplay. Esta nueva clase debe:

Tener 2 atributos de tipo NumberDisplay, uno para las horas y otro para los minutos.
Tener un atributo de tipo String donde se almacena la hora actual del reloj con 5 caracteres.
Tener 2 constructores: uno sin parámetros, que fija la hora a "00:00" y otro con 2 parámetros de tipo int, que representan las horas y los minutos a los que fijar la hora actual.
Tener un método setTime que acepte dos parámetros de tipo int, que representan horas y minutos, y que fije dichos valores como el tiempo actual del reloj.
Tener un método getTime que devuelva la hora como String de 5 caracteres.
Tener un método timeTick que haga avanzar un minuto la hora actual (sea esta la que sea originalme
     */
public class NumberDisplay
{
    // instance variables - replace the example below with your own
    private int limit;
    private int display;
    

    /**
     * constructor parametro limite y lo fija a 0.
     */
    public NumberDisplay(int limite)
    {
       limit = limite;
       display = 0 ;
    }
    /**
     * setter que fija el valor actual del display al valor pasado como parámetro 
     */
    public void setValue(int value){
        if (value >= 0 && value < limit)
        display = value;
        else  System.out.println (" valor introducido incorrecto");
    }
   
    /**
     * método que devuelve el valor actual del display en forma de cadena de 2 caracteres
     */
    public String getDisplayValue(){
        String displayValue;
        if (display >=0 && display> 10){
            displayValue = "0" + display ;
        }
        else 
        { 
            displayValue = "" + display;
        }
           
        return displayValue;
    }
    /**
     * Un método que devuelve el valor actual del display como entero (nombre del método: getValue)
     */
    public int getValue(){
        return display ;
    }
    /**
     * Un método que incrementa en 1 al display y lo hace volver al principio si alcanza el límite
     */
    public void increment(){
        display++ ;
        if ( display == limit) {
            display = 0;
        }
      
            
    }
}

        
    


