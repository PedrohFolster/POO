package refazerSimuladoTres;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Set;

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

    public void localizarEnderecoAutor(String nome) {

        boolean encontrado = false;

        for (Obra obra : this.getListaObras()) {
            Autor autor = obra.getAutor();
            if (autor.getNome().equalsIgnoreCase(nome)) {
                encontrado = true;
                autor.getEnderecoAutor();
                System.out.println("Autor encontrado!!\n" + autor.getEnderecoAutor());
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Autor não encontrado!");
        }
    }

    public void localizarPorCidade(String cidade) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        boolean cidadeEncontrada = false;

        System.out.println("Moradores da cidade " + cidade + ":");

        // Usar um conjunto para rastrear os autores já impressos
        Set<Autor> autoresImprimidos = new HashSet<>();

        for (Obra obra : listaObras) {
            Autor autor = obra.getAutor();

            // Verificar se o autor ainda não foi impresso para a cidade atual
            if (autor.getEnderecoAutor().getCidade().equals(cidade) && !autoresImprimidos.contains(autor)) {
                autoresImprimidos.add(autor);  // Adicionar o autor ao conjunto de autores impressos
                cidadeEncontrada = true;

                System.out.println(obra.getAutor().getNome());
            }
        }

        if (!cidadeEncontrada) {
            System.out.println("Nenhum morador encontrado na cidade " + cidade + "!");
        }
    }
}