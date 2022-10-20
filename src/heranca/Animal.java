package heranca;

public class Animal {

    private String nome;
    private String raca;

    public Animal() {

    }

    public Animal(String nome) {
        this.nome = nome;

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public String caminha() {
        System.out.println(getNome()+" está a caminha");
        return this.nome;
    }

}
