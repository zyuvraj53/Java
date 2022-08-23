public class first {

  public static String[] revBinArr(int dec){
    String[] revBinArr = new String[64];
    int i = 0;

    while(dec != 0){
      revBinArr[i] = dec%2;
      dec /= 2;
      i++;
    }

    return revBinArr;
  }

  public static void main(String[] args) {
    int A = 0b10110011;
    int B = 0b01101001;

    int check = 0;

    System.out.println(bin(8)); 
    System.out.println("A>>3 is ==> " + bin(A>>3)); 
    System.out.println("B<<2 is ==> " + bin(A<<2)); 

  }  
}
