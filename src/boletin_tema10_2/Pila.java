package boletin_tema10_2;

public interface Pila {

    /**
     * Metodo para saber si el array esta lleno o esta vacio
     * @return delvuelve un true si esta vacia y un false si esta llena
     */
    boolean siPilaVacia();

    /**
     * Metodo para introducirle valores al array introducidos por parametros uno a uno
     * @param num
     */
    void apilar(int num);

    /**
     * Metodo para ir "desapilando" en el array, es decir restarle una posision al indice cima
     * @return la posision del indice cima
     */

    Integer desapilar();

    /**
     * Metodo para delvolver el valor en el que apunta el indice cima
     * @return  el numero que se encuentra dentrdo del array en dicha posision
     */
    Integer devolverValorCima();

    /**
     * Metodo para indicar la posision en la que se encuantra el indice cima
     * @return
     */
    int devolverElemento();
}
