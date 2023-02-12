import java.util.Scanner;

public class For3 {
    public static void main(String[] args) {
        System.out.println("Please neter a number");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();

        for(int i =1;i<=10;i++){
            int y=x*i;

        System.out.println(x +"*" +i +"=" +y);}
    }
}
