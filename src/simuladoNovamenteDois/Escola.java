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
        System.out.println("A quantidade total de alunos é: " + total);
    }

    public void localizarRegente(String nome) {
        boolean encontrado = false;

        System.out.println("Buscando a lista de regentes com o nome " + nome + "...");

        for (Turma turma : this.getTurmas()) {
            if (turma.getRegente().getNome().equalsIgnoreCase(nome)) {
                encontrado = true;
                System.out.println(turma.getRegente());
            }
        }
        if (!encontrado) {
            System.out.println("Não foram encontrados regentes com esse nome.");
        }
    }

    public void localizarPorSerie(int serie) {
        boolean encontrado = false;

        System.out.println("Buscando alunos da turma " + serie + "....");

        for (Turma turma : this.getTurmas()) {
            for (Aluno aluno : turma.getAlunos()) {
                if (turma.getSerie() == serie) {
                    encontrado = true;
                    System.out.println(aluno.getNome());
                }
            }
        }
        if (!encontrado) {
            System.out.println("Não foram encontrados alunos para essa turma.");
        }
    }

    public void regenteMaisNovo() {
        Professor maisNovo = null;

        System.out.println("O regente mais novo é: ");

        for (Turma turma : this.getTurmas()) {
            if (maisNovo == null || turma.getRegente().getIdade() < maisNovo.getIdade()) {
                maisNovo = turma.getRegente();
            }
        }
        if (maisNovo != null) {
            System.out.println(maisNovo);
        } else {
            System.out.println("Não foram encontrados regentes.");
        }
    }

    public void listarAlunasPorCidade(String cidade) {
        boolean encontrado = false;

        System.out.println("Buscando alunos que residem na cidade de " + cidade + "...");

        for (Turma turma : this.getTurmas()) {
            for (Aluno aluno : turma.getAlunos()) {
                if (aluno.getEndereco().getCidade().equalsIgnoreCase(cidade)) {
                    encontrado = true;
                    System.out.println(aluno.getNome());
                }
            }
        }
        if (!encontrado) {
            System.out.println("Não foram encontrados alunos que residem na cidade informada.");
        }
    }
}
