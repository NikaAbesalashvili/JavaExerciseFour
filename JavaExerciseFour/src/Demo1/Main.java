package Demo1;

public class Main {
    public static void main(String[] args) {
        Names<String> names = new Names<>();
        names.add("Nika");
        names.add("Another");
        names.add("Random");
        names.add("Another");
        names.add("Random");

        System.out.println(names);
    }
}
