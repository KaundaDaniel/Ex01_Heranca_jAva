package heranca;

public class Gato extends Animal {
    public Gato(String nome){
        super(nome);
    }

    public String mia() {
        
        return getNome() + " Está a miar";
    }

}
