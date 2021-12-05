package counter;

import java.util.Scanner;
/*
 * Write a program that calculates the average and sum of numbers entered and the number of attempts made to guess the favorite number.
 * @author 88min
 */
public class Counter {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num;
    int sum = 0;
    double average = 0;
    double ctr =0;
   
    System.out.print("Hello there! Input a number to guess my favorite number: ");
  
        while ( ( num = input.nextInt() )!= 8) //favorite number = 8
        {
            System.out.print("That's not my favorite number! Enter another number to try again: ");
            average = sum / ctr; //average of the guessed numbers
            sum = sum + num; //summation of the guessed numbers
            ctr++; //count number of attempts
        }
            System.out.println("Congratulations, you finally got my favorite number!\n");
            System.out.println("The AVERAGE of the numbers entered: " + average );
            System.out.println("The SUM of your attempts: " + sum );
            System.out.println("The COUNT of attempts: " + ctr ); 
    }
}
