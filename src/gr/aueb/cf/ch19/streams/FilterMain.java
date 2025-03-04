package gr.aueb.cf.ch19.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterMain {
    public static void main(String[] args) {
        List<String> cities = List.of("Athens", "London", "Toronto", "Tunid", "Athens");

        var tCities = cities.stream()
                .filter(city -> city.startsWith("T"))
                .collect(Collectors.toList()); // Java 8 +, mutable List


        var tCities2 = cities.stream()
                        .filter(city -> city.length() > 6);

        tCities.forEach(System.out::println);

        Set<String> uniqueCityNames = cities.stream().collect(Collectors.toSet());
        uniqueCityNames.forEach(System.out::println);

        String strCities = cities.stream()
                .collect(Collectors.joining(", "));

        System.out.println(strCities);
    }
}