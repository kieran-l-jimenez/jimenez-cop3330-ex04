import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Kieran Jimenez
 */
/*
*           "Madlib" output
*    Enter a noun: dog
*    Enter a verb: walk
*    Enter an adjective: blue
*    Enter an adverb: quickly
*    Do you walk your blue dog quickly? That's hilarious!
 */
public class App
{
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        App myApp = new App();

        String noun = myApp.wordPrompt("noun");
        String verb = myApp.wordPrompt("verb");
        String adjective = myApp.wordPrompt("adjective");
        String adverb = myApp.wordPrompt("adverb");

        System.out.printf("Do you %s your %s %s %s? That's hilarious!\n", verb, adjective, noun, adverb);
    }

    public String wordPrompt(String wordType)
    {
        System.out.print("Enter a " + wordType + ": ");
        return in.nextLine();
    }

}