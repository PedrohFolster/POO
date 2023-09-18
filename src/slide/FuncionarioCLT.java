package slide;

public class FuncionarioCLT extends Funcionario {

    public FuncionarioCLT(String nome, int idade, int matricula) {
        super(nome, idade, matricula);
    }

    @Override
    public double CalcularPagamento() {
        return 1000 * 2.5;
    }
}
