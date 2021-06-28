/*
This is a simple program that asks for input from the user
This program asks the name and respond to the name that is given
 */

package javastarterpack;

// importing the reader, this accepts the input
// You import them as you go, you don't have to type them in advance
import java.util.Scanner;


public class StarterInput 
{
    public static void main(String[] args)
    {
        // kb stands for keyboard, meaning what is being type
        // you dont have to put kb, but its sort of a default
        // this is where scanner is used
        Scanner kb = new Scanner(System.in);
        
        // declaring the input in advance (a name to call it later)
        String name;
        
        // Asking the user the question
        System.out.print("Hello! What is your name?: ");
        
        // indicates that what the user respond is "name", the input we declare earlier
        name = kb.nextLine();
        
        // replying based on the respond that was given by the user 
        System.out.println("Hello " +name+ "!");
        
    }
}
