package simuladoNovo;

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

        Farmacia f1 = new Farmacia("Farmacia do Senac", "12.345.678/0001-33", "Rua Jardim Silva", 360, "Centro", "Florianópolis", "Santa Catarina");

        Remedio[] legrand = {
                rosuvas1, rosuvas2, rosuvas3, rosuvas4, glifage1, glifage2, glifage3,
                aradois_h1, aradois_h2, trandilax1
        };

        Remedio[] medley = {
                rosuvastatina, lexotan, losartana, torsilax
        };

        double totalEmReais = 0;
        double legrandReais = 0;
        double medleyReais = 0;

        for (Remedio remedio : legrand) {
            legrandReais += remedio.getPreco();
            totalEmReais += remedio.getPreco();
        }

        for (Remedio remedio : medley) {
            medleyReais += remedio.getPreco();
            totalEmReais += remedio.getPreco();
        }

        System.out.println("O nome do responsável pelo estoque é: " + responsavel.getResponsavel());
        System.out.println("O total em reais (R$) em estoque é de: " + totalEmReais);

        System.out.print("Informe o nome do departamento que você deseja obter o estoque: ");
        String encontrarNome = scan.nextLine();

        Laboratorio[] laboratorios = { l1, l2 };
        boolean departamentoEncontrado = false;

        for (Laboratorio laboratorio : laboratorios) {
            if (laboratorio.getNome().equalsIgnoreCase(encontrarNome)) {
                if (encontrarNome.equalsIgnoreCase("medley")) {
                    System.out.println("Valor em estoque do laboratório " + laboratorio.getNome() + " é de: " + medleyReais);
                } else if (encontrarNome.equalsIgnoreCase("legrand")) {
                    System.out.println("Valor em estoque do laboratório " + laboratorio.getNome() + " é de: " + legrandReais);
                }
                departamentoEncontrado = true;
                break;
            }
        }

        if (!departamentoEncontrado) {
            System.out.println("Laboratório não encontrado!");
        }

    }
}
