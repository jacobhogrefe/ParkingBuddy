import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class ParkingBuddy 
{
    private static Scanner userInput = new Scanner(System.in);
    private static int answer = 0;
    private static boolean isDone = false;
    private static ArrayList<ParkingSpace> genericLotList = new ArrayList<ParkingSpace>();
    private static Random random = new Random();

    private static String[] priorityList = { "H", "1", "2", "3" };
    private static int[] capacityList = { 20, 20, 30, 40 };
    private static boolean[] statusList = { true, false };

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

    private static void generateSpaces()
    {
        genericLotList.clear();
        
        for (int i = 0; i < priorityList.length; i++)
        {
            for (int j = 0; j < capacityList[i]; j++)
            {
                int randNum = random.nextInt(0, 2);
                ParkingSpace newSpace = new ParkingSpace(priorityList[i], statusList[randNum]);
                genericLotList.add(newSpace);
            }
        }
    }

    private static void refreshSpaces()
    {
        for (ParkingSpace space : genericLotList)
        {
            int randNum = random.nextInt(0, 2);
            space.setSpaceFull(statusList[randNum]);
        }
    }

    private static void printParkingSpaces()
    {
        System.out.println("\nPriority | Space Number | Availiability");

        for (int i = 0; i < genericLotList.size(); i++)
        {
            System.out.println("------------------------------------------");
            
            if (Integer.toString(i + 1).length() == 1)
            {
                System.out.println(genericLotList.get(i).getPriority() + "        | " + (genericLotList.indexOf(genericLotList.get(i)) + 1) + "            | " + genericLotList.get(i).isSpaceFull());
            }
            else if (Integer.toString(i + 1).length() == 2)
            {
                System.out.println(genericLotList.get(i).getPriority() + "        | " + (genericLotList.indexOf(genericLotList.get(i)) + 1) + "           | " + genericLotList.get(i).isSpaceFull());
            }
            else if (Integer.toString(i + 1).length() == 3)
            {
                System.out.println(genericLotList.get(i).getPriority() + "        | " + (genericLotList.indexOf(genericLotList.get(i)) + 1) + "          | " + genericLotList.get(i).isSpaceFull());
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
            if (answer == 4)
            {
                answer = 3;
            }

            viewParkingLot(answer);
        }    
    }

    private static void viewParkingLot(int choice)
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
            refreshSpaces();
            viewParkingSpaces(choice);
        }
    }

    private static void viewParkingSpaces(int choice)
    {
        printParkingSpaces();

        System.out.println("\nDo you want to view another lot?");
        System.out.println("1. Yes");
        System.out.println("2. Refresh Availability");
        System.out.println("3. Return to Main Menu");
        System.out.println("0. Exit Application");

        System.out.print("\nPlease choose a number: ");
        answer = validateAnswer(answer);

        if (answer == 0)
        {
            isDone = true;
        }
        else if (answer == 1)
        {
            viewParkingLot(choice);
        }
        else if (answer == 2)
        {
            refreshSpaces();
            viewParkingSpaces(choice);
        }
        else if (answer == 3 || answer == 4)
        {
            mainMenu();
        }
    }
    
    public static void main(String[] args) 
    {
        generateSpaces();
        mainMenu();
    }
}