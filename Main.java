import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // =========================================================
        // PRESIDENTE
        // =========================================================

        Presidente presidente = new Presidente(
                "Luiz Inácio Lula da Silva",
                "PT",
                "Palácio do Planalto",
                "Praça dos Três Poderes - Brasília/DF",
                46366.19,
                Arrays.asList(
                        "Novo PAC",
                        "Programa Pé-de-Meia"
                ),
                38
        );


        // =========================================================
        // GOVERNADORES
        // =========================================================

        Governador governadorPE = new Governador(
                "Raquel Lyra",
                "PSD",
                "Pernambuco",
                "Palácio do Campo das Princesas",
                "Praça da República - Recife/PE",
                49300.00,
                Arrays.asList(
                        "Juntos pela Segurança",
                        "PE na Estrada"
                ),
                0
        );

        Governador governadorSP = new Governador(
                "Tarcísio de Freitas",
                "Republicanos",
                "São Paulo",
                "Palácio dos Bandeirantes",
                "Av. Morumbi, 4500 - São Paulo/SP",
                36301.53,
                Arrays.asList(
                        "São Paulo na Direção",
                        "Novo Programa de Investimentos"
                ),
                0
        );


        // =========================================================
        // DEPUTADOS FEDERAIS
        // 3 de Pernambuco + 2 de São Paulo
        // =========================================================

        DeputadoFederal pedroCampos = new DeputadoFederal(
                "Pedro Campos",
                "PSB",
                "Bancada do PSB",
                46366.19,
                Arrays.asList(
                        "Projetos de infraestrutura",
                        "Projetos para Pernambuco"
                )
        );

        DeputadoFederal felipeCarreras = new DeputadoFederal(
                "Felipe Carreras",
                "PSB",
                "Bancada do PSB",
                46366.19,
                Arrays.asList(
                        "Projetos para o esporte",
                        "Projetos para Pernambuco"
                )
        );

        DeputadoFederal tulioGadelha = new DeputadoFederal(
                "Túlio Gadêlha",
                "PSD",
                "Bancada do PSD",
                46366.19,
                Arrays.asList(
                        "Projetos de fiscalização",
                        "Projetos de direitos sociais"
                )
        );

        DeputadoFederal alexandreLeite = new DeputadoFederal(
                "Alexandre Leite",
                "UNIÃO",
                "Bancada do UNIÃO",
                46366.19,
                Arrays.asList(
                        "Projetos legislativos",
                        "Projetos para São Paulo"
                )
        );

        DeputadoFederal alexManente = new DeputadoFederal(
                "Alex Manente",
                "CIDADANIA",
                "Bancada do CIDADANIA",
                46366.19,
                Arrays.asList(
                        "Projetos de educação",
                        "Projetos para São Paulo"
                )
        );


        // =========================================================
        // DEPUTADOS ESTADUAIS
        // 3 de Pernambuco + 2 de São Paulo
        // =========================================================

        DeputadoEstadual deboraAlmeida = new DeputadoEstadual(
                "Débora Almeida",
                "PSDB",
                "Pernambuco",
                Arrays.asList(
                        "Comissão de Constituição, Legislação e Justiça"
                ),
                "Rua da União, 439 - Recife/PE",
                34074.00,
                Arrays.asList(
                        "Projetos para Pernambuco"
                )
        );

        DeputadoEstadual joaoPaulo = new DeputadoEstadual(
                "João Paulo",
                "PT",
                "Pernambuco",
                Arrays.asList(
                        "Comissão de Desenvolvimento Econômico"
                ),
                "Rua da União, 439 - Recife/PE",
                34074.00,
                Arrays.asList(
                        "Projetos sociais",
                        "Projetos para Pernambuco"
                )
        );

        DeputadoEstadual diogoMoraes = new DeputadoEstadual(
                "Diogo Moraes",
                "PSB",
                "Pernambuco",
                Arrays.asList(
                        "Comissão de Constituição, Legislação e Justiça"
                ),
                "Rua da União, 439 - Recife/PE",
                34074.00,
                Arrays.asList(
                        "Projetos para o Agreste",
                        "Projetos de infraestrutura"
                )
        );

        DeputadoEstadual eduardoSuplicy = new DeputadoEstadual(
                "Eduardo Suplicy",
                "PT",
                "São Paulo",
                Arrays.asList(
                        "Comissão de Direitos Humanos"
                ),
                "Av. Pedro Álvares Cabral, 201 - São Paulo/SP",
                34774.64,
                Arrays.asList(
                        "Projetos sociais",
                        "Projetos de renda básica"
                )
        );

        DeputadoEstadual danielAnchao = new DeputadoEstadual(
                "Daniel Anchão Braga",
                "PODE",
                "São Paulo",
                Arrays.asList(
                        "Comissão de Segurança Pública"
                ),
                "Av. Pedro Álvares Cabral, 201 - São Paulo/SP",
                34774.64,
                Arrays.asList(
                        "Projetos para São Paulo"
                )
        );


        // =========================================================
        // SENADORES
        // 2 de Pernambuco + 1 de São Paulo
        // =========================================================

        Senador fernandoDueire = new Senador(
                "Fernando Dueire",
                "MDB",
                "Pernambuco",
                2022,
                46366.19,
                Arrays.asList(
                        "Projetos para Pernambuco"
                )
        );

        Senador humbertoCosta = new Senador(
                "Humberto Costa",
                "PT",
                "Pernambuco",
                2022,
                46366.19,
                Arrays.asList(
                        "Projetos de saúde",
                        "Projetos sociais"
                )
        );

        Senador marcosPontes = new Senador(
                "Marcos Pontes",
                "PL",
                "São Paulo",
                2022,
                46366.19,
                Arrays.asList(
                        "Projetos de ciência e tecnologia",
                        "Projetos de inovação"
                )
        );

        // =========================================================
        // POLIMORFISMO
        // =========================================================

List<Politico> politicos = Arrays.asList(
        presidente,
        governadorPE,
        governadorSP,
        pedroCampos,
        felipeCarreras,
        tulioGadelha,
        alexandreLeite,
        alexManente,
        deboraAlmeida,
        joaoPaulo,
        diogoMoraes,
        eduardoSuplicy,
        danielAnchao,
        fernandoDueire,
        humbertoCosta,
        marcosPontes
);

System.out.println("\n========== POLIMORFISMO ==========\n");

for (Politico politico : politicos) {
    System.out.println(
            politico.getNome() + ": " +
            politico.exercerMandato()
    );
}

        // =========================================================
        // EXIBIÇÃO DOS DADOS
        // =========================================================

        System.out.println("\n========== POLÍTICOS CADASTRADOS ==========\n");

        presidente.mostrarDados();

        governadorPE.mostrarDados();
        governadorSP.mostrarDados();

        pedroCampos.mostrarDados();
        felipeCarreras.mostrarDados();
        tulioGadelha.mostrarDados();
        alexandreLeite.mostrarDados();
        alexManente.mostrarDados();

        deboraAlmeida.mostrarDados();
        joaoPaulo.mostrarDados();
        diogoMoraes.mostrarDados();
        eduardoSuplicy.mostrarDados();
        danielAnchao.mostrarDados();

        fernandoDueire.mostrarDados();
        humbertoCosta.mostrarDados();
        marcosPontes.mostrarDados();


        // =========================================================
        // MANDATOS
        // =========================================================

        System.out.println("\n========== MANDATOS ==========\n");

        System.out.println(presidente.exercerMandato());

        System.out.println(governadorPE.exercerMandato());
        System.out.println(governadorSP.exercerMandato());

        System.out.println(pedroCampos.exercerMandato());
        System.out.println(felipeCarreras.exercerMandato());
        System.out.println(tulioGadelha.exercerMandato());
        System.out.println(alexandreLeite.exercerMandato());
        System.out.println(alexManente.exercerMandato());

        System.out.println(deboraAlmeida.exercerMandato());
        System.out.println(joaoPaulo.exercerMandato());
        System.out.println(diogoMoraes.exercerMandato());
        System.out.println(eduardoSuplicy.exercerMandato());
        System.out.println(danielAnchao.exercerMandato());

        System.out.println(fernandoDueire.exercerMandato());
        System.out.println(humbertoCosta.exercerMandato());
        System.out.println(marcosPontes.exercerMandato());


        // =========================================================
        // AÇÕES DO PRESIDENTE
        // =========================================================

        System.out.println("\n========== AÇÕES DO PRESIDENTE ==========");

        System.out.println(presidente.nomearMinistros());
        System.out.println(presidente.exonerarMinistros());
        System.out.println(presidente.comandarForcasArmadas());
        System.out.println(presidente.representarPais());
        System.out.println(presidente.elaborarPPA());
        System.out.println(presidente.elaborarLDO());
        System.out.println(presidente.elaborarLOA());


        // =========================================================
        // AÇÕES DOS GOVERNADORES
        // =========================================================

        System.out.println("\n========== AÇÕES DOS GOVERNADORES ==========");

        System.out.println(governadorPE.gerirPoliciaMilitar());
        System.out.println(governadorPE.administrarRodovias());
        System.out.println(governadorPE.coordenarEducacaoSaude());
        System.out.println(governadorPE.elaborarPPA());
        System.out.println(governadorPE.elaborarLDO());
        System.out.println(governadorPE.elaborarLOA());

        System.out.println(governadorSP.gerirPoliciaMilitar());
        System.out.println(governadorSP.administrarRodovias());
        System.out.println(governadorSP.coordenarEducacaoSaude());
        System.out.println(governadorSP.elaborarPPA());
        System.out.println(governadorSP.elaborarLDO());
        System.out.println(governadorSP.elaborarLOA());


        // =========================================================
        // AÇÕES DOS DEPUTADOS FEDERAIS
        // =========================================================

        System.out.println("\n========== AÇÕES DOS DEPUTADOS FEDERAIS ==========");

        System.out.println(pedroCampos.votarPEC());
        System.out.println(pedroCampos.criarCPI());
        System.out.println(pedroCampos.votarPPA());
        System.out.println(pedroCampos.votarLDO());
        System.out.println(pedroCampos.votarLOA());
        System.out.println(pedroCampos.proporLeiComplementar());


        // =========================================================
        // AÇÕES DOS DEPUTADOS ESTADUAIS
        // =========================================================

        System.out.println("\n========== AÇÕES DOS DEPUTADOS ESTADUAIS ==========");

        System.out.println(deboraAlmeida.votarPPA());
        System.out.println(deboraAlmeida.votarLOA());
        System.out.println(deboraAlmeida.votarLDO());
        System.out.println(deboraAlmeida.proporEmenda());
        System.out.println(deboraAlmeida.criarCPI());


        // =========================================================
        // AÇÕES DOS SENADORES
        // =========================================================

        System.out.println("\n========== AÇÕES DOS SENADORES ==========");

        System.out.println(fernandoDueire.aprovarAutoridades());
        System.out.println(fernandoDueire.julgarCrimesResponsabilidade());
        System.out.println(fernandoDueire.representarEstado());

        System.out.println(humbertoCosta.aprovarAutoridades());
        System.out.println(humbertoCosta.julgarCrimesResponsabilidade());
        System.out.println(humbertoCosta.representarEstado());

        System.out.println(marcosPontes.aprovarAutoridades());
        System.out.println(marcosPontes.julgarCrimesResponsabilidade());
        System.out.println(marcosPontes.representarEstado());
    }
}