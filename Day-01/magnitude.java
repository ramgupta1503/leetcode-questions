import java.util.Scanner;

public class magnitude {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int x = in.nextInt();

        if (x > 69 || x <-69) {
            System.out.println("Magnitude of x is greater than 69 which is: " + x);
        }

        else {
            System.out.println("Magnitude of x is less than 69 which is: " + x);
        }
    }
}
