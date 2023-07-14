//Factorial
//        The factorial of a number N is equal to 1 * 2 * 3 * ... * N
//        For example, the factorial of 5 is 1* 2 * 3 * 4 * 5  = 120.
//        Create a program that takes a number from input and output the factorial of that number.
import java.util.Scanner;

class Factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =1;
        int num = sc.nextInt();
        for (int x=1; num>=x; x++) {
            sum*=x;
        }
        System.out.print(sum);

    }
}