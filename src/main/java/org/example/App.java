package org.example;
import java.util.Scanner;

/**
 *
 * UCF COP3330 Fall 2021 Assignment 8 Solution
 * Copyright 2021 Reese Spector
 * 
 */
public class App
{
    public static void main( String[] args )
    {
        // scanner
        Scanner input = new Scanner(System.in);

        // get people
        System.out.print("How many people? ");
        String numPoeple = input.nextLine();

        // get pizzas
        System.out.print("How many pizzas do you have? ");
        String numPizzas = input.nextLine();

        // get slices
        System.out.print("How many slices per pizza? ");
        String numSlices = input.nextLine();

            //convert strings
            int cntPeople = Integer.parseInt(numPoeple);
            int cntPizza = Integer.parseInt(numPizzas);
            int cntslices = Integer.parseInt(numSlices);

        //print summary
        System.out.print(numPoeple + " people with " + numPizzas + " pizzas " + "(" + (cntPeople * cntPizza) + " slices)\n");

        //print distribution
        System.out.print("Each person gets " +  ((cntPizza * cntslices) / cntPeople) + " pieces of pizza.\n");

        //print leftover
        System.out.print("There are " +  (cntPeople % cntslices) + " leftover pieces.\n");

    }
}
