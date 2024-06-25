public class nestedif {
    public static void main(String[] args) {
        int num = 70;
        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println("it is odd");
            }
            if (true) {
                System.out.println("you did it");
            }
        }
    }
}
