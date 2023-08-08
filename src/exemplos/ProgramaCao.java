package exemplos;

import java.util.Scanner;

public class ProgramaCao {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Cao[] listaCaes = new Cao[4];

        for (int i = 0; i < listaCaes.length; i++) {
            Cao cao = new Cao();
            System.out.println();
            System.out.print("Informe o nome do " + (i + 1) +  "° cão: ");
            cao.setNome(scan.nextLine());

            System.out.print("Informe a raça do " + (i + 1) + "° cão: ");
            cao.setRaca(scan.nextLine());

            System.out.print("Informe o peso do " + (i + 1) + "° cão: ");
            cao.setPeso(scan.nextDouble());

            listaCaes[i] = cao;
            scan.nextLine();
        }

        for (int i = 0; i < listaCaes.length; i++) {
            System.out.println();
            if (listaCaes[i].getPeso() < 35) {
                System.out.println("Nome: " + listaCaes[i].getNome());
                listaCaes[i].falar();
            }
        }
    }
}
