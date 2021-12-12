import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        for(String i: list) {
            System.out.println(i);
        }
    }
}
