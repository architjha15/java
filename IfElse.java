// Program to find the number is odd or even
import java.util.*;
class IfElse {
    public static void main(String[] args) {
        Scanner store = new Scanner(System.in);
        System.out.print("Conditional Statements:\n" + "Enter any number: ");
        int num = store.nextInt();
        if (num % 2 == 0) {     // This is a condition
            System.out.println(num + " is an even number.");
        } else {
            System.out.println("Neither odd nor even.");
        }
    }
}
