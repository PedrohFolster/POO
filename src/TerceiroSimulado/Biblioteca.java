package TerceiroSimulado;

public class Biblioteca {

    private String nome;
    private Endereco enderecoBiblioteca;
    private Obra[] listaObras;

    public Biblioteca(String nome, Endereco enderecoBiblioteca, Obra[] listaObras) {
        super();
        this.nome = nome;
        this.enderecoBiblioteca = enderecoBiblioteca;
        this.listaObras = listaObras;
    }

    public Biblioteca() {
        super();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEnderecoBiblioteca() {
        return enderecoBiblioteca;
    }

    public void setEnderecoBiblioteca(Endereco enderecoBiblioteca) {
        this.enderecoBiblioteca = enderecoBiblioteca;
    }

    public Obra[] getListaObras() {
        return listaObras;
    }

    public void setListaObras(Obra[] listaObras) {
        this.listaObras = listaObras;
    }
}
