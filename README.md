# Desafio Pagamento

Exercício de Programação Orientada a Objetos em Java que simula o cálculo do
valor final de um pagamento conforme o meio escolhido: Pix, cartão ou boleto.

O projeto aplica herança, classe abstrata e polimorfismo: a mesma chamada
`calcularTotal()` produz resultados diferentes conforme o tipo real do objeto,
sem nenhum `if` para descobrir qual meio foi usado.

## Estrutura do projeto

    desafio-pagamento/
    └── src/
        ├── Pagamento.java
        ├── Pix.java
        ├── Cartao.java
        ├── Boleto.java
        └── App.java

### Pagamento

Classe abstrata que serve de base para todos os meios de pagamento.

- Atributo `protected double valor`.
- Construtor `Pagamento(double valor)`.
- Método abstrato `calcularTotal()`, que obriga cada subclasse a definir sua
  própria regra de cálculo.

### Pix

`extends Pagamento`. Aplica desconto de 5% sobre o valor:

    valor - (0.05 * valor)

### Cartao

`extends Pagamento`. Aplica acréscimo de 8% sobre o valor:

    valor + (0.08 * valor)

### Boleto

`extends Pagamento`. Aplica desconto fixo de R$ 10,00:

    valor - 10

### App

Classe com o método `main`. Monta um `ArrayList<Pagamento>` com um objeto de
cada tipo, imprime o total de cada um e, ao final, imprime a soma de todos os
pagamentos usando um laço `for-each`.

## Regras de cálculo

| Meio de pagamento | Regra                    | Exemplo com valor 200 |
|-------------------|--------------------------|-----------------------|
| Pix               | valor - 5%               | 190.0                 |
| Cartão            | valor + 8%               | 216.0                 |
| Boleto            | valor - 10               | 190.0                 |

## Como executar

Requisito: JDK 8 ou superior.

Entre na pasta do código-fonte:

    cd desafio-pagamento/src

Compile todos os arquivos:

    javac *.java

Execute:

    java App

## Saída esperada

Com os valores usados no `main` (todos com valor 200):

    190.0
    216.0
    190.0
    596.0

As três primeiras linhas são os totais individuais de Pix, Cartão e Boleto.
A última linha é a soma da lista.

## Conceitos aplicados

- Herança com `extends`.
- Classe e método abstratos, que impedem instanciar `Pagamento` diretamente.
- Chamada a `super(valor)` no construtor das subclasses.
- Sobrescrita de método com `@Override`.
- Polimorfismo em tempo de execução.
- Coleção genérica com `ArrayList<Pagamento>`.
- Laço `for-each` para percorrer a coleção.

## Autor

Aluno: Anne Aimers
Disciplina: Programação Orientada a Objetos
