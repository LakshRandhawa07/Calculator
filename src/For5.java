import java.util.Scanner;

public class For5 {
    public static void main(String[] args) {
        System.out.println("Please enter a number");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int sumeven=0;
        int sumodd=0;
        for(int i=1;i<=x;i++) {
            if (i % 2 == 0) {
                sumeven = sumeven + i;
            } else {
                sumodd = sumodd + i;
            }
        }
        System.out.println(sumeven);
        System.out.println(sumodd);
            }





    }
