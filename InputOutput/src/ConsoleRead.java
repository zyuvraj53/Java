import java.io.Console;
//This only works in the command line
public class ConsoleRead {

    public static void main(String[] args) {
        
         Console c = System.console();
            
         String s = c.readLine();
                                
         System.out.println("You entered string " + s);

    }

}