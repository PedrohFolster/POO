package slide;

public class Cliente extends Pessoa{

    private int codigo;

    public Cliente(String nome, int idade, int codigo) {
        super(nome, idade);
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
