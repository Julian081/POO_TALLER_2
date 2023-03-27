
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class Prueba {
    
    public static void main(String[] args) {

        Scanner lectura=new Scanner(System.in);
        animal guacamayo = new animal();
        movie titanic=new movie();
        animal panda=new animal();
        movie up=new movie("up", "Familiar",2005,110);
        movie lanochedeldemonio=new movie("lanochedeldemonio","terror",2002,125);

        guacamayo.setnombre("pancho");
        guacamayo.setedad(8);
        guacamayo.mostraranimal();

        System.out.println("el nombre del guacamayo es"+guacamayo.getnombre()+"y su edad es"+guacamayo.getedad());

    System.out.println("ingrese el nombre del animal");
    String nombre= lectura.nextLine();
    System.out.println("Ingrese la edad del animal");
    int edad= lectura.nextInt();
        guacamayo.resgitaranimal(nombre, edad);//invocar o llamar metodo
        guacamayo.mostraranimal();

        int duplicado=guacamayo.duplicaredad(edad);
        System.out.println("la edad duplicada del animal es"+duplicado);
    }
}
