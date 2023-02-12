import java.util.Scanner;

public class For6 {
    public static void main(String[] args) {
        System.out.println("please enter a number");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        do {
            int i = 2;
            if (x % i != 0) {
            System.out.println("It is a prime number");}
            else{System.out.println("it is not a prime number");}
i++;
        } while (false);

    }
}