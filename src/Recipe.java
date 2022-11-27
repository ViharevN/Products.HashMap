import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;


public class Recipe {
    private final String nameRecipe;
    private Set<Products> recipeSet;
    private int amount;

    private Map<Products, Integer> recipeMap = new HashMap<>();

    public Recipe(String nameRecipe) {
        this.nameRecipe = nameRecipe;
        if (nameRecipe == null || nameRecipe.isBlank() || nameRecipe.isEmpty() || recipeMap.size() < 0) {
            throw new RuntimeException("Данные должны быть заполнены");
        }
    }

    public String getNameRecipe() {
        return nameRecipe;
    }

    public Set<Products> getRecipeSet() {
        return recipeSet;
    }

    public int getAmount() {
        return amount;
    }

    public int getSum() {
        int sum = 0;
//        for (Products products : recipeSet) {
//            sum += products.getCost();
//        }

        for (Map.Entry<Products, Integer> productsEntry : recipeMap.entrySet()) {
            sum += productsEntry.getKey().getCost() * productsEntry.getValue();
        }
        return sum;
    }

    public void addProduct(Products products, int amount) {
        if (amount <= 0) {
            amount = 1;
        }
        if (this.recipeMap.containsKey(products)) {
            recipeMap.put(products, recipeMap.get(products) + amount);
        } else {
            recipeMap.put(products, amount);
            products.setChecked();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(nameRecipe, recipe.nameRecipe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameRecipe);
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список продуктов:").append('\n');
//        for (Products product : this.recipeSet) {
//            stringBuilder.append(product).append('\n');
//        }
        for (Map.Entry<Products, Integer> productsIntegerEntry : recipeMap.entrySet()) {
            stringBuilder.append(productsIntegerEntry).append('\n');
        }
        return stringBuilder.toString();
    }
}
