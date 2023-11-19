package simuladoNovamenteDois;

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

        for (Turma turma : this.getTurmas()) {
            if (turma.getRegente().getNome().equalsIgnoreCase(nome)) {
                encontrado = true;
                System.out.println("Endereço do regente: " + nome);
                System.out.println(turma.getRegente().getEndereco());
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Regente não encontrado!");
        }
    }

    public void localizarPorSerie(int serie) {

        boolean encontrado = false;

        for (Turma turma : this.getTurmas()) {
            if (turma.getSerie() == serie) {
                encontrado = true;
                turma.listarAlunas();
            }
        }

        if (!encontrado) {
            System.out.println("Turma não encontrada!");
        }
    }

    public void regenteMaisNovo() {
        Professor regenteMaisNovo = getTurmas()[0].getRegente();

        for (Turma turma : this.getTurmas()) {
            if (turma.getRegente().getIdade() < regenteMaisNovo.getIdade()) {
                System.out.println("O regente mais novo é: " + regenteMaisNovo);
            }
        }
    }

    public void listarAlunasPorCidade(String cidade) {
        boolean encontrado = false;

        System.out.println("Nome das alunas que moram na cidade " + cidade + ": \n");

        for (Turma turma : this.getTurmas()) {
            if (turma.getAlunos()[0].getEndereco().getCidade().equalsIgnoreCase(cidade)) {
                turma.listarAlunasPorCidade();
            }
        }
    }
}
