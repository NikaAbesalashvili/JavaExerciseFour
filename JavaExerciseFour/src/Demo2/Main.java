package Demo2;

public class Main {
    public static void main(String[] args) {
        Summable sumTwoNumbers = (int x, int y) -> x + y;

        int firstOperation = sumTwoNumbers.sum(12, 19);
        int secondOperation = sumTwoNumbers.sum(27, 72);

        System.out.println(firstOperation);
        System.out.println(secondOperation);
    }
}
