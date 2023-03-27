package salud;
import java.util.Scanner;
public class persona {

    public static void main(String[] args) {
        
    }

    int TipoDoc;
    int documento; 
    int nombre; 
    int apellido; 
    int peso; 
    double peso_estatura;
    double peso_actual;
    int estatura; 
    int edad; 
    int sexo; 
    
    Scanner lectura= new Scanner(System.in);

    public void registrarpersona(){
        System.out.println("ingrese el tipo de documento");
        TipoDoc= lectura.nextInt();
        System.out.println("ingrese el documento");
        documento= lectura.nextInt();
        System.out.println("ingrese el nombre");
        nombre= lectura.nextInt();
        System.out.println("ingrese el apellido");
        apellido= lectura.nextInt();
        System.out.println("ingrese el peso");
        peso= lectura.nextInt(); 
        System.out.println("ingrese la estatura");
        estatura= lectura.nextInt();
        System.out.println("ingrese la edad");
        edad= lectura.nextInt(); 
        System.out.println("ingrese el sexo");
        sexo= lectura.nextInt();
    }

    public void mostrarpersona(){
        System.out.println("El tipo de documento ingresado es"+TipoDoc);
        System.out.println("El docuemnto es"+documento);
        System.out.println("El nombre es"+nombre);
        System.out.println("El apellido es"+apellido);
        System.out.println("El peso es"+peso);
        System.out.println("La estatura es"+estatura);
        System.out.println("La edad es"+edad);
        System.out.println("El sexo es"+sexo);
    }
    public void calcularImc(){
        peso_estatura= peso/estatura;
        peso_actual= Math.pow(estatura, 2);
        if (peso_actual<=20) {
            System.out.println("El peso"+peso_actual+"esta por debajo de lo ideal");
        }
        else if (peso_actual >=20) {
            System.out.println("el peso"+peso_actual+"es ideal");
            }
        else if (peso_actual >25) {
            System.out.println(+peso_actual+"Esta en sobrepeso");
        }
    }
    public void mayorEDAD(){
        System.out.println("La persona es"+edad);
    }
}
