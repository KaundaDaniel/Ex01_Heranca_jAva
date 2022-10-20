package heranca;

public class TestaHeranca {

    public static void main(String[] args) {
        Cachorro ca = new Cachorro("Scay");
       
        ca.caminha();
        ca.late();
        Gato ga = new Gato("Laica");
        
        ga.caminha();
        System.out.println(ca.late());
        System.out.println(ga.mia());
        
    }

}
