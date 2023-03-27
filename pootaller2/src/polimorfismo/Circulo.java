package polimorfismo;
import java.util.Scanner;
public class Circulo extends figura{
    static Scanner entrada=new Scanner (System.in);
    private double Radio;
    private double Area;
    public double getRadio() {
        return  Radio;
    }
    public void setPi(double Radio) {
        this.Radio = (float) Radio;
    }
    public double getArea() {
        return Area;
    }
    public void setArea(float Area) {
        Radio = Area;
    }

    @Override
    public void calcularArea(){
        System.out.println("Digite el radio del circulo");
        Radio=entrada.nextDouble();
        Radio = Math.pow(Radio, 2);
        Area = Radio*3.1416;
        System.out.println("El area del circulo es"+Area);
    }
}
