package refazerSimuladoTres;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Executavel {

    public static void main(String[] args) {

        Endereco enderecoDrummond = new Endereco("Rua das Maças", 100, "Ingleses", "Florianópolis", "Santa Catarina");
        Autor drummond = new Autor("Carlos Drummond", LocalDate.of(1946, 10, 1), enderecoDrummond);

        Endereco enderecoAssis = new Endereco("Rua das Laranjas", 200, "Aririu", "Palhoça", "Santa Catarina");
        Autor assis = new Autor("Machado de Assis", LocalDate.of(1915, 3, 15), enderecoAssis);

        Endereco enderecoMeirelles = new Endereco("Rua das Uvas", 300, "Pedra Branca", "Palhoça", "Santa Catarina");
        Autor meirelles = new Autor("Cecilia Meirelles", LocalDate.of(1927, 5, 21), enderecoMeirelles);

        Endereco enderecoAndrade = new Endereco("Rua das Melancias", 400, "Estreito", "Florianópolis", "Santa Catarina");
        Autor andrade = new Autor("Osvald de Andrade", LocalDate.of(1934, 6, 4), enderecoAndrade);

        Revista veja = new Revista("Revista Veja", 60, LocalDate.of(2012, 12, 1), drummond);
        Livro brejo = new Livro("Brejo das Almas", 8, LocalDate.of(1983, 1, 30), drummond);

        Revista istoe = new Revista("Revista Istoé", 80, LocalDate.of(2013, 6, 1), assis);
        Livro quincas = new Livro("Quincas Borba", 1, LocalDate.of(1892, 1, 30), assis);

        Revista autoEsporte = new Revista("Revista Auto Esporte", 20, LocalDate.of(2011, 9, 1), meirelles);
        Livro colarCarolina = new Livro("Colar de Carolina", 3, LocalDate.of(1941, 7, 28), meirelles);

        Revista interessante = new Revista("Revista Super Interessante", 100, LocalDate.of(2010, 4, 1), andrade);
        Livro condenados = new Livro("Os Condenados", 7, LocalDate.of(1941, 7, 28), andrade);


        // Lista de Obras

        Obra [] listaObras = {veja, brejo, istoe, quincas, autoEsporte, colarCarolina, interessante, condenados};

        Endereco enderecoCentral = new Endereco("Rua das Mangas", 600, "Centro", "Florianópolis", "Santa Catarina");
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central", listaObras, enderecoCentral);

        System.out.println();
        // 1 - Contabilizar Obras
        biblioteca.contabilizarObras();

        System.out.println();
        // 2 - Obra mais Antiga
        biblioteca.obraMaisAntiga();

        System.out.println();
        // 3 - Autor mais novo
        biblioteca.autorMaisNovo();

        System.out.println();
        // 4 - Diferença de idade autores
        biblioteca.diferencaIdade();

        System.out.println();
        // 5 - Localizar um autor
        biblioteca.localizarEnderecoAutor("Carlos Drummond");

        System.out.println();
        // 5 - Localizar por cidade
        biblioteca.localizarPorCidade("Florianópolis");
    }
}