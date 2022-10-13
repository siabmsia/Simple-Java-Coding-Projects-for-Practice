import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        int temp, remainder, sum = 0;
        System.out.println ("Enter the number: "); //enters the value of the number from the user
        int number = Sc.nextInt(); //initializes variable
        temp = number; //storing the number for future comparisons
        while (number > 0){
            remainder = number % 10;
            sum = sum + remainder;
            number = number / 10;
        }

        if (temp == sum) {
            System.out.println ("Palindrome Number");
        } else {
            System.out.println ("Not a Palindrome Number");
        }
    }
}
