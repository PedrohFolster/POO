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
        Obra obraMaisAntiga = null;

        for (Obra obra : this.listaObras) {
            if (obraMaisAntiga == null || obra.getDataPublicacao().isBefore(obraMaisAntiga.getDataPublicacao())) {
                obraMaisAntiga = obra;
            }
        }
        if (obraMaisAntiga != null) {
            System.out.println("A obra mais antiga é: " + obraMaisAntiga);
        } else {
            System.out.println("Não foram encontradas obras para serem listadas!");
        }
    }

    public void listarAutorMaisNovo() {
        Autor autorMaisNovo = null;

        for (Obra obra : listaObras) {
            if (autorMaisNovo == null || obra.getAutor().getDataNascimento().isAfter(autorMaisNovo.getDataNascimento())) {
                autorMaisNovo = obra.getAutor();
            }
        }
        if (autorMaisNovo != null) {
            System.out.println("O autor mais novo é: " + autorMaisNovo);
        } else {
            System.out.println("Não há autores para serem listados");
        }
    }

    public void diferencaIdade() {
        Autor autorMaisNovo = null;

        for (Obra obra : listaObras) {
            if (autorMaisNovo == null || obra.getAutor().getDataNascimento().isAfter(autorMaisNovo.getDataNascimento())) {
                autorMaisNovo = obra.getAutor();
            }
        }
        if (autorMaisNovo == null) {
            System.out.println("Não há autores para serem listados");
        }

        Autor autorMaisVelho = null;

        for (Obra obra : listaObras) {
            if (autorMaisVelho == null || obra.getAutor().getDataNascimento().isBefore(autorMaisVelho.getDataNascimento())) {
                autorMaisVelho = obra.getAutor();
            }
        }
        if (autorMaisVelho != null) {
            System.out.println("O autor mais velho é: " + autorMaisVelho);
        } else {
            System.out.println("Não há autores para serem listados");
        }

        Period diferenca = Period.between(autorMaisVelho.getDataNascimento(), autorMaisNovo.getDataNascimento());

        System.out.println("A diferença entre os dois autores é de: " + diferenca.getYears() + " anos, "
                + diferenca.getMonths() + " meses" + diferenca.getDays() + " dias.");

    }

    public void localizarAutorPorNome(String nome) {

        boolean encontrado = false;

        System.out.println("O endereço do autor " + nome + " é: ");

        for (Obra obra : this.listaObras) {
            if (obra.getAutor().getNome().equalsIgnoreCase(nome)) {
                encontrado = true;
                System.out.println(obra.getAutor().getEnderecoAutor());
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Não foram encontrados autores com o nome informado como parametro.");
        }
    }

    public void localizarEnderecoAutor(String cidade) {
        Set<Autor> encontrarAutor = new HashSet<>();
        System.out.println("Autores encontrados que moram na cidade " + cidade + ": ");

        for (Obra obra : this.listaObras) {
            if (obra.getAutor().getEnderecoAutor().getCidade().equalsIgnoreCase(cidade)) {
                encontrarAutor.add(obra.getAutor());
            }
        }

        for (Autor autor : encontrarAutor) {
            System.out.println(autor.getNome());
        }

        if (encontrarAutor.isEmpty()) {
            System.out.println("Não foram encontrados autores que residem na cidade informada.");
        }
    }
}