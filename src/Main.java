public class Main {
    public static void main(String[] args) {
        Lavadora lav1 = new Lavadora("holaa", 21);
        System.out.println(lav1.getConsumo(5));
        System.out.println(lav1.getCosteConsumo(5,10));
    }
}
