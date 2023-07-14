//Vending Machine
//        You are making a program for a vending machine that provides drinks.
//        The menu of the drinks is stored in an array called menu:
//        String[] menu = {"Tea", "Espresso", "Americano", "Water", "Hot Chocolate"};
//        JAVA
//        Take the choice of the customer as an integer from input and output the corresponding menu item.
//        Also, check for errors: in case the input is out of the range of the array, output "Invalid".
import  java.util.Scanner;

public class Vending {
    public static void main(String[] args) {
        String[] menu = {"Tea", "Espresso", "Americano", "Water", "Hot Chocolate"};
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num>4) {
            System.out.println("Invalid");
        } else {
            System.out.println(menu[num]);
        }

    }

}