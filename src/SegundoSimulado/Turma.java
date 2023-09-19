package SegundoSimulado;

public class Turma {

    private int serie;
    private Professor regente;
    private Aluno[] alunos;

    public Turma(int serie, Professor regente, Aluno[] alunos) {
        super();
        this.serie = serie;
        this.regente = regente;
        this.alunos = alunos;
    }

    public Turma() {
        super();
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public Professor getRegente() {
        return regente;
    }

    public void setRegente(Professor regente) {
        this.regente = regente;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public void listarAlunas() {
        for (Aluno aluno : this.getAlunos()) {
            System.out.println(aluno.getNome());
        }
    }

    public void listarAlunasPorCidade(String cidade) {
        for (int i = 0; i < this.getAlunos().length; i++) {
            if (this.getAlunos()[i].getEndereco().getCidade().equals(cidade)) {
                System.out.println(this.getAlunos()[i].getNome());
            }
        }
    }
}
