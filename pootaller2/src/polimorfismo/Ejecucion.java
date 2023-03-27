package polimorfismo;

import java.util.Scanner;

public class Ejecucion   {
    static  Scanner lectura = new Scanner (System.in);
    public static void main(String[] args) {

        int op=1,op2;
        int option;
        Cuadrado ejecucion1=new Cuadrado();
        Triangulo ejecucion2=new Triangulo();
        Circulo ejecucion3=new Circulo();
        Rectangulo ejecucion4=new Rectangulo();
        while (op==1) {
            System.out.println("Elija la figura 1 Cuadrado, 2 Triangulo, 3 Circulo, 4 Rectangulo");
            op2=lectura.nextInt();
            if(op2==1){
            ejecucion1.calcularArea();
            }
            else if(op2==2){
                ejecucion2.calcularArea(); 
            }
            else if(op2==3){
                ejecucion3.calcularArea();
            }
            else if (op2==4){
                ejecucion4.calcularArea();
            }
        }
    }
}
