import java.util.ArrayList;

public class recursion{
  public static void main(String[] args) {
    //System.out.println("Square root of " + args[0] + " is: " + sqrt(Integer.parseInt(args[0]), .001));
    //System.out.println("Index " + args[0] + " of the fibbonaci sequence is: " + fib(Integer.parseInt(args[0])));
    System.out.println(makeAllSums(Integer.parseInt(args[0])).toString());
  }

  /*Recursively find the sqrt using Newton's approximation
   *tolerance is the allowed percent error the squared answer is away from n.
   *precondition: n is non-negative
  */

  public static double sqrt(double n, double tolerance){
    return sqrtHelper(n, 1, tolerance);
  }

  private static double sqrtHelper(double n, double guess, double tolerance){
    if (guess * guess + tolerance/100 < n || guess * guess - tolerance/100 > n){
      return sqrtHelper(n, (n/guess + guess) / 2, tolerance);
    }
    return guess;
  }
  /*Recursively find the n'th fibbonaci number in linear time
   *fib(0) = 0; fib(1) = 1; fib(5) = 5
   *precondition: n is non-negative
   */
  public static int fib(int n){
    return fibHelper(n, 0, 1, 0);
  }
  private static int fibHelper(int targetIndex, int first, int second, int currentIndex) {
    if (currentIndex == targetIndex){
      return first;
    }
    return fibHelper(targetIndex, second, first + second, currentIndex + 1);
  }
  /*As Per classwork*/
  public static ArrayList<Integer> makeAllSums(int n) {
    ArrayList<Integer> sum = new ArrayList<Integer>();
    makeAllSumsHelper(n, 0, sum);
    return sum;
  }
  private static void makeAllSumsHelper(int max, Integer partialSum, ArrayList<Integer> sumArray) {
    if (max == 0) {
      sumArray.add(partialSum);
    }
    if (max > 0) {
      makeAllSumsHelper(max - 1, partialSum + max, sumArray);
      makeAllSumsHelper(max - 1, partialSum, sumArray);
    }
  }
}
