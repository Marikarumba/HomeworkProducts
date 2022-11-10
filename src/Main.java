import products.Product;
import products.ProductList;
import recipe.Recipe;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Product apple = new Product(
                "Яблоки",
                100.00f,
                5);

        Product banana = new Product(
                "Бананы",
                70.00f,
                3);

        Product orange = new Product(
                "Апельсины",
                120.00f,
                6);

        Product pear = new Product(
                "Груши",
                100.00f,
                4);

        ProductList productList = new ProductList();
        productList.addProduct(apple);
        productList.addProduct(banana);
        productList.addProduct(orange);
        productList.addProduct(pear);

        System.out.println(productList.toString());


        //productList.addProduct(apple);

        Recipe fruitSalad = new Recipe(
                "Фруктовый салат",
                Set.of(apple,banana, orange, pear));

        System.out.println(fruitSalad.toString());

        numbersSet();


    }

    private static void numbersSet(){
        Set<Integer> numbers = new HashSet<>(20);
        Random random = new Random();
        while (numbers.size()<20){
            numbers.add(random.nextInt(1001));
        }
        System.out.println(numbers);
        Iterator <Integer> iterator = numbers.iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            if (next % 2 != 0){
                iterator.remove();
            }
        }
        System.out.println(numbers);
    }


}