import java.util.Map;

public class App {
    public static void main(String[] args){

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        Pizza pizza1 = new Pizza();
        pizza1.adicionaIngrediente("Mussarela");
        pizza1.adicionaIngrediente("Tomate");
        pizza1.adicionaIngrediente("Mussarela");
        pizza1.adicionaIngrediente("Manjericão");
        carrinho.adicionaPizza(pizza1);

        Pizza pizza2 = new Pizza();
        pizza2.adicionaIngrediente("Mussarela");
        pizza2.adicionaIngrediente("Tomate");
        carrinho.adicionaPizza(pizza2);

        Pizza pizza3 = new Pizza();
        carrinho.adicionaPizza(pizza3);

        Pizza pizza4 = new Pizza();
        pizza4.adicionaIngrediente("Mussarela");
        pizza4.adicionaIngrediente("Tomate");
        pizza4.adicionaIngrediente("Tomate");
        pizza4.adicionaIngrediente("Gorgonzola");
        pizza4.adicionaIngrediente("Provolone");
        pizza4.adicionaIngrediente("Catupiry");
        carrinho.adicionaPizza(pizza4);

        System.out.println("Total do Carrinho: R$ " + carrinho.getValorTotal());
        System.out.println("\nIngredientes utilizados no total:");

        for (Map.Entry<String, Integer> entrada : Pizza.getIngredientesGastos().entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }

    }
}
