public class question {
  static public int findMaxConsecutiveOnes(int[] nums) {
    int currentConsecutiveBins = 0;
    int longest = 0;
      for(int currentBinary: nums)
        if(currentBinary == 1){
          currentConsecutiveBins++;
          if(currentConsecutiveBins > longest){
            longest = currentConsecutiveBins;
          }
        }
        else{
          currentConsecutiveBins = 0;
        }
          
    return longest;
    }
  
  public static void main(String[] args){
    int[] a = {1, 1, 0, 1, 1, 1};
    System.out.println(findMaxConsecutiveOnes(a));
  }
  
}
