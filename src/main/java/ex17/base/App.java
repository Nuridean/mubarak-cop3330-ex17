/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 NURIDEAN MUBARAK
 */

package ex17.base;

import java.util.Scanner;
/*
Exercise 17 - Blood Alcohol Calculator

Sometimes you have to perform a more complex calculation based on some provided inputs and then use that result to make a determination.

Create a program that prompts for your weight, gender, total alcohol consumed (in ounces), and the amount of time since your last drink. Calculate your blood alcohol content (BAC) using this formula

BAC = (A × 5.14 / W × r) − .015 × H

where

    A is total alcohol consumed, in ounces (oz).
    W is body weight in pounds.
    r is the alcohol distribution ratio:
        0.73 for men
        0.66 for women
    H is number of hours since the last drink.

Display whether or not it’s legal to drive by comparing the blood alcohol content to 0.08.
Example Output

Enter a 1 is you are male or a 2 if you are female: 1
How many ounces of alcohol did you have? 3
What is your weight, in pounds? 175
How many hours has it been since your last drink? 1

Your BAC is 0.049323
It is legal for you to drive.

Enter a 1 is you are male or a 2 if you are female: 1
How many ounces of alcohol did you have? 5
What is your weight, in pounds? 175
How many hours has it been since your last drink? 1

Your BAC is 0.092206
It is not legal for you to drive.

Constraint
 Prevent the user from entering non-numeric values.
*/
public class App {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double inputOne; //GENDER
        double inputTwo; // OUNCES
        double inputThree; //WEIGHT
        double inputFour; //HOURS
        double BAC;


        //first prompt
        while(true){
            try {
                System.out.print("Enter a 1 is you are male or a 2 if you are female: ");
                inputOne = Double.parseDouble(in.next());
                break;
            } catch(NumberFormatException e) {
                System.out.print("Please enter a valid input.\n");
            }
        }

        while(true){
            try {
                System.out.print("How many ounces of alcohol did you have?: ");
                inputTwo = Double.parseDouble(in.next());
                break;
            } catch(NumberFormatException e) {
                System.out.print("Please enter a valid input.\n");
            }
        }

        while(true){
            try {
                System.out.print("What is your weight, in pounds?: ");
                inputThree = Double.parseDouble(in.next());
                break;
            } catch(NumberFormatException e) {
                System.out.print("Please enter a valid input.\n");
            }
        }

        while(true){
            try {
                System.out.print("How many hours has it been since your last drink?: ");
                inputFour = Double.parseDouble(in.next());
                break;
            } catch(NumberFormatException e) {
                System.out.print("Please enter a valid input.\n");
            }
        }
        double dist = 0;
        if(inputOne == 1) {
            dist = 0.73;
        }
        else{
            dist =0.66;
        }
        BAC = (inputTwo * 5.14/inputThree * dist) - 0.015 * inputFour;
        //System.out.print(dist);


        if(BAC >= 0.08){
            System.out.print("Your BAC is " + BAC + " \nIt is not legal for you to drive.");
        }
        if(BAC < 0.08){
            System.out.print("Your BAC is" + BAC +" \nIt is legal for you to drive.");
        }


    }
}
