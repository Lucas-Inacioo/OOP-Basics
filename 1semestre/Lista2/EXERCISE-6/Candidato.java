public class Candidato {
    // Aqui, final é usado para demonstrar que nome é uma constante
    final private String nome;

    // Construtor para inicializar o nome do candidato
    public Candidato(String nome) {
        this.nome = nome;
    }

    // Getter para o nome do candidato
    public String getNome() {
        return nome;
    }
}