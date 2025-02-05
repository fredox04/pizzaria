import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    List<Pizza> carrinho = new ArrayList<Pizza>();
    int quantidade = contarPizzas();
    double valorTotal = getValorTotal();

    void adicionaPizza(Pizza pizza){
        if (pizza != null && pizza.temIngredientes()) {
            this.carrinho.add(pizza);
        } else {
            System.out.println("Não é possível adicionar pizza sem ingredientes ao carrinho!");
        }
    }

    int contarPizzas(){
        return carrinho.size();
    }

    double getValorTotal(){
        double total = 0;
        for(Pizza pizza : carrinho){
            total += pizza.getPreco();
        }
        return total;
    }

}
