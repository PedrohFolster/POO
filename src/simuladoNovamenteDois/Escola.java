package simuladoNovamenteDois;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Escola {

    private String nome;
    private String telefone;
    private Endereco enderecoEscola;
    private Turma [] turmas;

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
        System.out.println("Há " + total + " alunas na escola.");
    }

    public void localizarRegente(String nome) {
        boolean encontrado = false;

        for (Turma turma : this.getTurmas()) {
            if (turma.getRegente().getNome().equalsIgnoreCase(nome)) {
                encontrado = true;
                System.out.println("O regente " + nome + " reside em: ");
                System.out.println(turma.getRegente().getEndereco());
            }
        }

        if (!encontrado) {
            System.out.println("Não foi encontrado nenhum regente com esse nome!");
        }
    }

    public void localizarPorSerie(int serie) {
        Set<Aluno> adicionarAlunas = new HashSet<>();
        boolean encontrado = false;

        System.out.println("Alunos da " + serie + "° serie: \n");

        for (Turma turma : this.getTurmas()) {
            if (turma.getSerie() == serie) {
                encontrado = true;
                adicionarAlunas.addAll(Arrays.asList(turma.getAlunos()));
            }
        }

        for (Aluno aluno : adicionarAlunas) {
            System.out.println(aluno.getNome());
        }

        if (adicionarAlunas.isEmpty()) {
            System.out.println("Não há pessoas nesta turma.");
        }
    }

    public void regenteMaisNovo() {
        Professor regenteMaisNovo = null;

        for (Turma turma : this.getTurmas()) {
            if (regenteMaisNovo == null || turma.getRegente().getIdade() < regenteMaisNovo.getIdade()) {
                regenteMaisNovo = turma.getRegente();
            }
        }

        if (regenteMaisNovo != null) {
            System.out.println("O regente mais novo é: \n" + regenteMaisNovo);
        } else {
            System.out.println("Não foi encontrado nenhum regente.");
        }
    }

    public void listarAlunasPorCidade(String cidade) {
        Set<Aluno> alunasPorCidade = new HashSet<>();
        boolean encontrado = false;

        System.out.println("Alunas que residem na cidade de " + cidade + ": ");

        for (Turma turma : this.getTurmas()) {
            for (Aluno aluno : turma.getAlunos()) {
                if (aluno.getEndereco().getCidade().equalsIgnoreCase(cidade)) {
                    alunasPorCidade.add(aluno);
                    encontrado = true;
                }
            }
        }

        for (Aluno aluno : alunasPorCidade) {
            System.out.println(aluno.getNome());
        }

        if (!encontrado) {
            System.out.println("Não há alunas que residem na cidade informada.");
        }
    }
}
