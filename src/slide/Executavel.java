package slide;

public class Executavel {

    public static void main(String[] args) {

        Funcionario f1 = new FuncionarioCLT("Roberta", 23, 12345);
        Funcionario f2 = new FuncionarioPJ("Sara", 25, 54321);

        Contabilidade con = new Contabilidade();

        con.gerarDemonstrativo(f1);
        con.gerarDemonstrativo(f2);
    }
}
