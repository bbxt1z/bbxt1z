import java.util.Scanner;
public class Gangsta {
   public static void main(String[] theArgs) {;
      Scanner in= new Scanner(System.in);
      String gName = getGangstaName(in);
      System.out.println("Your gangsta name is " + gName);
   }
   public static String getGangstaName(Scanner theIn) {
   String result = "";
   System.out.print("Type your name, playa: ");
   String name = theIn.nextLine();
   int space = name.indexOf(" ");
   result = name.substring(0,1).toUpperCase() + ". Diddy" + 

            name.substring(0,1).toUpperCase() + 
            name.substring(1, space) + "-izzle";
   return result;
  }
}      