public class ControleCandidatos {
    private int numeroAtualCandidatos = 0;
    final private Candidato[] candidatos;

    // Construtor recebe o número máximo de candidatos e inicializa o array de candidatos com esse tamanho
    public ControleCandidatos(int maxCandidatos) {
        this.candidatos = new Candidato[maxCandidatos];
    }

    public void adicionarCandidato(String nomeCandidato) {
        if (numeroAtualCandidatos >= candidatos.length) {
            System.out.println("Não é possível adicionar mais candidatos. Limite atingido.");
            return; // Early return para evitar identação desnecessária
        }

        // Salvar o nome do candidato no array e incrementar o número atual de candidatos
        candidatos[numeroAtualCandidatos] = new Candidato(nomeCandidato);
        numeroAtualCandidatos++;
        System.out.println("Candidato " + nomeCandidato + " adicionado com sucesso.");
    }

    public void listarCandidatos() {
        if (numeroAtualCandidatos == 0) {
            System.out.println("Nenhum candidato cadastrado.");
            return; // Early return para evitar identação desnecessária
        }

        // Pretty print da lista de candidatos, mostrando o número do candidato e o nome
        System.out.println("Lista de candidatos:");
        for (int index = 0; index < numeroAtualCandidatos; index++) {
            System.out.println((index + 1) + ". " + candidatos[index].getNome());
        }
    }
}