package boletin_tema10_2;

import java.util.ArrayList;
import java.util.List;
/*
Clase PilaLista será similar a la anterior pero en esta ocasión la Pila estará formada por objetos
ArrayList de enteros. Se aplicarán los métodos que tengan sentido para este tipo de estructura.
Una vez definida ambas clases, ¿qué habría que cambiar para implementar la Interfaz objeto de
este ejercicio?
 */
public class PilaLista implements Pila{

        private List<Integer> pilaLista;
        private int indiceCima;
        static final int VACIA= -1;

    public PilaLista() {
        pilaLista= new ArrayList<>();
        this.indiceCima=-1;
    }
    @Override
    public boolean siPilaVacia(){

        return (indiceCima==VACIA);
    }

    @Override
    public void apilar(int num){

        indiceCima++;
        pilaLista.add(num);
    }
    @Override
    public Integer desapilar(){

        Integer valor;
        if (siPilaVacia()){
            valor=null;
        }
        valor=pilaLista.remove(indiceCima);
        indiceCima--;
        return valor;
    }
    @Override
    public Integer devolverValorCima(){

        Integer valor;
        if (siPilaVacia()){
            valor=null;

        }else {
            valor = pilaLista.get(indiceCima);
        }
        return valor;
    }

    @Override
    public String toString() {
        return pilaLista.toString();
    }

    @Override
    public int devolverElementos(){

        return indiceCima+1;
    }

}
