import java.util.Scanner;

/**
 * Created by willard on 2015-12-16.
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("Please input two numbers: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        try {
            System.out.println("a/b = " + a/b);
        }
        catch (Exception ex) {
            System.out.println("something error.");
        }

        System.out.println("finished.");

        input.close();
    }

    public static int quotient(int a, int b) {
        return a/b;
    }
}
