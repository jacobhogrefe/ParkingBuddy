import java.lang.reflect.AnnotatedArrayType;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
import javax.security.auth.callback.ChoiceCallback;

import org.w3c.dom.traversal.NodeFilter;

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

    private static void printParkingSpaces(int campusChoice, int lotChoice)
    {
        System.out.println("\nPriority | Space Number | Availiability");
        if(campusChoice == 1 && lotChoice == 1){ //North lot choice
            ParkingSpace[] northLot = new ParkingSpace[100];
            for(int i = 0; i < northLot.length; i++){
                northLot[i] = new ParkingSpace(i);
            }

            for (int i = 0; i < 100; i++)
            {
                System.out.println("------------------------------------------");
                
                if (Integer.toString(i).length() == 1)
                {
                    System.out.println(1 + "        | " + i + "            | " + northLot[i].isSpaceFull());
                }
                else if (Integer.toString(i).length() == 2)
                {
                    System.out.println(1 + "        | " + i + "           | " + northLot[i].isSpaceFull());
                }
                else if (Integer.toString(i).length() == 3)
                {
                    System.out.println(1 + "        | " + i + "          | " + northLot[i].isSpaceFull());
                }
            }
        }
        else if(campusChoice == 1 && lotChoice == 2){ //Hogan lot choice
            ParkingSpace[] hoganLot = new ParkingSpace[100];
            for(int i = 0; i < hoganLot.length; i++){
                hoganLot[i] = new ParkingSpace(i);
            }

            for (int i = 0; i < 100; i++)
            {
                System.out.println("------------------------------------------");
                
                if (Integer.toString(i).length() == 1)
                {
                    System.out.println(1 + "        | " + i + "            | " + hoganLot[i].isSpaceFull());
                }
                else if (Integer.toString(i).length() == 2)
                {
                    System.out.println(1 + "        | " + i + "           | " + hoganLot[i].isSpaceFull());
                }
                else if (Integer.toString(i).length() == 3)
                {
                    System.out.println(1 + "        | " + i + "          | " + hoganLot[i].isSpaceFull());
                }
            }
        }
        else if(campusChoice == 1 && lotChoice == 3){ //Hilltop Lot choice
            ParkingSpace[] hilltopLot = new ParkingSpace[100];
            for(int i = 0; i < hilltopLot.length; i++){
                hilltopLot[i] = new ParkingSpace(i);
            }

            for (int i = 0; i < 100; i++)
            {
                System.out.println("------------------------------------------");
                
                if (Integer.toString(i).length() == 1)
                {
                    System.out.println(1 + "        | " + i + "            | " + hilltopLot[i].isSpaceFull());
                }
                else if (Integer.toString(i).length() == 2)
                {
                    System.out.println(1 + "        | " + i + "           | " + hilltopLot[i].isSpaceFull());
                }
                else if (Integer.toString(i).length() == 3)
                {
                    System.out.println(1 + "        | " + i + "          | " + hilltopLot[i].isSpaceFull());
                }
            }
        }
        else if(campusChoice == 2 && lotChoice == 1){ //YH Parking Garage
            ParkingSpace[] yhGarage = new ParkingSpace[100];
            for(int i = 0; i < yhGarage.length; i++){
                yhGarage[i] = new ParkingSpace(i);
            }

            for (int i = 0; i < 100; i++)
            {
                System.out.println("------------------------------------------");
                
                if (Integer.toString(i).length() == 1)
                {
                    System.out.println(1 + "        | " + i + "            | " + yhGarage[i].isSpaceFull());
                }
                else if (Integer.toString(i).length() == 2)
                {
                    System.out.println(1 + "        | " + i + "           | " + yhGarage[i].isSpaceFull());
                }
                else if (Integer.toString(i).length() == 3)
                {
                    System.out.println(1 + "        | " + i + "          | " + yhGarage[i].isSpaceFull());
                }
            }
        }
        else if(campusChoice == 2 && lotChoice == 2){ //Eastview Lot
            ParkingSpace[] eastviewLot = new ParkingSpace[100];
            for(int i = 0; i < eastviewLot.length; i++){
                eastviewLot[i] = new ParkingSpace(i);
            }

            for (int i = 0; i < 100; i++)
            {
                System.out.println("------------------------------------------");
                
                if (Integer.toString(i).length() == 1)
                {
                    System.out.println(1 + "        | " + i + "            | " + eastviewLot[i].isSpaceFull());
                }
                else if (Integer.toString(i).length() == 2)
                {
                    System.out.println(1 + "        | " + i + "           | " + eastviewLot[i].isSpaceFull());
                }
                else if (Integer.toString(i).length() == 3)
                {
                    System.out.println(1 + "        | " + i + "          | " + eastviewLot[i].isSpaceFull());
                }
            }
        }
        else if(campusChoice == 2 && lotChoice == 3){
            ParkingSpace[] westviewLot = new ParkingSpace[100];
            for(int i = 0; i < westviewLot.length; i++){
                westviewLot[i] = new ParkingSpace(i);
            }

            for (int i = 0; i < 100; i++)
            {
                System.out.println("------------------------------------------");
                
                if (Integer.toString(i).length() == 1)
                {
                    System.out.println(1 + "        | " + i + "            | " + westviewLot[i].isSpaceFull());
                }
                else if (Integer.toString(i).length() == 2)
                {
                    System.out.println(1 + "        | " + i + "           | " + westviewLot[i].isSpaceFull());
                }
                else if (Integer.toString(i).length() == 3)
                {
                    System.out.println(1 + "        | " + i + "          | " + westviewLot[i].isSpaceFull());
                }
            }
        }
        else if(campusChoice == 3 && lotChoice == 1){ //NH General Lot
            ParkingSpace[] nhGeneral = new ParkingSpace[100];
            for(int i = 0; i < nhGeneral.length; i++){
                nhGeneral[i] = new ParkingSpace(i);
            }

            for (int i = 0; i < 100; i++)
            {
                System.out.println("------------------------------------------");
                
                if (Integer.toString(i).length() == 1)
                {
                    System.out.println(1 + "        | " + i + "            | " + nhGeneral[i].isSpaceFull());
                }
                else if (Integer.toString(i).length() == 2)
                {
                    System.out.println(1 + "        | " + i + "           | " + nhGeneral[i].isSpaceFull());
                }
                else if (Integer.toString(i).length() == 3)
                {
                    System.out.println(1 + "        | " + i + "          | " + nhGeneral[i].isSpaceFull());
                }
            }
        }
        else if(campusChoice == 3 && lotChoice == 2){ //General Surface Lot
            ParkingSpace[] genSurface = new ParkingSpace[100];
            for(int i = 0; i < genSurface.length; i++){
                genSurface[i] = new ParkingSpace(i);
            }

            for (int i = 0; i < 100; i++)
            {
                System.out.println("------------------------------------------");
                
                if (Integer.toString(i).length() == 1)
                {
                    System.out.println(1 + "        | " + i + "            | " + genSurface[i].isSpaceFull());
                }
                else if (Integer.toString(i).length() == 2)
                {
                    System.out.println(1 + "        | " + i + "           | " + genSurface[i].isSpaceFull());
                }
                else if (Integer.toString(i).length() == 3)
                {
                    System.out.println(1 + "        | " + i + "          | " + genSurface[i].isSpaceFull());
                }
            }
        }
        else if(campusChoice == 3 && lotChoice == 3){ //Front Lot
            ParkingSpace[] frontLot = new ParkingSpace[100];
            for(int i = 0; i < frontLot.length; i++){
                frontLot[i] = new ParkingSpace(i);
            }

            for (int i = 0; i < 100; i++)
            {
                System.out.println("------------------------------------------");
                
                if (Integer.toString(i).length() == 1)
                {
                    System.out.println(1 + "        | " + i + "            | " + frontLot[i].isSpaceFull());
                }
                else if (Integer.toString(i).length() == 2)
                {
                    System.out.println(1 + "        | " + i + "           | " + frontLot[i].isSpaceFull());
                }
                else if (Integer.toString(i).length() == 3)
                {
                    System.out.println(1 + "        | " + i + "          | " + frontLot[i].isSpaceFull());
                }
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
            printParkingSpaces(choice, answer);

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