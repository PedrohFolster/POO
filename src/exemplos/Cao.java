package exemplos;

public class Cao {

    // Atributo
    private String nome, raca;
    private double peso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
        } else {
            System.out.println("Você deve informar um valor positivo!");
        }
    }


    // Método
    public void falar() {
        if (peso > 60) {
            System.out.println("Woof, woof, woof");
        } else if (peso < 35) {
            System.out.println("Yip, Yip, Yip");
        } else {
            System.out.println("Ruff, ruff, ruff");
        }
    }
}
