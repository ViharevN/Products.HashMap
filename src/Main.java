import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Products> productsList = new HashSet<>();

        Products bananas = new Products("Бананы", 99);
        Products orange = new Products("Апельсины", 130);
        Products mandarin = new Products("Мандарины", 120);
        Products apple = new Products("Яблоки", 100);
        Products pineapple = new Products("Ананас", 200);
        Products tomato = new Products("Томаты", 80);

        ServiceProducts products = new ServiceProducts();
        products.add(bananas);
//        products.add(bananas);
        products.add(orange);
        products.add(mandarin);
        products.add(apple);
        products.add(pineapple);
        products.add(tomato);

        tomato.setChecked();

        products.delete(orange);

        System.out.println(products.toString());

//        Recipe fruitSalad = new Recipe("Фруктовый салат", fruits);
//        fruits.add(orange);
//        fruits.add(mandarin);
//        fruits.add(apple);

//        System.out.println();
//        System.out.println(fruitSalad);
//        System.out.println(fruitSalad.getSum());

        Products rice = new Products("рис", 60);
        Products meat = new Products("мясо", 400);
        Products oil = new Products("масло", 160);

        Recipe riceAndMeat = new Recipe("Рис с мясом");

        riceAndMeat.addProduct(rice, 2);
        riceAndMeat.addProduct(meat, 4);
        riceAndMeat.addProduct(oil, 1);

        System.out.println(riceAndMeat.toString());
        System.out.println(riceAndMeat.getSum());
    }
}