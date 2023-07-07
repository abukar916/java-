import java.util.ArrayList;
import java.util.Scanner;

class PrimeIdentifier {

  // Add your methods here:
  public boolean isPrime(int number){
    if (number == 2){
      return true;
    } else if (number < 2){
      return false;
    }
    for (int i = 2; i < number; i++){
      if (number % i == 0){
        return false;
      }
    }
    return true;
  }
  
  public ArrayList<Integer> onlyPrimes(int[] numbers){
    ArrayList<Integer> primes = new ArrayList<>();
    for (int number : numbers){
      if (isPrime(number)){
        primes.add(number);
      }
    }
    return primes;
  }
  
  public static void main(String[] args) {

    PrimeIdentifier pd = new PrimeIdentifier();
    Scanner scanner = new Scanner(System.in);

    // Prompt the user for input choice
    System.out.println("Enter '1' to check a single number or '2' to check a series of numbers:");
    int choice = scanner.nextInt();
    
    if (choice == 1) {
      // Prompt the user for a single number
      System.out.println("Enter a number:");
      int number = scanner.nextInt();

      // Check if the number is prime
      boolean isPrime = pd.isPrime(number);

      // Print the result
      if (isPrime) {
        System.out.println(number + " is a prime number.");
      } else {
        System.out.println(number + " is not a prime number.");
      }
    } else if (choice == 2) {
      // Prompt the user for a series of numbers
      System.out.println("Enter a series of numbers (separated by spaces):");
      scanner.nextLine(); // Consume the newline character
      String input = scanner.nextLine();

      // Split the input into an array of numbers
      String[] numberStrings = input.split(" ");
      int[] numbers = new int[numberStrings.length];
      for (int i = 0; i < numberStrings.length; i++) {
        numbers[i] = Integer.parseInt(numberStrings[i]);
      }

      // Call the onlyPrimes method to get the prime numbers
      ArrayList<Integer> primes = pd.onlyPrimes(numbers);

      // Print the prime numbers
      System.out.println("Prime numbers: " + primes);
    } else {
      System.out.println("Invalid choice. Please try again.");
    }
  }  
}
