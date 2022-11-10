package products;

import java.util.Objects;

public class Product {

    private final String name;
    private final float price;
    private final int count;
    private boolean checked;


    public Product(String name, float price, int count) {
        if (name==null || name.isBlank() || price <= 0 || count < 0 ){
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        }
        this.name = name;
        this.price = price;
        this.count = count;
        this.checked= false;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked() {
        this.checked = true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        String checkedString = this.isChecked()? " Да " : " Нет ";
        return "Наименование: " + name +
                ", цена: " + price +
                ", количество: " + count +
                ", Куплено:  "+ checkedString;
    }
}
