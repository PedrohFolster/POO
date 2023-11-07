package refazerSimuladoUm;

public class Estoque {

    private String responsavel;
    private Remedio remedios;

    public Estoque(String responsavel) {
        super();
        this.responsavel = responsavel;
        this.remedios = remedios;
    }

    public Estoque() {
        super();
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public Remedio getRemedios() {
        return remedios;
    }

    public void setRemedios(Remedio remedios) {
        this.remedios = remedios;
    }
}
