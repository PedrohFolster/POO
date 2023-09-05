package simuladoNovo;

public class Executavel {

    public static void main(String[] args) {

        Endereco e1 = new Endereco("Rua dos remédios", 100, "Centro", "Palhoça", "Santa Catarina");
        Laboratorio l1 = new Laboratorio("Legrand", "12.345.678/0001-11", e1);

        Endereco e2 = new Endereco("Rua da medicação", 200, "Estreito", "Florianópolis", "Santa Catarina");
        Laboratorio l2 = new Laboratorio("Medley", "12.345.678/0001-22", e2);

        Remedio rosuvas1 = new Remedio("Rosuvas", 55, l1);
        Remedio rosuvas2 = new Remedio("Rosuvas", 55, l1);
        Remedio rosuvas3 = new Remedio("Rosuvas", 55, l1);
        Remedio rosuvas4 = new Remedio("Rosuvas", 55, l1);
        Remedio glifage1 = new Remedio("Glifage", 35, l1);
        Remedio glifage2 = new Remedio("Glifage", 35, l1);
        Remedio glifage3 = new Remedio("Glifage", 35, l1);
        Remedio aradois_h1 = new Remedio("Aradois H", 50, l1);
        Remedio aradois_h2 = new Remedio("Aradois H", 50, l1);
        Remedio trandilax1 = new Remedio("Trandilax", 10, l1);

        Remedio rosuvastatina = new Remedio("Rosuvastatina", 50, l2);
        Remedio lexotan = new Remedio("Lexotan", 40, l2);
        Remedio losartana = new Remedio("Losartana", 45, l2);
        Remedio torsilax = new Remedio("Torsilax", 15, l2);

        Farmacia f1 = new Farmacia("Farmacia do Senac", "12.345.678/0001-33", "Rua Jardim Silva", 360, "Centro", "Florianópolis", "Santa Catarina");


    }
}
