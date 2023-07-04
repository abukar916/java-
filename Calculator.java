/* This program creates a simple arithmetic calculator that can add, subtract, multiply, divide and find remainders using the modulo operator.  */
public class Calculator{
  public Calculator (){  
  }
  public int add(int m,int n){
    int sum = m + n; 
    return sum;
  }
  public int subtract(int m, int n){
    int sub = m - n;
    return sub;
  }
  public int multiply(int m, int n){
    int product = m * n;
    return product;
  }
  public int divide(int a, int b){
    int div = a / b;
    return div;
  } 
  public int modulo (int a, int b){
    int remainder = a % b;
    return remainder;
  }
  public static void main(String[] args){
    Calculator myCalculator = new Calculator();
    System.out.println(myCalculator.add(5,7));
    System.out.println(myCalculator.subtract(45,11)); 
    System.out.println(myCalculator.divide(36,4));
    System.out.println(myCalculator.multiply(8,11));
    System.out.println(myCalculator.modulo(75,12));
  }
}
