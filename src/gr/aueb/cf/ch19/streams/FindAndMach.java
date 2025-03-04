package gr.aueb.cf.ch19.streams;

import java.util.List;
import java.util.Optional;

public class FindAndMach {

    public static void main(String[] args) throws Exception {
        List<String> names = List.of("Alice", "Bob", "Charlie", "David");

        //Optional is a class/container for wrapping null. Avoid NPE
        Optional<String> query = names.stream()
                .filter(name -> name.equals("Alice"))
                .findFirst();

        if (query.isPresent()) {
            System.out.println("Firstname: " + query.get());
        }

        query.ifPresent(first -> System.out.println("First name:" + first));


        String strFirst1 = names.stream()
                .filter(name -> name.equals("bob"))
                .findFirst().orElse(null);

        String strFirst2 = names.stream()
                .filter(name -> name.equals("bob"))
                .findFirst().orElseThrow(() -> new Exception("Alice not Exists"));

        //Match
        boolean isBobExists = names.stream()
                .anyMatch(name -> name.equals("bob"));

        boolean allAreBob = names.stream()
                .allMatch(name -> name.equals("bob"));

        boolean noneAreBob = names.stream()
                .noneMatch(name -> name.equals("bob"));
    }
}
