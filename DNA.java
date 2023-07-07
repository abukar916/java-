import java.util.Scanner;
// This is a pogram that determins whether there is a protein in a strand of DNAgtatgactggat1
public class DNA {
    // Method to validate if a DNA string contains only valid characters
    private static boolean isValidDNA(String dna) {
        return dna.matches("[ATGC]+");
    }
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of DNA strings to check: ");
        int numStrings = scanner.nextInt();
        scanner.nextLine(); // Consume the remaining newline character

        for (int i = 0; i < numStrings; i++) {
            System.out.print("Enter the DNA string #" + (i + 1) + ": ");
            String dna = scanner.nextLine();

            // Convert the DNA string to uppercase for case insensitivity
            dna = dna.toUpperCase();

            // Perform input validation
            if (!isValidDNA(dna)) {
                System.out.println("Invalid DNA string! Please enter a valid DNA sequence.");
                continue; // Skip the rest of the loop iteration
            }

            // Find the length of the DNA string
            System.out.println("DNA Length: " + dna.length());

            // Find the start and stop indices for the protein
            int start = dna.indexOf("ATG");
            int stop = dna.indexOf("TGA");

            // Check if the protein exists and its length is a multiple of 3
            if (start != -1 && stop != -1 && (stop - start) % 3 == 0) {
                String protein = dna.substring(start, stop + 3);
                System.out.println("Contains a protein");
                System.out.println("Protein: " + protein);
            } else {
                System.out.println("Does not contain a protein");
            }
        }

        // Close the Scanner object
        scanner.close();
    }

    
}
