package exemplos;

import java.util.Scanner;

public class ProgramaPessoa {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Aluno aluno1 = new Aluno();

        System.out.print("Informe o nome do aluno: ");
        aluno1.setNome(scan.nextLine());

        System.out.print("Informe a matricula do aluno: ");
        aluno1.setMatricula(scan.nextInt());
        scan.nextLine();

        System.out.println();

        Aluno aluno2 = new Aluno();

        System.out.print("Informe o nome do aluno: ");
        aluno2.setNome(scan.nextLine());

        System.out.print("Informe a matricula do aluno: ");
        aluno2.setMatricula(scan.nextInt());
        scan.nextLine();

        if (aluno1.getMatricula() < aluno2.getMatricula()) {
            System.out.println("O aluno " + aluno1.getNome() + " é o aluno mais antigo");
        } else {
            System.out.println("O aluno " + aluno2.getNome() + " é o aluno mais antigo");
        }

    }
}
