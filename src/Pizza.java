import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pizza {
    private List<String> ingredientes = new ArrayList<String>();

    private static Map<String, Integer> ingredientesGastos = new HashMap<>();

    public void adicionaIngrediente(String ingrediente){
        if (ingrediente != null && !ingrediente.trim().isEmpty()){
            this.ingredientes.add(ingrediente);
            contabilizaIngrediente(ingrediente);
        }
    }
    
    public void contabilizaIngrediente(String ingrediente){
        if (ingredientesGastos.containsKey(ingrediente)){
            ingredientesGastos.put(ingrediente, ingredientesGastos.get(ingrediente) + 1);
        }else{
            ingredientesGastos.put(ingrediente, 1);
        }
    }

    public boolean temIngredientes(){
        if (this.ingredientes.size() != 0){
            return true;
        }else{
            return false;
        }
    }
    
    public double getPreco(){
        int quantIngredientes = this.ingredientes.size();
        double preco = 0.0;
        if (quantIngredientes < 0 && quantIngredientes < 2){
            preco = 15.0;
        } else if(quantIngredientes > 3 && quantIngredientes < 5){
            preco = 20.0;
        } else{
            preco = 23.0;
        }
        return preco;
    }
    public static Map<String, Integer> getIngredientesGastos() {
        return ingredientesGastos;
    }
}
