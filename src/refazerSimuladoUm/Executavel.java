package refazerSimuladoUm;

import java.util.Scanner;

public class Executavel {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Endereco e1 = new Endereco("Rua dos remédios", 100, "Centro", "Palhoça", "Santa Catarina");
        Laboratorio l1 = new Laboratorio("Legrand", "12.345.678/0001-11", e1);

        Endereco e2 = new Endereco("Rua da medicação", 200, "Estreito", "Florianópolis", "Santa Catarina");
        Laboratorio l2 = new Laboratorio("Medley", "12.345.678/0001-22", e2);


        // Remedios LEGRAND

        Remedio rosuvas1 = new Remedio("Rosuvas", 55, l1);
        Remedio rosuvas2 = new Remedio("Rosuvas", 55, l1);
        Remedio rosuvas3 = new Remedio("Rosuvas", 55, l1);
        Remedio rosuvas4 = new Remedio("Rosuvas", 55, l1);
        Remedio glifage1 = new Remedio("Glifage", 35, l1);
        Remedio glifage2 = new Remedio("Glifage", 35, l1);
        Remedio glifage3 = new Remedio("Glifage", 35, l1);
        Remedio aradoisH1 = new Remedio("Aradois H", 50, l1);
        Remedio aradoisH2 = new Remedio("Aradois H", 50, l1);
        Remedio trandilax1 = new Remedio("Trandilax", 10, l1);

        // Remedios MEDLEY

        Remedio rosuvastatina1 = new Remedio("Rosuvastatina", 50, l2);
        Remedio lexotan1 = new Remedio("Lexotan", 40, l2);
        Remedio lexotan2 = new Remedio("Lexotan", 40, l2);
        Remedio losartana1 = new Remedio("Losartana", 45, l2);
        Remedio losartana2 = new Remedio("Losartana", 45, l2);
        Remedio losartana3 = new Remedio("Losartana", 45, l2);
        Remedio torxilax1 = new Remedio("Torxilax", 15, l2);
        Remedio torxilax2 = new Remedio("Torxilax", 15, l2);
        Remedio torxilax3 = new Remedio("Torxilax", 15, l2);
        Remedio torxilax4 = new Remedio("Torxilax", 15, l2);

        Remedio [] legrand = {rosuvas1, rosuvas2, rosuvas3, rosuvas4, glifage1, glifage2, glifage3, aradoisH1, aradoisH2, trandilax1};
        Remedio [] medley = {rosuvastatina1, lexotan1, lexotan2, losartana1, losartana2, losartana3, torxilax1, torxilax2, torxilax3, torxilax4};

        Estoque responsavel = new Estoque("Luciano");

        Endereco enderecoFarmacia = new Endereco("Rua Jardim Silva", 360, "Centro", "Florianópolis", "Santa Catarina");
        Farmacia senac = new Farmacia("Farmácia do Senac", "12.345.678/0001-33", enderecoFarmacia);

        // Informar responsável estoque

        System.out.println("Responsável pelo estoque: " + responsavel.getResponsavel());

        // Total em reais

        double totalEmReais = 0;
        double legrandValor = 0;
        double medleyValor = 0;

        for (Remedio remedio : legrand) {
            legrandValor += remedio.getPreco();
        }

        for (Remedio remedio : medley) {
            medleyValor += remedio.getPreco();
        }

        System.out.println("Total em reais: R$ " + (legrandValor + medleyValor) + ".");

        // Encontrar nome

        System.out.print("Informe o nome do laboratório que você deseja obter as informações: ");
        String encontrar = scan.nextLine();

        Laboratorio [] laboratorios = {l1, l2};
        boolean encontrarLaboratorio = false;

        for (Laboratorio laboratorio : laboratorios) {
            if (laboratorio.getNome().equalsIgnoreCase(encontrar)) {
                if (encontrar.equalsIgnoreCase("Medley")) {
                    System.out.println("Quantidade em estoque do laboratório " + laboratorio.getNome() + "é de: R$ " + medleyValor);
                } else if (encontrar.equalsIgnoreCase("Legrand")) {
                    System.out.println("Quantidade em estoque do laboratório " + laboratorio.getNome() + " é de: R$ " + legrandValor);
                }
                encontrarLaboratorio = true;
            }
        }

        if (!encontrarLaboratorio) {
            System.out.println("Laboratório não encontrado!");
        }
    }
}
