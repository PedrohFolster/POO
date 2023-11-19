package refazerSimuladoTres;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Biblioteca {

    private String nome;
    private Obra[] listaObras;
    private Endereco enderecoBiblioteca;

    public Biblioteca(String nome, Obra[] listaObras, Endereco enderecoBiblioteca) {
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

    // Questões abaixo:

    public void contabilizarObras() {
        System.out.println("A quantidade de obras presentes na biblioteca é de: " + getListaObras().length);
    }

    public void obraMaisAntiga() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Obra obraMaisAntiga = listaObras[0];

        for (Obra obra : this.getListaObras()) {
            if (obra.getDataPublicacao().isBefore(obraMaisAntiga.getDataPublicacao())) {
                obraMaisAntiga = obra;
            }
        }
        System.out.println("A obra mais antiga é: " + obraMaisAntiga + "\n");
    }

    public void autorMaisNovo() {
        Autor autorMaisNovo = listaObras[0].getAutor();

        for (Obra obra : this.getListaObras()) {
            if (obra.getAutor().getDataNascimento().isAfter(autorMaisNovo.getDataNascimento())) {
                autorMaisNovo = obra.getAutor();
            }
        }
        System.out.println("O autor mais novo é:" + autorMaisNovo);
    }

    public void diferencaIdade() {
        Autor autorMaisNovo = listaObras[0].getAutor();
        Autor autorMaisVelho = listaObras[0].getAutor();

        for (Obra obra : this.getListaObras()) {
            if (obra.getAutor().getDataNascimento().isAfter(autorMaisNovo.getDataNascimento())) {
                autorMaisNovo = obra.getAutor();
            }
        }

        for (Obra obra : this.getListaObras()) {
            if (obra.getAutor().getDataNascimento().isBefore(autorMaisVelho.getDataNascimento())) {
                autorMaisVelho = obra.getAutor();
            }
        }

        Period diferencaIdade = Period.between(autorMaisVelho.getDataNascimento(), autorMaisNovo.getDataNascimento());

        System.out.println("O autor mais novo é: " + autorMaisNovo);
        System.out.println("O autor mais velho é: " + autorMaisVelho);
        System.out.println("A diferença de idade é: " + diferencaIdade.getYears() + " anos, " +
                diferencaIdade.getMonths() + " meses e " +
                diferencaIdade.getDays() + " dias.");
    }
}