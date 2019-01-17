/*
Kelly Ryan
14 December 2018

Exercise 9
Write a Java program that creates an array to store the names of the following famous novels.
 Black Beauty | Treasure Island | Pride and Prejudice
Use an enhanced for loop to display the contents of the array to the console on the same
line.
Save the program as JFT8Ex9.java.
 */
public class JFT8Ex9 {

    public static void main (String[] args) {

        String[] novels = new String[] {"Black Beauty", "Treasure Island", "Pride and Prejudice"};

        for(String novel : novels) {

            System.out.print(novel+" ");
        }


    }
}
