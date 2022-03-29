package com.company;
import java.util.Random;
import java.util.Scanner;
public class Main
{

    public static void main(String[] args)
    {
        String trash = "";
        int UserGuess = 0;
        Random rand = new Random();
        int RandNum = rand.nextInt(10);
        RandNum += 1;
        Scanner in = new Scanner(System.in);
        System.out.print("Please guess a number between 1 and 10. ");
        if (in.hasNextInt())
        {
            UserGuess = in.nextInt();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You must enter a valid guess. "+trash);
            return;
        }
        System.out.print("The random number is "+RandNum+".");
        if (UserGuess > RandNum)
        {
            System.out.print(" That guess is too high.");
        }
        else if (UserGuess < RandNum)
        {
            System.out.print(" That guess is too low.");
        }
        else
        {
            System.out.print(" That guess is correct.");
        }
    }
}
