import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
import javax.security.auth.callback.ChoiceCallback;

public class ParkingBuddy 
{
    private static Scanner userInput = new Scanner(System.in);
    private static int answer = 0;
    private static boolean isDone = false;
    
    private static String validateInt()
    {
        String input;
        
        while (true)
        {
            input = userInput.nextLine();
        
            try 
            {
                Integer.parseInt(input);
                break;
            } 
            catch (Exception e)
            {
                System.out.print("\nInvalid input. Please enter a whole number: ");
                continue;
            }
        }

        return input;
    }

    private static void printParkingSpace()
    {
        System.out.println("Priority   |   Space Number   | Availiability");
        
        for (int i = 0; i < 10; i++)
        {
            
            System.out.println("---------------------------------------------------");

        }
    }
    
    private static void mountCarmel()
    {
        System.out.println("\nWhich lot would you like view?");
        System.out.println("1. North Lot");
        System.out.println("2. Hogan Lot");
        System.out.println("3. Hilltop Lot");

        System.out.print("\nPlease choose a number: ");
        answer = Integer.parseInt(validateInt());
    }
    
    private static void yorkHill()
    {

    }

    private static void northHaven()
    {

    }

    public static void main(String[] args) 
    {
        System.out.println("\nWelcome to Parking Buddy");
        
        while (!isDone)
        {
            System.out.println("\nWhich campus would you like view?");
            System.out.println("1. Mount Carmel");
            System.out.println("2. York Hill");
            System.out.println("3. North Haven");

            System.out.print("\nPlease choose a number: ");
            answer = Integer.parseInt(validateInt());

            if (answer == 1)
            {
                mountCarmel();
            }
            else if (answer == 2)
            {
                yorkHill();
            }
            else if (answer == 3)
            {
                northHaven();
            }
            else 
            {
                System.out.println("\nPlease choose a valid campus by number.");
            }
        }




        System.out.println("1. North Lot");
        System.out.println("2. Hogan Lot");
        System.out.println("1. Hilltop Lot");
        System.out.println("3. York Hill Parking Garage");
        System.out.println("4. Eastview Lot");
        System.out.println("5. Westview Lot");
        System.out.println("North Haven PArking Garage");
        System.out.println("General Surface Lot");
        System.out.println("Front Lot");
    }
}