package gr.aueb.cf.ch19;

public class Main {
    public static void main(String[] args) {
        NodeObg nodeObj = new NodeObg();
        nodeObj.setItem("Coding");

        int item = (int) nodeObj.getItem();
        System.out.println(item);
    }
}
