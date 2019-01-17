/*
Kelly Ryan
14 December 2018

Exercise 5
Create a for loop that counts down the USA Billboard Top 5 music artists of the 1980s!
Store the names of the groups / artists in an array.
Here are the artists and their positions:
No 5: Michael Jackson
No 4: Frankie Goes To Hollywood
No 3: Queen
No 2: Simple Minds
No 1: Rick Astley
Save the program as JFT8Ex5.java
 */
public class JFT8Ex5 {

    public static void main (String[] args) {

        int[] chartPosition = {5, 4, 3, 2, 1};
        String[] artists = {"Michael Jackson", "Frankie Goes To Hollywood", "Queen", "Simple Minds", "Ricky Astley"};

        for(int i = 0; i < 5; i++) {

            System.out.println("No. "+chartPosition[i]+"\t"+artists[i]);

        }
    }
}
