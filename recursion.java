import java.util.ArrayList;

public class recursion{
  public static void main(String[] args) {
    System.out.println(sqrt(Integer.parseInt(args[0]), .001));
  }

  /*You may write additional private methods */
  /*Recursively find the sqrt using Newton's approximation
   *tolerance is the allowed percent error the squared answer is away from n.
   *precondition: n is non-negative
  */

  public static double sqrt(double n, double tolerance){
    return sqrtHelper(n, 1, tolerance);
  }

  public static double sqrtHelper(double n, double guess, double tolerance){
    if (guess * guess + tolerance/100 < n || guess * guess - tolerance/100 > n){
      return sqrtHelper(n, (n/guess + guess) / 2, tolerance);
    }
    return guess;
  }
  /*Recursively find the n'th fibbonaci number in linear time
   *fib(0) = 1; fib(1) = 1; fib(5) = 5
   *precondition: n is non-negative
   */
  public static int fib(int n){
    return 0;
  }
  /*As Per classwork*/
  public static ArrayList<Integer> makeAllSums(){
    return null;
  }
}
