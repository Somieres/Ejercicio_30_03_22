package boletin_tema10_2;


public class Main_boletin_tema10 {


    public static void main(String[] args) {
        /**
         * Creamos dos arrays, una array normal que es tabla 1 y un arrayList que es la tabla 2
        */

        Pila  pilaTabla = new PilaTabla(2);
        Pila pilaLista = new PilaLista();

        /**
         * Imprimimos la funcion pila vacia para verificar que se encuantra vacia
         * por lo que debe de devolver un true, ya que se encuantra vacia, si no fuera asi devolveria un false
         */

        System.out.println(" Esta vacia= " + pilaTabla.siPilaVacia());

        /**
         * Introducimos 12 posisiones a la pila, al tener inicialmente 10, con el metodo apilar, cuando llega
         * al maximo de posisiones, le implementa a traves de un copyOf 10 posiciones mas.
         */

        pilaTabla.apilar(4);
        pilaTabla.apilar(7);
        pilaTabla.apilar(9);
        pilaTabla.apilar(50);
        pilaTabla.apilar(99);
        pilaTabla.apilar(1200);
        pilaTabla.apilar(75);
        pilaTabla.apilar(41);
        pilaTabla.apilar(26);
        pilaTabla.apilar(18);
        pilaTabla.apilar(37);
        pilaTabla.apilar(52);

        /**
         * devolvemos el valor de la cima
         */

        System.out.println("El valor de la cima es: " + pilaTabla.devolverValorCima());

        /**
         * Usamos el metodo devolver elemento para saber cuantos elementos existen en el valor cima
         */


        System.out.println("El numero de elementos introducidos es el array es: " + pilaTabla.devolverElemento() + " posiciones");

        /**
         * A traves de estos metodos lo que estamos es "eliminando" valores a al indice de la lista, estamos eliminado posiciones en
         * el indice cima y que el puntero apunte donde queremos que este, y nos muestre el valor que tiene en ese posision
         */

        pilaTabla.desapilar();
        pilaTabla.desapilar();
        pilaTabla.desapilar();
        pilaTabla.desapilar();
        pilaTabla.desapilar();
        pilaTabla.desapilar();

        /**
         * volvemos a utilizar los metodos para conocer el valor de la posicion cima y que delvuelva el valor de la posicion
         *          en la que se encuentra
         */

        System.out.println("El valor de la cima es: " + pilaTabla.devolverValorCima());
        System.out.println("Tras eliminar 6 posisiones quedan: " + pilaTabla.devolverElemento() + " posiciones");
        System.out.println(pilaTabla);
        /**
         * Introducimos datos en el arrayList
         */
        pilaLista.apilar(5);
        pilaLista.apilar(8);
        pilaLista.apilar(11);
        pilaLista.apilar(90);
        pilaLista.apilar(45);
        pilaLista.apilar(150);
        pilaLista.apilar(80);
        pilaLista.apilar(99);
        pilaLista.apilar(31);
        pilaLista.apilar(20);
        pilaLista.apilar(42);
        pilaLista.apilar(37);

        /**
         * A traves de estos metodos lo que estamos es "eliminando" valores a al indice de la lista, estamos eliminado posiciones en
         * el indice cima y que el puntero apunte donde queremos que este, y nos muestre el valor que tiene en ese posision
         */
        System.out.println("El valor de la cima es: " + (pilaLista.devolverValorCima()));
        System.out.println("El numero de elementos introducidos es el arrayList es: " + pilaLista.devolverElemento());

        /**
         * Eliminamos valores del arrayList
         */
        System.out.println(pilaLista);
        pilaLista.desapilar();
        pilaLista.desapilar();
        pilaLista.desapilar();
        pilaLista.desapilar();
        pilaLista.desapilar();
        pilaLista.desapilar();

        /**
         * volvemos a utilizar los metodos para conocer el valor de la posicion cima y que delvuelva el valor de la posicion
         * en la que se encuentra
         */
        System.out.println("El valor de la cima es: " + pilaLista.devolverValorCima());
        System.out.println("Tras eliminar 6 posisiones quedan: " + pilaLista.devolverElemento());
        /**
         * Imprimimos el valor del arrayList y se observa que los elementos se han borrado
         */
        System.out.println(pilaLista);

    }
}
