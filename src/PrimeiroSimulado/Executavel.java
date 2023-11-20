package PrimeiroSimulado;

import java.util.Scanner;

public class Executavel {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

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

        Estoque responsavel = new Estoque("Luciano");

        Farmacia farmacia = new Farmacia("Farmacia do Senac", "12.345.678/0001-33", "Rua Jardim Silva", 360, "Centro", "Florianópolis", "Santa Catarina");

        Remedio[] legrand = {
                rosuvas1, rosuvas2, rosuvas3, rosuvas4, glifage1, glifage2, glifage3,
                aradois_h1, aradois_h2, trandilax1
        };

        Remedio[] medley = {
                rosuvastatina, lexotan, losartana, torsilax
        };


        System.out.println();
        // 1 - Responsável Estoque
        System.out.println("O responsável pelo estoque é: " + responsavel.getResponsavel());

        double totalEmReais = 0;
        double valorMedley = 0;
        double valorLegrand = 0;

        for (Remedio remedio : legrand) {
            valorLegrand += remedio.getPreco();
            totalEmReais += remedio.getPreco();
        }

        for (Remedio remedio : medley) {
            valorMedley += remedio.getPreco();
            totalEmReais += remedio.getPreco();
        }

        System.out.println();
        // 2 - Total em reais
        System.out.println("O total em reais de remédios é de: R$ " + totalEmReais);

        System.out.println();
        // 3 - Buscar laboratório
        laboratorioBuscar("Legrand", legrand, medley);

        System.out.println();
        // 4 - Informações do laboratório
        laboratorioInformacoes("legrand", legrand, medley);
    }

    private static void laboratorioInformacoes(String laboratorio, Remedio[] legrand, Remedio[] medley) {

        System.out.println("Buscando endereço do laboratório " + laboratorio + "...");
        for (Remedio remedio : legrand) {
            if (remedio.getLaboratorio().getNome().equalsIgnoreCase(laboratorio)) {
                System.out.println(remedio.getLaboratorio().getEndereco());
                break;
            }
        }

        for (Remedio remedio : medley) {
            if (remedio.getLaboratorio().getNome().equalsIgnoreCase(laboratorio)) {
                System.out.println(remedio.getLaboratorio().getEndereco());
                break;
            }
        }
    }

    private static void laboratorioBuscar(String laboratorio, Remedio[] legrand, Remedio[] medley) {
        double valorLaboratorio = 0;

        // Buscar no laboratório "Legrand"
        for (Remedio remedio : legrand) {
            if (remedio.getLaboratorio().getNome().equalsIgnoreCase(laboratorio)) {
                valorLaboratorio += remedio.getPreco();
            }
        }

        // Buscar no laboratório "Medley"
        for (Remedio remedio : medley) {
            if (remedio.getLaboratorio().getNome().equalsIgnoreCase(laboratorio)) {
                valorLaboratorio += remedio.getPreco();
            }
        }

        System.out.println("Buscando valor total do laboratório " + laboratorio + "...");
        System.out.println("R$ " + valorLaboratorio);
    }


}
