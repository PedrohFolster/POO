package lista1;

public class Quadrado {
    private double lado;
    private String nome;

    // Construtor
    public Quadrado(double lado, String nome) {
        this.lado = lado;
        this.nome = nome;
    }

    // Método para calcular a área do quadrado
    public double calcularArea() {
        double area = lado * lado;
        return area;
    }

    // Método para calcular o perímetro do quadrado
    public double calcularPerimetro() {
        double perimetro = 4 * lado;
        return perimetro;
    }

    // Métodos getters e setters para os atributos lado e nome
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static void main(String[] args) {
        Quadrado quadrado1 = new Quadrado(5, "Meu Quadrado");
        System.out.println("Nome: " + quadrado1.getNome());
        System.out.println("Lado: " + quadrado1.getLado());
        System.out.println("Área: " + quadrado1.calcularArea());
        System.out.println("Perímetro: " + quadrado1.calcularPerimetro());
    }
}
