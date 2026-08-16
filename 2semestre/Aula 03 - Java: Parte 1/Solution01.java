class Solution01 {
    public int minOperations(int[] nums, int k) {
        int soma = 0;

        // Iterar por todos os elementos
        for (int indiceAtual = 0; indiceAtual < nums.length; indiceAtual++) {
            soma += nums[indiceAtual];
        }

        // Só podemos subtrair, então precisamos remover o resto da divisão
        int subtracoesFaltantes = soma % k;

        return subtracoesFaltantes;
    }
}