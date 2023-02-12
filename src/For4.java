import java.util.Scanner;

public class For4 {
    public static void main(String[] args) {
        System.out.println("Enter a number ");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=x;
        for(int i=1;i<x;i++){


            y=y*i;

        }System.out.println(y);
    }
}
