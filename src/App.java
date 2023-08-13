public class App {
  
  public static void main(String[] args) {
  // Array - an array is a collection of ordered objects of the same data type.
  // Each object in the array can be access by the index
  // from zero up to the array length minus 1
	// You cannot grow or shrink the size of an array.
	// You can only modify

    double[] lotteryNums = {45, 92, 38, 33, 21}; //new double[5];
    System.out.println(lotteryNums[2]);
    lotteryNums[2] = 40;
    System.out.println(lotteryNums[2]);
  }
}