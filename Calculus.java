import java.io.Console;
import java.lang.Math;

/*
 * Course:    TCSS142 - Introduction to Object-Oriented Programming
 * File Name:  Calculus.java
 * Assignment: 2
 * Due Date:   10/18/2024
 * Instructor: Varik Hoang 
 */

public class Calculus {

/**
 * The pi method is responsible for calculating and 
 * returning the value of pi after each term.
 *
 * @param pi receives an int in the form of n
 * @return returns the product for the square root of 12 times the value of sum
 *
 */
 
    public static double pi(int n) {
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
           double numerator = Math.pow(-1, i);
           double denominator = (2 * i + 1) * Math.pow(3, i);
           sum += numerator / denominator;
         }
         return Math.sqrt(12) * sum;
    }
/**
 * The euler method is responsible for calculating and
 * returning the euler value after each term.
 *
 * @param euler receives an in in the form of n
 * @return returns the final sum after incrementation
 *
 */
 
    public static double euler(int n) {
        double sum = 0.0;
        double denominator = 1.0;
        for (int i = 0; i < n; i++) {
            if (i > 0) {
               denominator *= i;
            }
            sum += 1.0 / denominator;
        }
        return sum;
    }       
/**
 * The main method is responsible for determining how many terms
 * each value will run for, then prints out the corresponding message.
 *
 * @param accepts a string 
 * 
 */
    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++)
           System.out.println("Pi value after " + i + " term(s) = " + pi(i));
        for (int j = 1; j <= 18; j++)
           System.out.println("Euler value after " + j + " term(s) = " + euler(j));    
    }
}