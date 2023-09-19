package PrimeiroSimulado;

public class Farmacia extends Empresa {

    private Estoque estoque;

    public Farmacia(String nome, String cnpj, Endereco endereco) {
        super(nome, cnpj, endereco);
    }

    public Farmacia(String farmaciaDoSenac, String s, String ruaJardimSilva, int i, String centro, String florianópolis, String santaCatarina) {
        super();
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }
}
