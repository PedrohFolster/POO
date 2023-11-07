package refazerSimuladoUm;

public class Farmacia extends Empresa {

    private Estoque estoque;

    public Farmacia(String nome, String cnpj, Endereco endereco, Estoque estoque) {
        super(nome, cnpj, endereco);
        this.estoque = estoque;
    }

    public Farmacia(String nome, String cnpj, Endereco endereco) {
        super(nome, cnpj, endereco);
    }
}
