/*
 * Course:    TCSS142 - Introduction to Object-Oriented Programming
 * File Name:  Project2.java
 * Assignment: 2
 * Due Date:   07/23/2024
 * Instructor: Mr. Schuessler 
 */
 
import java.util.Scanner;
/**
 * Based on a user input value for the number of employees to process,
 * This program will also prompt the user for each employees hours worked,
 * hourly pay rate, and name. Once entered the program will return a statement
 * based on the employee with the most hours worked.
 *
 * @author Breanna Battle
 * @version 2020 April 12
 */
 
public class Project2 {
   public static void main(String[] theArgs) {
      Scanner console = new Scanner(System.in);
      int employeeCnt = getEmployeeCnt(console);
      int employeePay = processEmployeePay(console, employeeCnt);
   }
/**
 * The method getEmployeeCnt is responsible for reading output from the keyboard
 * 
 * @param console receives a scanner to read an int from the keyboard
 * @return returns the input received from console
 */ 
   public static int getEmployeeCnt(Scanner console) {
     System.out.print("How many employees are there? ");
     int employeeCnt = console.nextInt();
     return employeeCnt;
   } 
/**
 * The method processEmployeePay is responsible for processing the input from 
 * employee information gathered from the keyboard input
 *
 * @param theConsole gathers input from the keyboard
 * @param employeeCnt indicates how many times theConsole probes for input 
 * @return returns the input from the keyboard once theCount loop has ended
 */  
   public static int processEmployeePay(Scanner theConsole, int employeeCnt) { 
     int theCount = employeeCnt;  
     String name = "";
     String topName = "";
     
     double hoursWorked = 0.0;
     double payRate = 0.0;
     double grossPay = 0.0;
     double topHours = -1.0;
     
   for(int i = 1; i <= theCount; i++) {
     System.out.print("Enter Hours Worked, Pay Rate, and Employee name Separated with a space: ");
     hoursWorked = theConsole.nextDouble();
     payRate = theConsole.nextDouble();
     name = theConsole.nextLine();
     
     grossPay = getGrossPay(hoursWorked, payRate);
     displayEmployeePay(name, payRate, hoursWorked, grossPay);
    
     if (hoursWorked > topHours) {
         topHours = hoursWorked;
         topName = name;
      }
    }
    displayTopEmployee(topName, topHours);
    return theCount;
   }
/**
 * The method getGrossPay is responsible for calculating gross pay based
 * on employee pay rate and hours worked
 *
 * @param theHours is responsible for how many hours were worked
 * @param theRate  is responsible for employee pay rate 
 * @return returns the gross pay 
 */
   public static double getGrossPay(double theHours, double theRate) {
           double pay = 0.0;
           if (theHours > 48.0) {
             pay = pay + 2 * theRate * (theHours - 48.0);
             theHours = 48.0;
         } if (theHours > 40.0) {
             pay = pay + 1.5 * theRate * (theHours - 40.0);
             theHours = 40.0;
    }
    pay = pay + theHours * theRate;
    return pay;
   }
/**
 * The method displayEmployeePay is responsible for creating a list based on the input from
 * processEmployeePay
 *
 * @param theName is responsible for employee name
 * @param theRate is responsible for employee pay rate
 * @param theHours is responsible for employee hours worked
 * @param theGrossPay is responsible for employee gross pay
 */
   public static void displayEmployeePay(String theName, double theRate, double theHours, double theGrossPay) {
            System.out.println("\t" + ("Employee Name: ") + theName);
            System.out.printf("\t" + ("Hours Worked: ") + theHours + "\n");
            System.out.printf("\t" + ("Pay rate: ") + theRate + "\n");
            System.out.println("\t" + ("Gross Pay: ") + theGrossPay + "\n");
   }
/**
 * The method displayTopEmployee is responsible for printing out a message for the employee 
 * that worked the most hours, the message varies by hours worked
 *
 * @param theTopName prints out the employee name
 * @param theTopHours determines how the message displayed based on employee hours worked
 */
   public static void displayTopEmployee(String theTopName, double theTopHours) {
      if (theTopHours > 56.0) {
         System.out.println("Wow!!!!! What a Dynamo! " + theTopName + "worked " + theTopHours + " Hours this WEEK!"); 
      }  else if (theTopHours > 48.0) {
         System.out.println(theTopName + " is Such a WorkHorse! Looks Like You Worked " + theTopHours + " Hours this WEEK!");
      }  else if (theTopHours > 40.0) {
         System.out.println("Well, Good For YOU" + theTopName + ", Who Worked " + theTopHours + " Hours this WEEK!");
      }  else if (theTopHours < 40.0) {
         System.out.print(theTopName + " Worked " + theTopHours + " Hours this WEEK!");
    } 
  } 
}