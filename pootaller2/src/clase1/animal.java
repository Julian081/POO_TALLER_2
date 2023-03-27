
import java.util.Scanner;
public class animal {
    //atributos
    private String nombre;
    private int Edad;

    Scanner lectura=new Scanner(System.in);
    public animal(){
    }
    public animal(String nombre, int Edad){
        this.nombre=nombre;
        this.Edad=Edad;
    }
    public animal (string nombre, string tipo){
        System.out.println("el nombre es"+nombre+"el tipo es:"+tipo);
    }
    //metodos accesores
    
    public int getedad(){//metodo get
        return Edad;
    }
    public String getnombre(){
        return nombre;
    }
    public void setedad(int Edad){ //metodo set
        this.Edad=Edad;
    } 
    public void setnombre(String nombre){
        this.nombre=nombre;
    }

    //metodos u operaciones
    public void resgitaranimal(String nom,int ed){
        //cuerpo del metodo
        nombre=nom;
        Edad=ed;

    }

    public void mostraranimal(){
        System.out.println("El nombre del animal ingresado es"+nombre+"y tiene"+Edad+"años");
    }
    public int duplicaredad(int edad){

        int duplicado=edad*2;
        return duplicado; 
    }
}
