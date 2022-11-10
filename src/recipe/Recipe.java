package recipe;

import products.Product;

import java.util.Objects;
import java.util.Set;

public class Recipe {
    private final String name;
    private final Set<Product> products;

    public Recipe(String name, Set<Product> products) {
        if (name == null || name.isBlank() || products==null || products.size() == 0){
            throw new IllegalArgumentException("Необходимо заполнить все поля!");
        }
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public Set<Product> getProducts() {
        return products;
    }
    public float getRecipeCost(){
        float cost = 0;
        for (Product product: products){
            cost += product.getPrice();
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
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Название рецепта: ").append(getName()).append('\n');
        for (Product product:products){
            stringBuilder2.append(product.getName()).append('\n');
        }
        return stringBuilder2.toString();
    }

}
