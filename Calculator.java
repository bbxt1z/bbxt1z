import java.util.Scanner;
/**
 * This program converts binary numbers to it's appropriate decimal value
 * it also calculates the sum, min value, max value, and average.
 * 
 * @author Breanna Battle
 * @version 11/2/2024
 */

public class Calculator {
	/**
	 * Main is responsible for determining how many times
	 * the program will run based on the number entered by the user
	 * 
	 * @param args
	 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            char choice;
            
            do {
                startEnteringBinaryNumbers(scanner);
                System.out.print("Would you like to try again? (y/n): ");
                choice = scanner.next().charAt(0);
            } while (choice == 'y' || choice == 'Y');
            
            scanner.close();
            System.out.print("Thank you for using the program!");
    }
    /**
     * The startEnteringBinaryNumbers method is responsible for
     * taking in the amount of binary numbers entered by the user
     * and converting the received numbers into their decimal value
     * it also compiles the received information and returns the appropriate stats.
     * 
     * @param theNumAmount reads how many  binary numbers were entered.
     */
    public static void startEnteringBinaryNumbers(Scanner theNumAmount) {
        System.out.print("How many binary numbers would you like to enter? ");
        Scanner scanner = new Scanner(System.in);
        int count = theNumAmount.nextInt();
        
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < count; i++) {
        	System.out.print("Enter the binary number: ");
            String binaryNumber = enterBinaryNumber(theNumAmount);
            int decimalValue = convertBinaryToDecimal(binaryNumber);
            System.out.println("The Decimal Value Is: " + decimalValue);
            sum += decimalValue;
            
            if (decimalValue < min) min = decimalValue;
            if (decimalValue > max) max = decimalValue;
        }
        double average = (double) sum / count;
        System.out.println("The sum is: " + sum);
        System.out.println("The minimum value is: " + min);
        System.out.println("The maximum value is: " + max);
        System.out.println("The average is: " + average);
    }
    /**
     * The method convertBinaryToDecimal
     * Converts the received binary number into a decimal value 
     * @param binaryNum takes the entered binary number and 
     * distinguishes between 1's and 0's 
     * @return ans returns the resulting decimal value
     */
    public static int convertBinaryToDecimal(String binaryNum) {
        int power = 0;
        int ans = 0;
        int len = binaryNum.length();

        for (int i = len - 1; i >= 0; i--) {
        if (binaryNum.charAt(i) == '1') {
        ans += Math.pow(2, power);
            }
            power++;
        }
        return ans;
    }
    /**
     * The method enterBinaryNumber reads the binary numbers entered by the user
     * @param theNumEntered collects input from the user
     * @return binaryNum returns the entered number 
     */
    public static String enterBinaryNumber(Scanner theNumEntered) {
        String binaryNum = theNumEntered.next();
        
        return binaryNum;
    }
}