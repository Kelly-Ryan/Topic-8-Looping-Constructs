/*
Kelly Ryan
14 January 2019

Exercise 18

Write a Java program that outputs the text, "In the loop", while x has a value of less than 8. Assign x an initial value of 0. Solve the problem using a do while loop.
Save the program as JFT8Ex18.java.
 */

public class JFT8Ex18 {

    public static void main (String[] args){

        int x = 0;

        do {

            System.out.println("In the loop");
            x++;

        } while (x < 8);
    }
}
