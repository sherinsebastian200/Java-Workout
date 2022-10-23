import java.util.Scanner;

public class Perfectsquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first, last, n;
        System.out.println("Enter first limit");
        first = scanner.nextInt();
        System.out.println("Enter  last limit");
        last = scanner.nextInt();
        System.out.println("The perfect square numbers between the first interval " + first + " and last interval " + last +
                " are:");
        for (int i = first; i <= last; i++) {
            n = i * i;
            if (n <= last) {

                System.out.println(n);
            }
        }
    }
}
