package polimorfismo;

import java.util.Scanner;

public class Carisellazo implements Juegos {

    private String nombre;
    private int eleccion;
    private int lanzamiento;
    Scanner lectura=new Scanner(System.in);
    @Override
    public void iniciar() {
        
        System.out.println("Ingrese el nombre del jugador");
        nombre=lectura.nextLine();
    }

    @Override
    public void jugar() {
        
        int lanzamiento=(int)(Math.random()*2+1);
        System.out.println(nombre+"Selecione 1. cara 2.sello");
        eleccion=lectura.nextInt();
    }

    @Override
    public void finalizar() {
        if(lanzamiento==1&& eleccion==1 ){
            System.out.println(nombre+"Ha salido cara, usted selecciono cara usted gana");
        }
    }
    
}
