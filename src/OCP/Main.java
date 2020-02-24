package OCP;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ProductFilter productFilter = new ProductFilter();
        List<Product> listProducts = new ArrayList<Product>();

        Product product1 = new Product("Produto 1", Color.RED, Size.LARGE);
        Product product2 = new Product("Produto 2", Color.BLUE, Size.MEDIUM);
        Product product3 = new Product("Produto 3", Color.RED, Size.LARGE);
        Product product4 = new Product("Produto 4", Color.GREEN, Size.SMALL);
        Product product5 = new Product("Produto 5", Color.RED, Size.YUGE);

        listProducts.add(product1);
        listProducts.add(product2);
        listProducts.add(product3);
        listProducts.add(product4);
        listProducts.add(product5);

        ProductColorSpecification ColorRed = new ProductColorSpecification(Color.RED);

        Stream<Product> productsRED = productFilter.Filter(listProducts, ColorRed);

        productsRED.forEach(s -> System.out.println(s));
    }
}
