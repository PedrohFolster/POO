package refazerSimuladoDois;

import SegundoSimulado.Aluno;

public class Escola {

    private String nome;
    private String telefone;
    private Endereco enderecoEscola;
    private Turma[] turmas;

    public Escola(String nome, String telefone, Endereco enderecoEscola, Turma[] turmas) {
        super();
        this.nome = nome;
        this.telefone = telefone;
        this.enderecoEscola = enderecoEscola;
        this.turmas = turmas;
    }

    public Escola() {
        super();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEnderecoEscola() {
        return enderecoEscola;
    }

    public void setEnderecoEscola(Endereco enderecoEscola) {
        this.enderecoEscola = enderecoEscola;
    }

    public Turma[] getTurmas() {
        return turmas;
    }

    public void setTurmas(Turma[] turmas) {
        this.turmas = turmas;
    }

    public void contabilizarAlunos() {

        int total = 0;

        for (Turma turma : this.getTurmas()) {
            total += turma.getAlunos().length;
        }
        System.out.println("A quantidade total de alunos é: " + total);
    }

    public void localizarEndereco(String nomeRegente) {

        System.out.println("Endereço do regente: " + nomeRegente);

        for (Turma turma : getTurmas()) {
            if (turma.getRegente().getNome().equalsIgnoreCase(nomeRegente)) {
                System.out.println(turma.getRegente().getEndereco());
            }
        }
    }

    public void informarNomeAlunas(int serie) {
        System.out.println("As alunas da " + serie + "° série são: \n" );

        for (Turma turma : this.getTurmas()) {
            if (turma.getSerie() == serie) {
                turma.listarAlunos();
            }
        }
    }

    public void regenteMaisNovo() {
        Professor maisNovo = this.getTurmas()[0].getRegente();

        for (Turma turma : this.getTurmas()) {
            if (turma.getRegente().getIdade() < maisNovo.getIdade()) {
                System.out.println("O regente mais novo é: " + maisNovo.getNome());
            }
        }
    }

    public void localizarPorCidade(String cidade) {
        System.out.println("\nLista de alunos por cidade: ");
        for (Turma turma : this.getTurmas()) {
            turma.listarAlunosPorCidade(cidade);
        }
    }
}
