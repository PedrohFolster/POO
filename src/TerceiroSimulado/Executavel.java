package TerceiroSimulado;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;

public class Executavel {

    public static void main(String[] args) {

        DateTimeFormatter dataDeNascimento = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Endereco enderecoDrummond = new Endereco("Rua das maças", 100, "Ingleses", "Florianópolis", "Santa Catarina");
        Autor drummond = new Autor("Carlos Drummond", LocalDate.of(1946, 10, 01), enderecoDrummond);

        Endereco enderecoAssis = new Endereco("Rua das laranjas", 200, "Aririu", "Palhoça", "Santa Catarina");
        Autor assis = new Autor("Machado de Assis", LocalDate.of(1915, 03, 15), enderecoAssis);

        Endereco enderecoMeirelles = new Endereco("Rua das uvas", 300, "Pedra Branca", "Palhoça", "Santa Catarina");
        Autor meirelles = new Autor("Cecilia Meirelles", LocalDate.of(1927, 05, 21), enderecoMeirelles);

        Endereco enderecoAndrade = new Endereco("Rua das melancias", 400, "Estreito", "Florianópolis", "Santa Catarina");
        Autor andrade = new Autor("Osvald de Andrade", LocalDate.of(1934, 06, 04), enderecoAndrade);

        Revista veja = new Revista("Revista Veja", 60, LocalDate.of(2012, 12, 01), drummond);
        Livro brejo = new Livro("Brejo das Almas", 8, LocalDate.of(1983, 01, 30), drummond);

        Revista istoe = new Revista("IstoÉ", 80, LocalDate.of(2013, 06, 01), assis);
        Livro quincas = new Livro("Quincas Borba", 1, LocalDate.of(1892, 05, 13), assis);
    }
}
