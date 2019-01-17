/*
Kelly Ryan
14 January 2018

Exercise 17

Print out the numbers 30,25,20,15,10,5 using a do while loop.
Save the program as JFT8Ex17.java.

 */
public class JFT8Ex17 {

    public static void main (String[] args){

        int i = 30;

        do {

            System.out.print(i+" ");
            i -= 5;

        } while (i >= 5);

    }
}
