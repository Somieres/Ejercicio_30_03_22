import java.util.ArrayList;
import java.util.List;

public class Casa {

    public static void main(String[] args) {

        List <Casa> chalets=new ArrayList<>();

        chalets.add(new Casa("Eva Ramos", "El Peral n 2"));
        chalets.add(new Casa("Jessica Ramos", "El Peral n 3"));
        chalets.add(new Casa("Jesus Miguel Ramos", "El Peral n 1"));
        chalets.add(new Casa("Rosario Leon", "El Peral n 2"));

        System.out.println(chalets);




    }

    private int metrosCuadrados;
    private int numeHab;
    private String owner;
    private String nombreCalle;
    private double precio;



    public Casa( String owner, String nombreCalle) {
        this.metrosCuadrados=100;
        this.numeHab = 4;
        this.owner = owner;
        this.nombreCalle = nombreCalle;
        this.precio = 200000;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getNombreCalle() {
        return nombreCalle;
    }

    public void setNombreCalle(String nombreCalle) {
        this.nombreCalle = nombreCalle;
    }

    @Override
    public String toString() {
        return "El chalete " +
                " tiene " + metrosCuadrados +
                " metros cuadrados, su numero de habitaciones es " + numeHab +
                ", su propietario es '" + owner +
                ", nombreCalle " + nombreCalle +
                " y su precio es de " + precio+System.lineSeparator();
    }

}
