package slide;

public class Contabilidade {

    public void gerarDemonstrativo(Funcionario func) {
        System.out.println("O funcionário " + func.getNome());
        System.out.println("Recebeu o pagamento de: " + func.CalcularPagamento() + " reais!");
    }
}
