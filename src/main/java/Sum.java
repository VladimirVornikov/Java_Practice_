//Sum
//        Your math teacher asked you to calculate the sum of the numbers 1 to N, where N is a given number.
//        Task: Take an integer N from input and output the sum of the numbers 1 to N, inclusive.
//        Sample Input:
//        10
//        Sample Output:
//        55
import  java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int x = 1;
        int sum =0;

        while (num>=x) {
            sum += x;
            x++;
        }
        System.out.println(sum);

    }

}