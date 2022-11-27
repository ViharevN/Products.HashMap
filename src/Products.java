import java.util.Objects;

public class Products {
    private String nameProducts;
    private boolean checked;
    private int cost;
    private int weight;

    private boolean isBuy;

    public Products(String nameProducts, int cost) {
        this.nameProducts = nameProducts;
        this.cost = cost;
        if (nameProducts == null || nameProducts.isEmpty() || nameProducts.isBlank()) {
            throw new RuntimeException("Заполните карточку товара!");
        }
        if (cost <= 0) {
            throw new RuntimeException("Заполните карточку товара правильно");
        }
    }

    public boolean isBuy() {
        return isBuy;
    }

    public void buy() {
        isBuy = true;
    }


    public void setChecked() {
        this.checked = true;
    }

    public boolean isChecked() {
        return checked;
    }

    public String getNameProducts() {
        return nameProducts;
    }

    public void setNameProducts(String nameProducts) {
        this.nameProducts = nameProducts;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Products products = (Products) o;
        return Objects.equals(nameProducts, products.nameProducts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameProducts);
    }

    @Override
    public String toString() {
        String checkedString = this.isChecked() ? "Да" : "Нет";
        return String.format("%s, Цена: %s, Куплен: %s",
                this.nameProducts, this.cost, checkedString);
    }
}
