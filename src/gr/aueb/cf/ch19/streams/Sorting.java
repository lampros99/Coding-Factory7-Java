package gr.aueb.cf.ch19.streams;

import java.util.Comparator;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        List<Product> products = List.of
                (new Product("Chocolate", 10.5, 45),
                        new Product("Strobbery", 8.5, 20),
                        new Product("Apples", 10.5, 45),
                        new Product("Oranges", 8.5, 20),
                        new Product("Milk", 8.9, 20)
                        );

        var sortedProducts = products.stream()
                .sorted(Comparator.comparing(Product::getName));

        sortedProducts.forEach(System.out::println);

    }
}
