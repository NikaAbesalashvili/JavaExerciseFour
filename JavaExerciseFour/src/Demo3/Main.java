package Demo3;

public class Main {
    public static void main(String[] args) {

    }

    static <Smart extends Smartphone> void smartphones(Smart smart) {
        System.out.println(smart);
    }

    static <Sim extends Simbian> void simbians(Sim sim) {
        System.out.println(sim);
    }
}
