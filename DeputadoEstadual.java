import java.util.List;

public class DeputadoEstadual extends Politico {

    private String estado;
    private List<String> comissoes;

    public DeputadoEstadual(String nome, String partido,
                            String estado,
                            List<String> comissoes,
                            String enderecoTrabalho,
                            double remuneracao,
                            List<String> projetos) {

        super(nome, partido, "Estadual", "Legislativo",
              "Assembleia Legislativa",
              enderecoTrabalho,
              remuneracao,
              projetos);

        this.estado = estado;
        this.comissoes = comissoes;
    }

    @Override
    public String exercerMandato() {
        return "Legislar sobre assuntos de interesse do estado "
                + "e fiscalizar o governador.";
    }

    public String votarPPA() {
        return "Votar o PPA do Estado.";
    }

    public String votarLOA() {
        return "Votar a LOA do Estado.";
    }

    public String votarLDO() {
        return "Votar a LDO do Estado.";
    }

    public String proporEmenda() {
        return "Propor emendas à Constituição Estadual.";
    }

    public String criarCPI() {
        return "Criar CPI estadual.";
    }
    public String getEstado() {
    return estado;
}

public List<String> getComissoes() {
    return comissoes;
}
}