/*
Kelly Ryan
14 December 2018

Exercise 7

Using a for loop, display the following sequence of numbers on the same line:

300 250 200 150 100 50

Save the program as JFT8Ex7.java.

 */

public class JFT8Ex7 {

    public static void main (String[] args){

        for(int i = 300; i >= 50; i = i - 50){

            System.out.print(i+" ");
        }
    }

}

