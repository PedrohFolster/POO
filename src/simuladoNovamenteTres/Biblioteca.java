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
        System.out.println("Há" + getListaObras().length + " obras presentes na biblioteca!");
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
            System.out.println("Não foram encontradas obras!");
        }
    }

    public void listarAutorMaisNovo() {
        Autor autorMaisNovo = null;

        for (Obra obra : this.listaObras) {
            if (autorMaisNovo == null || obra.getAutor().getDataNascimento().isAfter(autorMaisNovo.getDataNascimento())) {
                autorMaisNovo = obra.getAutor();
            }
        }

        if (autorMaisNovo != null) {
            System.out.println("O autor mais novo é: " + autorMaisNovo);
        } else {
            System.out.println("Não foram encontrados autores!");
        }
    }

    public void diferencaIdade() {

        Autor autorMaisNovo = null;
        Autor autorMaisVelho = null;

        for (Obra obra : this.listaObras) {
            if (autorMaisNovo == null || obra.getAutor().getDataNascimento().isAfter(autorMaisNovo.getDataNascimento())) {
                autorMaisNovo = obra.getAutor();
            }
        }

        if (autorMaisNovo == null) {
            System.out.println("Não foram encontrados autores!");
        }

        for (Obra obra : this.listaObras) {
            if (autorMaisVelho == null || obra.getAutor().getDataNascimento().isBefore(autorMaisVelho.getDataNascimento())) {
                autorMaisVelho = obra.getAutor();
            }
        }

        if (autorMaisVelho != null) {
            System.out.println("O autor mais novo é: " + autorMaisVelho);
        } else {
            System.out.println("Não foram encontrados autores!");
        }

        Period verificarDiferenca = Period.between(autorMaisVelho.getDataNascimento(), autorMaisNovo.getDataNascimento());

        System.out.println("A diferença de idade entre os autores é de: " + verificarDiferenca.getYears() + " anos, "
                + verificarDiferenca.getMonths() + " meses, "
                + verificarDiferenca.getDays() + " dias.");

    }

    public void localizarEnderecoAutor(String cidade) {

        Set<Autor> autoresEncontrados = new HashSet<>();
        System.out.println("Pessoas que moram na cidade: " + cidade);
        for (Obra obra : this.listaObras) {
            if (obra.getAutor().getEnderecoAutor().getCidade().equalsIgnoreCase(cidade)) {
                autoresEncontrados.add(obra.getAutor());
            }
        }

        for (Autor autor : autoresEncontrados) {
            System.out.println(autor.getNome());
        }

        if (autoresEncontrados.isEmpty()) {
            System.out.println("Não foram encontrados autores que residem nessa cidade!");
        }
    }
}