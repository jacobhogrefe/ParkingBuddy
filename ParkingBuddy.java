import java.lang.reflect.AnnotatedArrayType;
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

    private static int validateAnswer(int choice)
    {
        while (true)
        {
            choice = Integer.parseInt(validateInt());

            if (choice >= 0 && choice <= 4)
            {
                break;
            }
            else
            {
                System.out.print("\nPlease choose a valid choice: ");
            }
        }

        return choice;
    }

    private static void printParkingSpaces()
    {
        System.out.println("\nPriority | Space Number | Availiability");

        for (int i = 0; i < 100; i++)
        {
            System.out.println("------------------------------------------");
            
            if (Integer.toString(i).length() == 1)
            {
                System.out.println(1 + "        | " + i + "            | Open");
            }
            else if (Integer.toString(i).length() == 2)
            {
                System.out.println(1 + "        | " + i + "           | Open");
            }
            else if (Integer.toString(i).length() == 3)
            {
                System.out.println(1 + "        | " + i + "          | Open");
            }
        }
    }

    private static void mainMenu()
    {
        System.out.println("\nWhich campus would you like view?");
        System.out.println("1. Mount Carmel");
        System.out.println("2. York Hill");
        System.out.println("3. North Haven");
        System.out.println("0. Exit Application");

        System.out.print("\nPlease choose a number: ");
        
        answer = validateAnswer(answer);

        if (answer == 0)
        {
            isDone = true;
        }
        else
        {
            viewParkingSpaces(answer);
        }    
    }

    private static void viewParkingSpaces(int choice)
    {
        System.out.println("\nWhich lot would you like view?");

        if (choice == 1)
        {
            System.out.println("1. North Lot");
            System.out.println("2. Hogan Lot");
            System.out.println("3. Hilltop Lot");
        }
        else if (choice == 2)
        {
            System.out.println("1. York Hill Parking Garage");
            System.out.println("2. Eastview Lot");
            System.out.println("3. Westview Lot");
        }
        else if (choice == 3)
        {
            System.out.println("1. North Haven Parking Garage");
            System.out.println("2. General Surface Lot");
            System.out.println("3. Front Lot");
        }

        System.out.println("4. Go Back");
        System.out.println("0. Exit Application");

        System.out.print("\nPlease choose a number: ");
        answer = validateAnswer(answer);

        if (answer == 0)
        {
            isDone = true;
        }
        else if (answer == 4)
        {
            mainMenu();
        }
        else
        {
            printParkingSpaces();

            System.out.println("\nDo you want to view another lot?");
            System.out.println("1. Yes");
            System.out.println("2. Return to main menu");
            System.out.println("0. Exit Application");

            System.out.print("\nPlease choose a number: ");
            answer = validateAnswer(answer);

            if (answer == 0)
            {
                isDone = true;
            }
            else if (answer == 1)
            {
                viewParkingSpaces(choice);
            }
            else if (answer == 2)
            {
                mainMenu();
            }
        }
    }
    
    public static void main(String[] args) 
    {
        mainMenu();
    }
}