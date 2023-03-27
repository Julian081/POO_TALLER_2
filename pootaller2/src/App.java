import clase1.movie;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        movie minions=new movie();
        movie avatar=new movie("avatar");
        Ave condorito=new Ave();
        condorito.setnombre("condorito");
        condorito.setedad(50);
        condorito.setEnvergadura("300cm");
        condorito.mostrarave();
        avatar.getcategoria();
        avatar.getduration();
        avatar.getnombre();
        avatar.getyear();
        avatar.setcategoria("terror");
        avatar.setduration(130);
        avatar.setnombre("avatar");
        avatar.setyear(2005);
    }
}
