package products;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ProductList {

    private final Set <Product> products = new HashSet<>();


    public void addProduct (Product product) {
        if (products.contains(product)) {
            throw new IllegalArgumentException("Такой продукт уже существует");
        } else {
            products.add(product);
        }
    }

    public void checkProduct (String name){
        for (Product product: this.products){
            if (product.getName().equals(name)){
                product.setChecked();
                break;
            }
        }
    }
    public void deleteProduct(String name){
        Iterator <Product> productsIterator = this.products.iterator();
        while (productsIterator.hasNext()){
            if (productsIterator.next().getName().equals(name));
            productsIterator.remove();
            break;
        }
    }

    @Override
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Список продуктов: ").append('\n');
      for (Product product:this.products){
          stringBuilder.append(product).append('\n');
      }
      return stringBuilder.toString();
    }


}
