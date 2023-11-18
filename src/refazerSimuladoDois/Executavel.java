package refazerSimuladoDois;

import java.util.Scanner;

public class Executavel {

    public static void main(String[] args) {

        // ALUNOS DA TURMA A

        Endereco enderecoJuliana = new Endereco("Rua das Jujubas", 100, "Campeche", "Florianópolis", "Santa Catarina");
        Aluno juliana = new Aluno("Juliana Silva", 15, enderecoJuliana);

        Endereco enderecoDaniele = new Endereco("Rua das Gomas", 200, "Pedra Branca", "Palhoça", "Santa Catarina");
        Aluno daniele = new Aluno("Daniele Veiga", 14, enderecoDaniele);

        Endereco enderecoBruna = new Endereco("Rua dos Caramelos", 300, "Kobrasol", "São José", "Santa Catarina");
        Aluno bruna = new Aluno("Bruna de Andrade", 13, enderecoBruna);

        Endereco enderecoHelena = new Endereco("Rua dos Pirulitos", 400, "Estreito", "Florianópolis", "Santa Catarina");
        Aluno helena = new Aluno("Helena de Andrade", 16, enderecoHelena);

        Endereco enderecoMary = new Endereco("Rua dos Chicletes", 500, "Aririú", "Palhoça", "Santa Catarina");
        Aluno mary = new Aluno("Mary Souza", 15, enderecoMary);

        Aluno[] turmaA = {juliana, daniele, bruna, helena, mary};

        // ALUNOS DA TURMA B

        Endereco enderecoPaula = new Endereco("Rua dos Bombons", 600, "Forquilinhas", "São José", "Santa Catarina");
        Aluno paula = new Aluno("Paula Vieira", 14, enderecoPaula);

        Endereco enderecoRenata = new Endereco("Rua das Balas", 700, "Capoeiras", "Florianópolis", "Santa Catarina");
        Aluno renata = new Aluno("Renata Augusta", 15, enderecoRenata);

        Endereco enderecoLuiza = new Endereco("Rua das Trufas", 800, "Centro", "Biguaçu", "Santa Catarina");
        Aluno luiza = new Aluno("Luiza Pires", 15, enderecoLuiza);

        Endereco enderecoBeatriz = new Endereco("Rua dos Doces", 900, "Campinas", "São José", "Santa Catarina");
        Aluno beatriz = new Aluno("Beatriz Santos", 14, enderecoBeatriz);

        Endereco enderecoSuellen = new Endereco("Rua dos Confetes", 1000, "Capoeiras", "Florianópolis", "Santa Catarina");
        Aluno suellen = new Aluno("Suellen Lima", 17, enderecoSuellen);

        Aluno[] turmaB = {paula, renata, luiza, beatriz, suellen};

        // CRIANDO PROFESSORES

        Endereco enderecoZeca = new Endereco("Rua das Encicopédias", 500, "Centro", "Florianópolis", "Santa Catarina");
        Professor zeca = new Professor("Zeca", 45, enderecoZeca, "Matemática");

        Endereco enderecoPires = new Endereco("Rua dos Dicionários", 750, "Centro", "Florianópolis", "Santa Catarina");
        Professor pires = new Professor("Pires", 40, enderecoPires, "Português");


        // CRIANDO TURMAS

        Turma setimaSerie = new Turma(7, zeca, turmaA);
        Turma oitavaSerie = new Turma(8, pires, turmaB);

        Turma[] turmas = {setimaSerie, oitavaSerie};

        Endereco enderecoEscola = new Endereco("Rua dos Estudos", 1000, "Centro", "Florianópolis", "Santa Catarina");
        Escola escola = new Escola("Escola Básica das Meninas de Florianópolis", "3232-3232", enderecoEscola, turmas);

        System.out.println();
        // Contabilizar alunos - 1
        escola.contabilizarAlunos();

        System.out.println();
        // Procurar endereco regente - 2
        escola.localizarEndereco("Zeca");


        System.out.println();
        // Informar nome das alunas de dada série
        escola.informarNomeAlunas(8);

        System.out.println();
        // Informar regente mais novo
        escola.regenteMaisNovo();

        System.out.println();
        // Procurar alunas por cidade
        escola.localizarPorCidade("São José");
    }
}
