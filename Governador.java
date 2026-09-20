import java.util.List;

public class Governador extends Politico {

    private int quantidadeSecretarios;
    private String estado;

    public Governador(String nome, String partido,
                      String estado,
                      String localTrabalho,
                      String enderecoTrabalho,
                      double remuneracao,
                      List<String> projetos,
                      int quantidadeSecretarios) {

        super(nome, partido, "Estadual", "Executivo",
              localTrabalho, enderecoTrabalho,
              remuneracao, projetos);

        this.estado = estado;
        this.quantidadeSecretarios = quantidadeSecretarios;
    }

    @Override
    public String exercerMandato() {
        return "Sanciona leis estaduais, veta leis estaduais, "
                + "decreta estado de calamidade e envia PEC à Assembleia Legislativa.";
    }

    public String gerirPoliciaMilitar() {
        return "Gerir a Polícia Militar.";
    }

    public String administrarRodovias() {
        return "Administrar as rodovias estaduais.";
    }

    public String coordenarEducacaoSaude() {
        return "Coordenar a educação e a saúde do estado.";
    }

    public String elaborarPPA() {
        return "Elaborar e enviar à Assembleia Legislativa o PPA estadual.";
    }

    public String elaborarLDO() {
        return "Elaborar e enviar à Assembleia Legislativa a LDO estadual.";
    }

    public String elaborarLOA() {
        return "Elaborar e enviar à Assembleia Legislativa a proposta da LOA estadual.";
    }

    public String getEstado() {
        return estado;
    }
    public int getQuantidadeSecretarios() {
    return quantidadeSecretarios;
}
}