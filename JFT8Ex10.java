/*
Kelly Ryan
14 December 2018

Exercise 10

Write a Java program that stores user passwords in an array. The passwords are shown below.
oxymoran
poxedfox
kingfisher
cruiseshipper

Create a variable to store the name of a user’s password. Assign it the value, cruiseshipper.
Using an enhanced for loop, search the array for the password. If the password is found, display the message, "Log-On Successful". Use the break keyword to leave the looping construct early, if so.
After searching the array, if the password is not found, display a single error message to the user. "You cannot be logged on using the specified password."
Save the program as JFT8Ex10.java.
 */

public class JFT8Ex10 {

    public static void main (String[] args) {

        String[] userPasswords = {"oxymoran", "poxedfox", "kingfisher", "cruiseshipper"};
        String inputPassword = "cruiseshipper";
        int i = 0;

        for(String userPassword : userPasswords) {

            if(inputPassword.equals(userPassword)) {

                System.out.println("Log-On Successful");
                break;

            } else if (i == (userPasswords.length-1)) {

                    System.out.println("You cannot be logged on using the specified password.");
                } else {

                i++;
                continue;
            }
        }
    }
}
