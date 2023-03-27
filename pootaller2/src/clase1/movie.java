import java.util.Scanner;

public class movie {
    private String nombre;
    private String categoria; 
    int year;
    public int duration;
    public movie(){}
    public movie (String nombre, String categoria, int year, int duration){
        this.nombre=nombre;
        this.categoria=categoria;
        this.year=year;
        this.duration=duration;
    }
    public void mostrarpelicula(){
        System.out.println("el nommbre de la pelicula es"+nombre+"con la categoria"+categoria+"salida en el año"+year+"con una duracion de"+duration);
    }
    public void mostrarpelicula(String nombre, string categoria, int year, int duration){
        System.out.println("El nombre de la pelicula es"+nombre+"con la categoria"+categoria+"salida en el año"+year+"con una duracion de"+duration);
    }
    public void mostrarpelicula(string categoria, String nombre, int duration, int year){
        System.out.println("El nombre de la pelicula es"+nombre+"con la categoria"+categoria+"salida en el año"+year+"con una duracion de"+duration);
    }
    public void  setnombre(String nombre){
        this.nombre=nombre; 
    }
    public void  setcategoria(String categoria){
        this.categoria=categoria; 
    }
    public void  setyear(int year){
         this.year=year; 
    }
    public void setduration(int duration){
         this.duration=duration;
    }
    public String getnombre(){
        return nombre; 
    }
    public String getcategoria(){
        return categoria; 
    }
    public int getyear(){
        return year;
    }
    public int getduration(){
        return duration;
    }
    }

