package gr.aueb.cf.ch19;

import java.util.List;

public class MainGen {
    public static void main(String[] args) {
    NodeGen<String> strNode = new NodeGen<>();
    NodeGen<Integer> intNode = new NodeGen<>();
    var doubleNode = new NodeGen<>();

    Integer[] intArr = {1, 2, 3, 4, 5, 6,};
    String[]  cities = {"athens", "paris", "Londom"};

    System.out.println(intArr);
    System.out.println(cities);

    intNode.setItem(1);
}

public static <T> void print(T[] arr){
        for(T t : arr) {
            System.out.println(t);
        }
}

public static <T> void printList(List<T> list){
        for (T t : list){
            System.out.println(t);
        }
}

public static void printNode(NodeGen<? extends Number> nodeGen){
    System.out.println(nodeGen.getItem());
}

public static <T extends Number> void printBounded(List<T> list){
        double sum = 0.0;

        for(T number : list){
            sum += number.doubleValue();
        }
}


public static <T> void consumerProducter(List<? super T> consumer, List<? extends T> producter){
        for(T t : producter){
            consumer.add(t);
        }
}
}