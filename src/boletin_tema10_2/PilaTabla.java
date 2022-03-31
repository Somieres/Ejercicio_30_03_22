package boletin_tema10_2;

import java.util.Arrays;

public class PilaTabla implements Pila{

    private static Integer [] pilaTabla;
    private static int indiceCima;
    static final int VACIA= -1;

    public PilaTabla(int num) {

        pilaTabla=new Integer[num];
        indiceCima = -1;
    }

    public PilaTabla(){
        pilaTabla=new Integer[10];
        indiceCima = -1;
    }
    @Override
    public boolean siPilaVacia(){

        return (indiceCima==VACIA);
    }

    public boolean siPilaLlena(){
        boolean llena=false;
        if (indiceCima>=pilaTabla.length+1){
            llena=true;
        }
        return llena;
    }

    /**
     * Metodo por el que a medida que vamos introduciendo valores al array
     * aumente en uno su indiceCima y debemos controlar que la pila no este llena
     *y llegado el caso, aumentamos el array en 10 posisiones mas
     */
    @Override
    public void apilar(int num){


        if (!siPilaLlena()){
            pilaTabla= Arrays.copyOf(pilaTabla,pilaTabla.length+10);
        }
            indiceCima++;
            pilaTabla[indiceCima]=num;






    }
//Desapilar un elemento del primer lugar de la tabla.
// Si está vacía la pila, devuelve null

    @Override

    public Integer desapilar(){

        Integer valor;

        if (siPilaVacia()){
            valor=null;
        }

        valor=pilaTabla[indiceCima];
        indiceCima--;
        return valor;
    }

//Método que devolverá el valor del elemento que se encuentra en la cima, o null
// si la pila está vacía;
    @Override
    public Integer devolverValorCima(){

        Integer valor;

        if (siPilaVacia()){
            valor= null;
        }else{
            valor=pilaTabla[indiceCima];
        }

        return valor;
    }

            @Override
    public String toString() {
          return  Arrays.toString(pilaTabla);
    }

    @Override
    public int devolverElementos(){

        return indiceCima+1;
    }
}
