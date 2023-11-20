package simuladoNovamenteTres;

import simuladoNovamenteDois.Turma;

import java.time.Period;
import java.util.HashSet;
import java.util.Set;

public class Biblioteca {

    private String nome;
    private Obra [] listaObras;
    private Endereco enderecoBiblioteca;

    public Biblioteca(String nome, Obra[] listaObras, Endereco enderecoBiblioteca) {
        super();
        this.nome = nome;
        this.listaObras = listaObras;
        this.enderecoBiblioteca = enderecoBiblioteca;
    }

    public Biblioteca() {
        super();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Obra[] getListaObras() {
        return listaObras;
    }

    public void setListaObras(Obra[] listaObras) {
        this.listaObras = listaObras;
    }

    public Endereco getEnderecoBiblioteca() {
        return enderecoBiblioteca;
    }

    public void setEnderecoBiblioteca(Endereco enderecoBiblioteca) {
        this.enderecoBiblioteca = enderecoBiblioteca;
    }

    public void contabilizarObras() {
        System.out.println("A quantidade de obras presentes na biblioteca é de: " + this.getListaObras().length);
    }

    public void listarObraMaisAntiga() {
        Obra maisAntiga = null;

        System.out.println("Buscando a obra mais antiga...");

        for (Obra obra : this.listaObras) {
            if (maisAntiga == null || obra.getDataPublicacao().isBefore(maisAntiga.getDataPublicacao())) {
                maisAntiga = obra;
            }
        }
        if (maisAntiga != null) {
            System.out.println(maisAntiga);
        } else {
            System.out.println("Não foram encontradas obras para serem listadas!");
        }
    }

    public void listarAutorMaisNovo() {
        Autor maisNovo = null;

        System.out.println("Buscando autor mais novo...");

        for (Obra obra : this.listaObras) {
            if (maisNovo == null || obra.getAutor().getDataNascimento().isAfter(maisNovo.getDataNascimento())) {
                maisNovo = obra.getAutor();
            }
        }
        if (maisNovo != null) {
            System.out.println(maisNovo);
        } else {
            System.out.println("Não foram encontrados autores para serem listados!");
        }
    }

    public void diferencaIdade() {
        Autor maisNovo = null;

        for (Obra obra : this.listaObras) {
            if (maisNovo == null || obra.getAutor().getDataNascimento().isAfter(maisNovo.getDataNascimento())) {
                maisNovo = obra.getAutor();
            }
        }
        if (maisNovo == null) {
            System.out.println("Não foram encontrados autores para serem listados!");
        }

        Autor maisVelho = null;

        System.out.println("Buscando autor mais velho...");

        for (Obra obra : this.listaObras) {
            if (maisVelho == null || obra.getAutor().getDataNascimento().isBefore(maisVelho.getDataNascimento())) {
                maisVelho = obra.getAutor();
            }
        }
        if (maisVelho != null) {
            System.out.println(maisVelho);
        } else {
            System.out.println("Não foram encontrados autores para serem listados!");
        }

        Period diferenca = Period.between(maisVelho.getDataNascimento(), maisNovo.getDataNascimento());

        System.out.println("A diferença de idade entre os autores é de: " +
                           diferenca.getYears() + " anos, " +
                           diferenca.getMonths() + " meses, " +
                           diferenca.getDays() + " dias.");
    }

    public void localizarAutorPorNome(String nome) {
        boolean encontrado = false;

        System.out.println("Buscando o autor com nome " + nome + "...");

        for (Obra obra : this.listaObras) {
            if (obra.getAutor().getNome().equalsIgnoreCase(nome)) {
                encontrado = true;
                System.out.println(obra.getAutor());
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Não foram encontrados autores com esse nome.");
        }
    }

    public void localizarEnderecoAutor(String cidade) {
        boolean encontrado = false;
        Set<Autor> adicionarAutor = new HashSet<>();

        System.out.println("Buscando autores que residem na cidade de " + cidade + "...");

        for (Obra obra : this.listaObras) {
            if (obra.getAutor().getEnderecoAutor().getCidade().equalsIgnoreCase(cidade)) {
                adicionarAutor.add(obra.getAutor());
            }
        }
        for (Autor autor : adicionarAutor) {
            System.out.println(autor.getNome());
        }
        if (adicionarAutor.isEmpty()) {
            System.out.println("Não há nenhum autor que reside na cidade informada.");
        }
    }
}