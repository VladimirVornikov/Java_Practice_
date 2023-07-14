//Age Group
//        Given the age of a person as an input, output their age group.
//        Here are the age groups you need to handle:
//        Child: 0 to 11
//        Teen: 12 to 17
//        Adult: 18 to 64
import  java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age>0 && age <11) {
            System.out.println("Child");

        } else if (age >11 && age<18) {
            System.out.println("Teen");

        } else {
            System.out.println("Adult");
        }

    }
}