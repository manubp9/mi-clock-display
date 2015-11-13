/**
     * Constructor for objects of class NumberDisplay
     * Un constructor que recibe por parámetro el límite del display y que fija el valor actual del display a 0.
     * Un método setter que fija el valor actual del display al valor pasado como parámetro (nombre del método: setValue).
     * Un método que devuelve el valor actual del display en forma de cadena de 2 caracteres (nombre del método: getDisplayValue).
     * Un método que devuelve el valor actual del display como entero (nombre del método: getValue),
     * Un método que incrementa en 1 al display y lo hace volver al principio si alcanza el límite (nombre del método: increment)
     */
public class NumberDisplay
{
    // instance variables - replace the example below with your own
    private int limit;
    private int display;
    

    /**
     * constructor parametro limite y lo fija a 0.
     */
    public NumberDisplay()
    {
       limit = limit;
       display = 0;
    }
    /**
     * setter que fija el valor actual del display al valor pasado como parámetro 
     */
    public void setValue(int value){
        display = value  ;
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
    
}

        
    


