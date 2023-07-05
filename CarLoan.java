import java.util.Scanner;
public class CarLoan {
	public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please the car loan amount: ");
    int carLoan = input.nextInt();
    System.out.println("Please the lenghth of the loan in years: ");
    int loanLength = input.nextInt();
     System.out.println("Please enter the interest rate:  ");
    int interestRate = input.nextInt();
     System.out.println("Please enter the down payment amount: ");
    int downPayment = input.nextInt();
    if (loanLength <= 0 || interestRate <= 0){
      System.out.println("Please choose a valid car loan option!");
    } else if ( downPayment >= carLoan) {
        System.out.println("The car is available to be outright bought in cash");
    } else {
      int remainingBalance = carLoan - downPayment;
      int months = loanLength * 12;
      int monthlyBalance = remainingBalance / months;
      int interest = (monthlyBalance * interestRate) / 100;
      int monthlyPayment = monthlyBalance + interest;
      System.out.println("The monthly payment amount is: " + monthlyPayment);

    }
    input.close();
	}
}
