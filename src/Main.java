import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Print the bigger number out of 3 numbers

        int num1;
        int num2;
        int num3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Number");
        num1 = scanner.nextInt();

        System.out.println("Enter the Second Number");
        num2 = scanner.nextInt();

        System.out.println("Enter the Third Number");
        num3 = scanner.nextInt();

        if(num1 >= num2 && num1 >= num3)
            System.out.println("The Largest Number of the three numbers is: "+ num1);

        else if(num2 >= num1 && num1 >= num3)
        System.out.println("The Largest Number of the three numbers is: " + num2);

        else System.out.println("The Largest Number of the three Numbers is: "+ num3);
    }
}