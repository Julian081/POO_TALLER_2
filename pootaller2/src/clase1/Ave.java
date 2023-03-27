public class Ave extends animal{

    //Atributo propio 
    private String envergadura;

    //metodo constructor

    public Ave(){

    }
    public Ave(String nombre, int edad, String envergadura ){
        super(nombre, edad);
        this.envergadura=envergadura; 
    }
    //metodos accesores get y set
    public String getEnvergadura() {
        return envergadura;
    }

    public void setEnvergadura(String envergadura) {
        this.envergadura = envergadura;
    } 
    
    //metodos propios

    public void mostrarave(){
        System.out.println("El nombre del animla es"+getnombre()+"tiene"+getedad()+"años y la envergadura del es"+ this.envergadura);
    }
    
}
