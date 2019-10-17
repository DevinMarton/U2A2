/*
this is a squaring, cubing and exponenting program
 */
package u2a2;
import java.util.Scanner;
/**
 *
 * @author julzo
 */
public class U2A2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        boolean exit = false;
        
            String choiceIn = "0";
            
            while (!exit) {
            int userNum = 0;
            int power = 1;
            int exponent = 0;

            System.out.println("1. Square?");
            System.out.println("2. Cube?");
            System.out.println("3. Exponent");
            System.out.println("4. Exit");

            choiceIn = input.nextLine();


                switch (choiceIn) {
                    case "1":
                        System.out.println("What number would you like to square?");
                        

                        userNum = Integer.parseInt(input.nextLine());

                        for (int i = 1; i <= 2; i++) {
                            power = power* userNum;
                        }

                        System.out.println(userNum + " squared is " + power);
                        System.out.println("");
                        System.out.println("");
                        break;
                        
                    case "2":
                        System.out.println("What number would you like to cube?:");

                        userNum = Integer.parseInt(input.nextLine());

                        for (int i = 1; i <= 3; i++) {
                            power = power * userNum;
                        }

                        System.out.println(userNum + " cubed is " + power);
                        System.out.println("");
                        System.out.println("");
                                
                        break;
                        
                    case "3":

                        System.out.println("Enter the number you want as the base:");
                        userNum = Integer.parseInt(input.nextLine());

                        System.out.println("Enter the number you want as the exponent:");
                        exponent = Integer.parseInt(input.nextLine());

                        for (int i = 1; i <= exponent; i++) {
                            power = power * userNum;
                        }

                        System.out.println(userNum + " to the exponent " + exponent + " is " + power);
                        System.out.println("");
                        System.out.println("");
                        break;
                        
                    case "4":
                        exit = true;
                        break;
                    
                }
        }
        System.out.println("Fine, I didn't even want you here anyway!");
    }

}

    

