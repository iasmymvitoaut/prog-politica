import java.util.List;

public class Senador extends Politico {

    private String estado;
    private int anoEleicao;

    public Senador(String nome, String partido,
                   String estado,
                   int anoEleicao,
                   double remuneracao,
                   List<String> projetos) {

        super(nome, partido, "Federal", "Legislativo",
              "Senado Federal",
              "Praça dos Três Poderes - Brasília/DF",
              remuneracao,
              projetos);
              
        this.estado = estado;
        this.anoEleicao = anoEleicao;
    }

    @Override
    public String exercerMandato() {
        return "Sabatinam e aprovam autoridades, legislam sobre leis federais "
                + "e autorizam operações financeiras externas.";
    }

    public String aprovarAutoridades() {
        return "Aprovar autoridades de alto escalão.";
    }

    public String julgarCrimesResponsabilidade() {
        return "Julgar crimes de responsabilidade.";
    }

    public String representarEstado() {
        return "Representar os interesses de seu Estado.";
    }
    public String getEstado() {
    return estado;
}

public int getAnoEleicao() {
    return anoEleicao;
}
}