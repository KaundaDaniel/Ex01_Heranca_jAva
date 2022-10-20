package heranca;

public class Cachorro extends Animal {
    public Cachorro(String nome){
        super(nome);
    }
    public String late(){
        return getNome()+" Está a latir";
    }
}
