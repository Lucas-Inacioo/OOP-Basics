
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Usar args para receber o máximo de candidatos pela linha de comando
        final int MAX_CANDIDATOS = Integer.parseInt(args[0]);

        // menuSelectedOption é a variável que irá armazenar a opção selecionada pelo usuário no menu
        String menuSelectedOption;

        // Scanner é a forma mais simples de ler dados do terminal, e é parte da biblioteca java.util
        Scanner scanner = new Scanner(System.in);

        // ControleCandidatos é a classe que irá gerenciar os candidatos
        ControleCandidatos controleCandidatos = new ControleCandidatos(MAX_CANDIDATOS);

        // Loop infinito para exibir o menu até que o usuário escolha a opção de sair
        while (true) {
            // Exibindo o menu para o usuário
            System.out.println("Menu:");
            System.out.println("1. Adicionar candidato");
            System.out.println("2. Listar candidatos");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            menuSelectedOption = scanner.nextLine();

            // Verificando a opção selecionada pelo usuário
            switch (menuSelectedOption) {
                case "1" -> { // Inserção
                    System.out.print("Digite o nome do candidato: ");
                    String nomeCandidato = scanner.nextLine();
                    controleCandidatos.adicionarCandidato(nomeCandidato);
                    System.out.println(""); // Imprime uma linha em branco para melhorar a legibilidade do menu
                }
                case "2" -> { // Listagem
                    controleCandidatos.listarCandidatos();
                    System.out.println(""); // Imprime uma linha em branco para melhorar a legibilidade do menu
                }
                case "3" -> { // Saída
                    System.out.println("Saindo do programa...");
                    scanner.close(); // Fechando o scanner para liberar recursos
                    return; // Saindo do método main, o que encerra o programa
                }
                default -> System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }
}