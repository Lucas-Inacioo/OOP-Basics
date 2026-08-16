O enunciado desse exercício é o seguinte:

> Implemente um aplicativo para controlar os candidatos de uma prova de concurso público. 
O  aplicativo  deve  armazenar  os  nomes  dos  candidatos  inscritos  no  concurso.  O  número 
máximo  de  candidatos  armazenados  deve  ser  informado  como  argumento  de  linha  de 
comando. O sistema deve ter as seguintes opções:
1 – Cadastrar candidato  
2 – Listar candidatos  
3 – Contar candidatos  
4 – Sair

O primeiro passo para esse exercício é identificar quais serão nossas classes e métodos. Podemos ter uma classe `Candidato` para representar cada candidato, e uma classe `ControleCandidatos` para gerenciar a lista de candidatos, além disso, criaremos uma terceira classe `Main`, que conterá o método `main` e a interação com o usuário.

Com isso em mente, a classe `Candidato` deve ter um atributo `nome` e um construtor para inicializar esse atributo, além de um getter para acessar o nome do candidato. Não é necessário ter um setter, já que o exercício não descreve a possibilidade de alteração do nome do candidato após criado.

Alternativamente, poderíamos somente salvar Strings diretamente em um array ou lista, sem a necessidade de criar uma classe `Candidato`, mas a criação dessa classe torna o código mais organizado e facilita a adição de novos atributos no futuro, caso seja necessário.

A classe `ControleCandidatos` deve ter um array ou lista para armazenar os candidatos, um método para cadastrar um candidato, um método para listar os candidatos e um método para contar o número de candidatos cadastrados. O método de cadastro deve verificar se o número máximo de candidatos foi atingido antes de adicionar um novo candidato à lista.

Por fim, algo um pouco mais complicado será a implementação do número máximo de candidatos, que deve ser informado como argumento de linha de comando. Para isso, podemos usar o método `args` do `main` para receber esse número e armazená-lo em uma variável na classe `ControleCandidatos`. Também devemos decidir entre a utilização de um array ou uma lista para armazenar os candidatos.

Esse exercício foi originalmente escrito para ser implementado por meio de arrays, mas a utilização de listas é mais flexível e fácil de trabalhar, dado que não se faz necessário o controle manual do tamanho da lista [1]. Por motivos educacionais, vamos implementar a solução utilizando arrays, mas fica como exercício para o leitor a implementação utilizando listas, [aqui está um guia](https://www.w3schools.com/java/java_arraylist.asp) para a importação e utilização delas.

## Referências
[1] https://www.reddit.com/r/learnprogramming/comments/1dmimj7/java_is_arraylist_better_than_arrays/