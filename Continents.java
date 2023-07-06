// This program prints out a continent and the largest city on the continent based on an integer

import java.util.Scanner;

public class Continents {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner keyboard = new Scanner(System.in);

        // Prompt the user to enter the continent number
        System.out.print("Enter the continent number (1-7): ");
        int continent = keyboard.nextInt();

        // Use a switch statement to determine the continent and print the corresponding information
        switch (continent) {
            case 1:
                System.out.println("North America: Mexico City, Mexico");
                break;
            case 2:
                System.out.println("South America: Sao Paulo, Brazil");
                break;
            case 3:
                System.out.println("Europe: Moscow, Russia");
                break;
            case 4:
                System.out.println("Africa: Lagos, Nigeria");
                break;
            case 5:
                System.out.println("Asia: Shanghai, China");
                break;
            case 6:
                System.out.println("Australia: Sydney, Australia");
                break;
            case 7:
                System.out.println("Antarctica: McMurdo Station, US");
                break;
            default:
                System.out.println("Undefined continent!");
        }

        // Close the Scanner object
        keyboard.close();
    }
}
