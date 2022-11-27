import java.util.*;

public class ServiceRecipe {
    private final Set<Recipe> productsForRecipe = new HashSet<>();


    public boolean addRecipeProducts(Recipe recipe) {
        if (!productsForRecipe.contains(recipe)) {
            throw new RuntimeException("Рецепт уже есть");
        }
        productsForRecipe.add(recipe);
        return true;
    }

}
