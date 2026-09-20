import java.util.List;

public class Presidente extends Politico {

    private int quantidadeMinistros;

    public Presidente(String nome, 
                      String partido,
                      String localTrabalho,
                      String enderecoTrabalho,
                      double remuneracao,
                      List<String> projetos,
                      int quantidadeMinistros) {

        super(nome, partido, "Federal", "Executivo",
              localTrabalho, enderecoTrabalho,
              remuneracao, projetos);

        this.quantidadeMinistros = quantidadeMinistros;
    }

    @Override
    public String exercerMandato() {
        return "Propõe, sanciona e veta leis e edita medidas provisórias.";
    }

    public String nomearMinistros() {
        return "Nomear Ministros de Estado.";
    }

    public String exonerarMinistros() {
        return "Exonerar Ministros de Estado.";
    }

    public String comandarForcasArmadas() {
        return "Comandar as Forças Armadas.";
    }

    public String representarPais() {
        return "Representar o país em eventos internacionais.";
    }

    public String elaborarPPA() {
        return "Elaborar e enviar ao Congresso o PPA nacional.";
    }

    public String elaborarLDO() {
        return "Elaborar e enviar ao Congresso a LDO nacional.";
    }

    public String elaborarLOA() {
        return "Elaborar e enviar ao Congresso a proposta da LOA nacional.";
    }
}