import java.util.Scanner;

public class Calculator {

  public static void sum(int x,int y) {
      Scanner sc=new Scanner(System.in);

     int  sum = x + y;
      System.out.println("Sum of two numbers is :" + sum);
  }
    public static void sub(int x,int y) {

        int sub = x - y;
        System.out.println("Subtraction of two numbers is :" + sub);
    }
    public static void mul(int x, int y) {

        int mul = x + y;
        System.out.println("Multiplication of two numbers is :" + mul);
    }
    public static void div(int x, int y) {

        int div = x / y;
        System.out.println("division of two numbers is :" + div);
    }
    public static void mod(int x, int y) {

       int  mod = x + y;
        System.out.println("Modulus of two numbers is :" + mod);
    }











    public static void main(String[] args) {
        int input;
        do { System.out.println("**********");
        System.out.println("Press 1. for addition");
        System.out.println("Press 2. for subtraction");
        System.out.println("Press 3. for multiplication");
        System.out.println("Press 4. for division");
        System.out.println("Press 5. for modulus");
        System.out.println("Press 0. for Exit");
        System.out.println("**********");
        System.out.println("Please enter your choice");
        Scanner sc = new Scanner(System.in);


            input = sc.nextInt();
            System.out.println("Please enter the first number");
            int x = sc.nextInt();
            System.out.println("Please enter the second number");
            int y = sc.nextInt();


            switch (input) {

                case 1:

                    sum(x, y);
                    break;
                case 2:
                    System.out.println("Subtraction");
                    sub(x, y);
                    break;
                case 3:
                    System.out.println("Multiplication");
                    mul(x, y);
                    break;
                case 4:
                    System.out.println("Division");
                    div(x, y);
                    break;
                case 5:
                    System.out.println("Modulus");
                    mod(x, y);
                    break;
                case 6:
                    System.exit(0);

                    break;
                default:
                    System.out.println("Invalid input");
            }
        }while( input != 0);

  }

  }



