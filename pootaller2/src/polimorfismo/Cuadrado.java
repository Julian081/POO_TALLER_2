package polimorfismo;
import java.util.Scanner;
public class Cuadrado extends figura {
    Scanner lectura = new Scanner(System.in);
    private float lado;//Atributo encapsulado

    //metodos accesosres get y set
    public float getLado() {
        return lado;
    }
    public void setLado(float lado) {
        this.lado = lado;
    }
    //sobreescritura metodo calcurarArea()
    @Override
    public void calcularArea() {
        //area del cuadrado
        System.out.println("Digite el lado");
        lado= lectura.nextFloat();
        float area=lado*lado;
        System.out.println("El lado del cuadrado es"+lado+"el area es"+area);
    }
}
