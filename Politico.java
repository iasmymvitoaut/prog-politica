import java.util.List;

public abstract class Politico {

    private String nome;
    private String partido;
    private String esfera;
    private String poder;
    private String localTrabalho;
    private String enderecoTrabalho;
    private double remuneracao;
    private List<String> projetos;

    public Politico(String nome, String partido, String esfera,
                    String poder, String localTrabalho,
                    String enderecoTrabalho, double remuneracao,
                    List<String> projetos) {

        this.nome = nome;
        this.partido = partido;
        this.esfera = esfera;
        this.poder = poder;
        this.localTrabalho = localTrabalho;
        this.enderecoTrabalho = enderecoTrabalho;
        this.remuneracao = remuneracao;
        this.projetos = projetos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public String getEsfera() {
        return esfera;
    }

    public void setEsfera(String esfera) {
        this.esfera = esfera;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getLocalTrabalho() {
        return localTrabalho;
    }

    public void setLocalTrabalho(String localTrabalho) {
        this.localTrabalho = localTrabalho;
    }

    public String getEnderecoTrabalho() {
        return enderecoTrabalho;
    }

    public void setEnderecoTrabalho(String enderecoTrabalho) {
        this.enderecoTrabalho = enderecoTrabalho;
    }

    public double getRemuneracao() {
        return remuneracao;
    }

    public void setRemuneracao(double remuneracao) {
        this.remuneracao = remuneracao;
    }

    public List<String> getProjetos() {
        return projetos;
    }

    public void setProjetos(List<String> projetos) {
        this.projetos = projetos;
    }

    public abstract String exercerMandato();

    public void mostrarDados() {
        System.out.println("======================================");
        System.out.println("Nome: " + nome);
        System.out.println("Partido: " + partido);
        System.out.println("Esfera: " + esfera);
        System.out.println("Poder: " + poder);
        System.out.println("Local de trabalho: " + localTrabalho);
        System.out.println("Endereço: " + enderecoTrabalho);
        System.out.println("Remuneração: R$ " + remuneracao);
        System.out.println("Projetos: " + projetos);
    }
}