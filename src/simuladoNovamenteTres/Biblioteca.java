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

        System.out.println("Há " + listaObras.length + " obras disponíveis na biblioteca!");
    }

    public void listarObraMaisAntiga() {
        Obra maisAntiga = null;

        for (Obra obra : this.listaObras) {
            if (maisAntiga == null || obra.getDataPublicacao().isBefore(maisAntiga.getDataPublicacao())) {
                maisAntiga = obra;
            }
        }
        if (maisAntiga != null) {
            System.out.println("A obra mais antiga é: " + maisAntiga);
        } else {
            System.out.println("Não foram encontradas obras cadastradas!");
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
            System.out.println("Não foram encontrados registros para autor");
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

        if (autorMaisNovo != null) {
            System.out.println("O autor mais novo é: " + autorMaisNovo);
        } else {
            System.out.println("Não foram encontrados registros para autor");
        }

        for (Obra obra : this.listaObras) {
            if (autorMaisVelho == null || obra.getAutor().getDataNascimento().isBefore(autorMaisVelho.getDataNascimento())) {
                autorMaisVelho = obra.getAutor();
            }
        }

        if (autorMaisVelho != null) {
            System.out.println("O autor mais velho é: " + autorMaisVelho);
        } else {
            System.out.println("Não foram encontrados registros para autor");
        }

        Period diferencaIdade = Period.between(autorMaisVelho.getDataNascimento(), autorMaisNovo.getDataNascimento());

        System.out.println("A diferença de idade entre os autores é de: " + diferencaIdade.getYears() + " anos, " + diferencaIdade.getMonths() + " meses, " + diferencaIdade.getDays() + " dias.");

    }

    public void localizarEnderecoAutor(String cidade) {
        Set<Autor> autoresEncontrados = new HashSet<>();

        System.out.println("Autores que moram na cidade " + cidade);
        for (Obra obra : this.listaObras) {
            if (obra.getAutor().getEnderecoAutor().getCidade().equalsIgnoreCase(cidade)) {
                autoresEncontrados.add(obra.getAutor());
            }
        }

        for (Autor autor : autoresEncontrados) {
            System.out.println(autor.getNome());
        }

        if (autoresEncontrados.isEmpty()) {
            System.out.println("Nenhum autor encontrado na cidade " + cidade);
        }
    }
}
