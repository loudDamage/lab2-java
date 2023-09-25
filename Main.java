// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {
        try {

            Scanner userin = new Scanner(System.in);
            System.out.print("Enter your number (between 1 and 10): ");
            int ans = userin.nextInt();
            userin.close();

            if(ans>=10 || ans <=0){
                throw new Exception("Number has to be between 0 and 10");
            }
            int res = 1;
            int i = 1;
            for (i = 1; i <= ans; i++) {
                res *= i;
            }
            System.out.println("The result is " + res);
        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }



    }
}