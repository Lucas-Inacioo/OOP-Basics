public class Main {
    public static void main(String[] args) {
        int n = 5; // Você pode alterar o valor de n para calcular a tabuada de outro número

        // Comando para imprimir no terminal
        System.out.println("Tabuada de " + n + ":");

        // Loop para calcular e imprimir a tabuada de n
        for (int multiplicador = 1; multiplicador <= 100; multiplicador++) {
            // Concatenando a string para exibir o resultado da multiplicação
            System.out.println(n + " x " + multiplicador + " = " + (n * multiplicador));
        }
    }
}