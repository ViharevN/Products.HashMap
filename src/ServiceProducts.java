import java.util.HashSet;
import java.util.Set;


public class ServiceProducts {
    private final Set<Products> set = new HashSet<>();

    public Set<Products> getSet() {
        return set;
    }

    public boolean add(Products product) {
        if (!set.add(product)) {
            throw new RuntimeException("продукт уже есть в списке");
        }
        product.buy();
        return true;
    }

    public void delete(Products product) {
        set.remove(product);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список продуктов:").append('\n');
        for (Products product : this.set) {
            stringBuilder.append(product).append('\n');
        }
        return stringBuilder.toString();
    }



}
