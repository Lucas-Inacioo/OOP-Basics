public class Main {
    public static void main(String[] args) {
        System.out.println("Números múltiplos de 3 entre 1 e 100:");

        // Loop para verificar os números de 1 a 100
        for (int index = 1; index <= 100; index++) {
            // Verifica se resto da divisão por 3 é zero
            if (index % 3 == 0) {
                System.out.println(index); // Imprime o número se for múltiplo de 3
            }
        }     
    }
}