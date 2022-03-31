package Ejercicioo_clase;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        List<Integer> num1 = new ArrayList<>();
        List<Integer> num2= new ArrayList<>();
        num1.add(1);
        num1.add(2);
        num1.add(3);
        num2.add(4);
        num2.add(5);
        num2.add(6);



        // Metodo para obtener un elemento del arrayList indicando el indice del que
        // queremos conocer el valor en dicha posicion
        num2.get(0);
        System.out.println(num2);
        //guardar elem en la posición que indica
        //indice y devuelve el valor que había en dicha posición
        num1.set(2, -3);
        System.out.println(num1);


        //observamos como ha cambiado el valor de la posicion nº 4
        // al utilizar la funcion get(int indice, E element)
        System.out.println(num1.get(2));

        // void.add- guarda elementos en la posición que indica indice sin machacar
        // el valor previo, es decir le agrega una posicion al arrayList con el numero introducido en el indice dado.
        // Por lo que el array de num1 pasaria a tener 4 posisiones y en la posision 0 estaria el 21 y sucesivamente, el resto
        // de los numeros introducidos


        num1.add(0,21);
        System.out.println(num1);

        // addAll sirve para unir dos arrays del mismo tipo, por lo que no es necesario crear una nueva con
        // posiciones extras.
       // num1.addAll(num2);
       // System.out.println(num1);
/**
 * Sirve para eliminar una posision en concreto del arrayList
 */
        num2.remove(0);
        System.out.println(num2);
        num2.remove(new Integer(5));

    }


}


       /* Cliente cliente = new Cliente("Marta", "11111J", 20);
        Cliente cliente2 = new Cliente("Eva", "22222A", 40);
        Cliente cliente3 = new Cliente("Sofia", "33333B", 35);
        Cliente cliente4 = new Cliente("Jesusa", "44444C", 85);
        List<Cliente> listaCliente = new ArrayList<>();

        //Introducir elementos en el array
        listaCliente.add(cliente);
        listaCliente.add(cliente2);
        listaCliente.add(cliente3);
        listaCliente.add(cliente4);
        //Meter elemementos a traves del mismo array
        listaCliente.add(new Cliente("Manuel", "284585454L", 20));
        // Eliminiar elemento del array list
        // listaCliente.remove(cliente);
        // Implementamos el metodo equals en la clase Cliente y lo comparamos con el dni y nos devuelve un true o un
        // false dependiendo de los datos introducidos son iguales o no. Implementamos este metodo para poder hacer
        // un contains

        System.out.println(listaCliente.contains(new Cliente("22222A")));


     //  // Iterator
     //Iterator iterator = listaCliente.iterator();
      //  for (; iterator.hasNext();
      //  ) {
      //      Cliente clientela = (Cliente) iterator.next();
     //       System.out.println(clientela);

     //   }

      Iterator<Cliente> iterator = listaCliente.iterator();
      //   while (iterator.hasNext()){

      //      Cliente p=iterator.next();
      //      if (p.getEdad() >80){
      //          iterator.remove();
     //       }

     //    }
     //   System.out.println(listaCliente);*/

/* ListIterator listIterator=listaCliente.listIterator(listaCliente.size());*/







