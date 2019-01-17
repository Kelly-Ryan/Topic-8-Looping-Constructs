/*
Kelly Ryan
14 December 2018

Exercise 11
Imagine that a fishing trip will only go ahead if there are seven positive responses.
Create an array to store the following character values (the data type of the array should be char, and the size / length of the array, 10).
Y
Y
Y
Y
Y
Y
N
Y
N
N
Determine if the fishing trip will go ahead. Make use of the break keyword in your solution.
Save the program as JFT8Ex11.java.
 */

public class JFT8Ex11 {

    public static void main (String[] args) {

        char[] responses = {'Y', 'Y', 'Y', 'Y', 'Y','Y', 'N', 'Y', 'N', 'N'};
        int yesCounter = 0;
        int noCounter = 0;

        for(char response : responses) {

             if (response == 'Y') {

                 yesCounter++;

                 if (yesCounter == 7) {

                     System.out.println("The fishing trip is going ahead!");
                     break;

                 } else {

                     continue;
                 }

             } else {

                 noCounter++;

                 if (noCounter == 4) {

                     System.out.println("The fishing trip will not go ahead.");
                     break;
                 }

                 continue;

                }
            }
        }
}
