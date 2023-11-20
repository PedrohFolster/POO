package simuladoNovamenteTres;

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
        System.out.println("Há " + listaObras.length + " obras na biblioteca!");
    }

    public void listarObraMaisAntiga() {
        Obra maisAntiga = null;

        for (Obra obra : listaObras) {
            if (maisAntiga == null || obra.getDataPublicacao().isBefore(maisAntiga.getDataPublicacao())) {
                maisAntiga = obra;
            }
        }
        if (maisAntiga != null) {
            System.out.println("A obra mais antiga é a obra: " + maisAntiga);
        } else {
            System.out.println("Não foram encontradas obras para serem listadas.");
        }
    }

    public void listarAutorMaisNovo() {
        Autor maisNovo = null;

        for (Obra obra : listaObras) {
            if (maisNovo == null || obra.getAutor().getDataNascimento().isAfter(maisNovo.getDataNascimento())) {
                maisNovo = obra.getAutor();
            }
        }
        if (maisNovo != null) {
            System.out.println("O autor mais novo é: " + maisNovo);
        } else {
            System.out.println("Não foram encontradas obras para serem listadas.");
        }
    }

    public void diferencaIdade() {
        Autor maisNovo = null;

        for (Obra obra : listaObras) {
            if (maisNovo == null || obra.getAutor().getDataNascimento().isAfter(maisNovo.getDataNascimento())) {
                maisNovo = obra.getAutor();
            }
        }
        if (maisNovo == null) {
            System.out.println("Não foram encontradas obras para serem listadas.");
        }

        Autor maisVelho = null;

        for (Obra obra : listaObras) {
            if (maisVelho == null || obra.getAutor().getDataNascimento().isBefore(maisVelho.getDataNascimento())) {
                maisVelho = obra.getAutor();
            }
        }
        if (maisNovo != null) {
            System.out.println("O autor mais velho é: " + maisVelho);
        } else {
            System.out.println("Não foram encontradas obras para serem listadas.");
        }

        Period diferenca = Period.between(maisVelho.getDataNascimento(), maisNovo.getDataNascimento());

        System.out.println("A diferença entre os autores é de: "
                        + diferenca.getYears() + " anos, "
                        + diferenca.getMonths() + " meses, "
                        + diferenca.getDays() + " dias.");
    }

    public void localizarAutorPorNome(String nome) {
        boolean encontrado = false;

        System.out.println("Buscando o autor " + nome + "...");

        for (Obra obra : listaObras) {
            if (obra.getAutor().getNome().equalsIgnoreCase(nome)) {
                encontrado = true;
                System.out.println(obra.getAutor().getEnderecoAutor());
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Não foram encontrados autores com esse nome.");
        }
    }

    public void localizarEnderecoAutor(String cidade) {
        Set<Autor> adicionarAutor = new HashSet<>();

        System.out.println("Autores que residem na cidade de " + cidade + ": ");

        for (Obra obra : listaObras) {
            if (obra.getAutor().getEnderecoAutor().getCidade().equalsIgnoreCase(cidade)) {
                adicionarAutor.add(obra.getAutor());
            }
        }

        for (Autor autor : adicionarAutor) {
            System.out.println(autor.getNome());
        }

        if (adicionarAutor.isEmpty()) {
            System.out.println("Não foram encontrados autores que residem na cidade informada.");
        }
    }
}