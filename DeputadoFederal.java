import java.util.List;

public class DeputadoFederal extends Politico {

    private String bancada;

    public DeputadoFederal(String nome, String partido,
                           String bancada,
                           double remuneracao,
                           List<String> projetos) {

        super(nome, partido, "Federal", "Legislativo",
              "Câmara dos Deputados",
              "Palácio do Congresso Nacional - Brasília/DF",
              remuneracao,
              projetos);

        this.bancada = bancada;
    }

    @Override
    public String exercerMandato() {
        return "Legisla sobre o Código Penal, Código Tributário "
                + "e leis trabalhistas e fiscaliza o Presidente da República.";
    }

    public String votarPEC() {
        return "Votar PECs federais.";
    }

    public String criarCPI() {
        return "Criar CPI nacional.";
    }

    public String votarPPA() {
        return "Votar o PPA nacional.";
    }

    public String votarLDO() {
        return "Votar a LDO nacional.";
    }

    public String votarLOA() {
        return "Votar a LOA nacional.";
    }

    public String proporLeiComplementar() {
        return "Propor leis complementares.";
    }
    public String getBancada() {
    return bancada;
}
}