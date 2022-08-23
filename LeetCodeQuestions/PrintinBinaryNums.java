package LeetCodeQuestions;

public class PrintinBinaryNums {
  public static void main(String[] args){
    for(int i = 0; i <= 1000; i++){
      System.out.println(i + " is " + Integer.toBinaryString(i));
    }
  }
}
