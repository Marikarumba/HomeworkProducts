package recipe;

import products.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Recipe {
    private final String name;
    private Map <Product, Integer> products =new HashMap<>();

    public Recipe(String name) {
        if (name == null || name.isBlank() ){
            throw new IllegalArgumentException("Необходимо заполнить все поля!");
        }
        this.name = name;
        //this.products = products;
    }

    public void addProduct(Product product, Integer productCount ){
        products.put(product,productCount);
    }

    public void addProduct(Product product ){
        products.put(product,1);
    }

    public String getName() {
        return name;
    }

    public float getRecipeCost(){
        float cost = 0;
        for (Map.Entry<Product, Integer> product: products.entrySet()) {
            cost += product.getKey().getPrice()*product.getValue();
        }
        return cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(name, recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }


    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        out.append("Название рецепта: ").append(getName()).append('\n');
        for (Map.Entry<Product, Integer> product: products.entrySet()) {
            out.append(product.getKey().getName()).append(", количество: ").append(product.getValue()).append("\n");
        }

        return out.toString();
    }

}
