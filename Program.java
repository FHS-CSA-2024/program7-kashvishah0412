//import stuff here

//Your code here
import java.util.Scanner;

public class SchruteBuckConverter {

    private static final int KLEVINS_PER_SCHRUTE_BUCK = 20;
    private static final int STANLEY_NICKELS_PER_KLEVIN = 12;
    private static final int STANLEY_NICKELS_PER_SCHRUTE_BUCK = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        System.out.print("Enter schrute-bucks: ");
        int schruteBucks = scanner.nextInt();

        System.out.print("Enter klevins: ");
        int klevins = scanner.nextInt();

        System.out.print("Enter stanley-nickels: ");
        int stanleyNickels = scanner.nextInt();

        double decimalSchruteBucks = convertToDecimalSchruteBucks(schruteBucks, klevins, stanleyNickels);

        System.out.printf("Decimal schrute-bucks = $" + decimalSchruteBucks);
        
    }

    private static double convertToDecimalSchruteBucks(int schruteBucks, int klevins, int stanleyNickels) {
        int totalStanleyNickels = (schruteBucks * STANLEY_NICKELS_PER_SCHRUTE_BUCK) +
                                   (klevins * STANLEY_NICKELS_PER_KLEVIN) +
                                   stanleyNickels;

        return totalStanleyNickels / (double) STANLEY_NICKELS_PER_SCHRUTE_BUCK;
    }
}
//Paste console output below:
/*

Enter schrute-bucks: 7
Enter klevins: 17
Enter stanley-nickels: 9
Decimal schrute-bucks = $7.89
*/
