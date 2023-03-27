package polimorfismo;
import java.util.Scanner;
public class Triangulo extends figura{
    Scanner lectura = new Scanner(System.in);
    private float base;
    private float altura;
    public float getBase() {
        return base;
    }
    public void setBase(float base) {
        this.base = base;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    } 

    @Override
    public void calcularArea() {
        System.out.println("Digite la base");
        base = lectura.nextFloat();
        System.out.println("Digite la altura");
        altura= lectura.nextFloat();
        float area = (base*altura)/2;
        System.out.println("La base del triangulo es: "+base+" La altura es"+altura+" El area es: "+area); 
    }
    
}
