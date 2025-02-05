# Projeto Pizza Java

Este repositório contém uma aplicação simples em Java que simula um sistema de carrinho de compras de pizzas, contabilizando ingredientes e calculando o valor total do pedido.

## Visão Geral

A aplicação é composta por três classes principais:

1. **Pizza**  
   - Responsável por armazenar os ingredientes de cada pizza.  
   - Possui um `Map<String, Integer>` estático que contabiliza todos os ingredientes utilizados em todas as pizzas instanciadas.
   - Calcula o preço da pizza com base na quantidade de ingredientes.

2. **CarrinhoDeCompras**  
   - Armazena diversas instâncias de `Pizza`.  
   - Soma o valor total de todas as pizzas e impede a inserção de pizzas sem ingredientes.

3. **App**  
   - Classe principal (`main`) para executar o programa e demonstrar o uso das demais classes.

## Detalhes das classes

### Pizza
- **Atributos**:  
  - `List<String> ingredientes`: Armazena os ingredientes de cada pizza.  
  - `Map<String, Integer> ingredientesGastos`: Mapeia cada ingrediente para a quantidade total usada em todas as pizzas.

- **Métodos Principais**:  
  - `adicionaIngrediente(String ingrediente)`:  
    - Adiciona um ingrediente à pizza, desde que não seja `null` ou vazio, e contabiliza o ingrediente no mapa estático.  
  - `temIngredientes()`:  
    - Retorna `true` se a pizza possui ao menos um ingrediente; caso contrário, retorna `false`.  
  - `getPreco()`:  
    - Retorna o preço da pizza baseado na quantidade de ingredientes.  
    - Exemplo de regra (pode ser modificada conforme sua necessidade):
      - Menos de 2 ingredientes: R\$ 15,00  
      - Entre 3 e 4 ingredientes: R\$ 20,00  
      - 5 ou mais ingredientes: R\$ 23,00  
  - `getIngredientesGastos()`:  
    - Retorna o mapa estático com o total de cada ingrediente gasto em todas as pizzas instanciadas.

### CarrinhoDeCompras
- **Atributos**:  
  - `List<Pizza> carrinho`: Lista de pizzas adicionadas ao carrinho.  
  - `int quantidade`: Quantidade de pizzas no carrinho. (Obtido pelo método `contarPizzas()` no momento de verificação.)  
  - `double valorTotal`: Soma dos valores de todas as pizzas no carrinho.

- **Métodos Principais**:  
  - `adicionaPizza(Pizza pizza)`:  
    - Adiciona uma pizza ao carrinho apenas se ela tiver pelo menos um ingrediente. Caso contrário, exibe uma mensagem de erro.  
  - `contarPizzas()`:  
    - Retorna a quantidade de pizzas no carrinho.  
  - `getValorTotal()`:  
    - Percorre todas as pizzas adicionadas e soma o valor total, retornando um `double`.

### App
- **Ponto de entrada da aplicação** (`main`):
  - Instancia um objeto `CarrinhoDeCompras`.
  - Cria diversas pizzas, adicionando diferentes ingredientes em cada uma.
  - Adiciona essas pizzas ao carrinho (se tiverem ingredientes).
  - Calcula o valor total do carrinho.
  - Exibe:
    - O valor total.
    - A lista de ingredientes utilizados em todas as pizzas, com suas quantidades.
