/*
Kelly Ryan
14 January 2019

Exercise 19

Create a new version of Exercise 11 (For Loop Exercises Sheet). Remove the for loop, replace it with a while loop.
Save the program as JFT8Ex19.java.
 */

public class JFT8Ex19 {

    public static void main(String[] args) {

        char[] responses = {'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'N', 'N', 'N'};
        int yesCounter = 0;
        int noCounter = 0;
        int i = 0;

        while (i <= (responses.length - 1)) {

            if (responses[i] == 'Y') {

                yesCounter++;

                if (yesCounter == 7) {

                    System.out.println("The fishing trip is going ahead!");
                    break;

                }
            } else {

                noCounter++;

                if (noCounter == 4) {

                    System.out.println("The fishing trip will not go ahead.");
                    break;
                }

            }

            i++;

        }

    }
}