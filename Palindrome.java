// This program inds whether or not a user-input is a palindrome number or not
// Palindrome numbers demonstrate reflectional symmetry across a vertical axis; in simpler terms, upon flipping the number the value remains the same
// Example: 121 reversed is 121, 464 reversed is 464

import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        int temp, remainder, sum = 0;
        System.out.println ("Enter the number: "); //enters the value of the number from the user
        int number = Sc.nextInt(); //initializes variable
        temp = number; //storing the number for future comparisons
        while (number > 0){ //condition
            remainder = number % 10; //stores the remainder after the number is divided by ten, for example, the remainder of 232 would be 2, 23 would be 3, and 2 would be 2
            sum = (sum * 10) + remainder;
            number = number / 10; //in order to keep the loop going
        }

        if (temp == sum) { //checking if the variable stored in line 12 is same as the variable sum we have added to from the loop
            System.out.println ("Palindrome Number"); 
        } else {
            System.out.println ("Not a Palindrome Number");
        }
    }
}
