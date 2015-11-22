
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

 *Modifica a partir de la actividad 027 el código de la clase ClockDisplay para que sea un reloj además muestre el año, el mes y el día.
 * Para simplificar vamos a imaginar que todos los meses tienen 30 días.
 *El reloj debe poder ser construido indicando un momento temporal como el expresado anteriormente 
y el método setTime también debe permitir fijar un momento temporal completo (es decir, no solo las horas y minutos).
Una vez hayas completado la tarea, indica la URL del último commit subido a Github.
 **El constructor que pone una fecha por defecto debe fijar la fecha de deseis (si conseguis que fije la fecha de hoy lo valoraré aun mas) 
 **y el constructor que admite fijar un momento temporal debe permitir definir por parametro el día, el mes y el año.

El año se muestra en el reloj con dos dígitos.

Una vez hayas completado la tarea, indica la URL del último commit subido a Github.
 */
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    // Guarda la hora
    private NumberDisplay horas;
    // Guarda los minutos
    private NumberDisplay minutos;
    // Almacena la hora actual con 5 caracteres
    private String horaActual;
    //Permite elegir entre formato 12h (true) o 24h (false)
    private boolean tipoReloj;
    //guarda año
    private NumberDisplay año;
    //guarda el mes
    private NumberDisplay mes;
    //guarda el dia
    private NumberDisplay dia;
    //Almacena la fecha actual en formato DD/MM/HH
    private String fechaActual;

    /**
     * Crea un objeto ClockDisplay con hora por defecto 00:00.te da a elegir formato de 12h a 24 con un parametro booleano.
     * pone año mes y dia por defecto y se representan con un string.
     * 
     */
    
    
    public ClockDisplay(boolean tipoHora)
    {
        tipoReloj = tipoHora;
        horas = new NumberDisplay(24);
        minutos = new NumberDisplay(60);
        año = new NumberDisplay(100);
        mes = new NumberDisplay (13);
        dia = new NumberDisplay (31);
        updateHoraActual();
        fechaActual = dia.getDisplayValue() + "/"+ mes.getDisplayValue() + "/"+ año.getDisplayValue();
        

    }

    /** 
     * Crea un objeto ClockDisplay con la hora , los minutos dados , ya añado año, mes y dia.
     */
    public ClockDisplay (int horasX, int minutosX, int añoX , int mesX ,int diaX)
    {
        horas =   new NumberDisplay(24);
        minutos = new NumberDisplay(60); 
        año = new NumberDisplay(100);
        mes = new NumberDisplay (13);
        dia = new NumberDisplay (31);
        horas.setValue(horasX); 
        minutos.setValue(minutosX);
        año.setValue(añoX);
        mes.setValue(mesX);
        dia.setValue(diaX);
        updateHoraActual();
        fechaActual = dia.getDisplayValue() + "/"+ mes.getDisplayValue() + "/"+ año.getDisplayValue();
           }

    /**
     * Fija la hora del reloj a la hora  los minutos dados el año el mes y el dia. te da a elegir entre formato 12h o 24h.
     */
    public void setTime(int horaY, int minutoY ,int añoY , int mesY ,int diaY, boolean reloj12H)
    {
        horas.setValue(horaY);  
        minutos.setValue(minutoY);
        año.setValue(añoY);
        mes.setValue(mesY);
        dia.setValue(diaY);
        fechaActual = dia.getDisplayValue() + "/"+ mes.getDisplayValue() + "/"+ año.getDisplayValue();
        
    }

    /**
     * Devuelve la hora del reloj como una cadena de 5 caracteres
     */
    public String getTime()
    {
        return horaActual;
    }

    /**
     * Hace avanzar la hora 1 minuto
     */
    public void timeTick()
    {{
       minutos.increment();
       if (minutos.getValue() == 0){
           horas.increment();
           if (horas.getValue() == 0){
               if (dia.getValue() == 30){
                   dia.increment();
                   dia.increment();
                   if (dia.getValue() == 1){
                       if (mes.getValue() == 12){
                           mes.increment();
                           mes.increment();
                           if (mes.getValue() == 1){
                               año.increment();
                           }
                       }
                       else{
                           mes.increment();
                       }
                   }
               }
               else {
                   dia.increment();
               }
           }
       }
       updateHoraActual();
   }
        
    }

    /**
     * Actualiza el atributo horaActual siguiendo las normas de un
     * reloj de 12 horas.
     * se añade la fecha 
     */
    public void updateHoraActual()
    {
        if (tipoReloj == true){ // (relojDe12H) es lo mismo
            String formato = "a.m.";
            int horaAhora = horas.getValue(); 
            if (horaAhora >= 12){
                formato = "p.m.";
            }

            if (horaAhora > 12) {
                horaAhora = horaAhora - 12;
            }
            else if (horaAhora == 0) {
                horaAhora = 12;
            }
            horaActual = horaAhora + ":" + minutos.getDisplayValue() + " /"  + dia.getDisplayValue() +"/"+ mes.getDisplayValue() +"/"+ año.getDisplayValue();
        }
        else {
            horaActual = horas.getDisplayValue() + " : " + minutos.getDisplayValue()+" /"+ dia.getDisplayValue()+"/" + mes.getDisplayValue() +"/"+ año.getDisplayValue();
        }
    }

    /**
     * Método que permite alternar entre los modos del reloj
     */
    public void changeFormat()
    {
       tipoReloj = !tipoReloj;
       updateHoraActual();
    }	
   
}

