package Spring2021;
import java.util.Scanner;
public class Ecommerce {

    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        //user inputs price of product
        System.out.print("Enter Price ");
        double productPrice = scan.nextDouble();

        //how much is shipping
        double standard = 0;
        double express = 0;

        //ask the user what shipping they want
        System.out.println("What shipping do you prefer? (s for standard, e for express)");
        char choice;
        String input = scan.next();
        choice = input.charAt(0);
        if(choice == 's' || choice == 'S'){
            standard = 9.99;
        } else if(choice == 'e' || choice == 'E'){
            express = 16.99;
        }


        //ask for state of shipping
        System.out.print("Shipping State: ");
        String state = scan.next();

        //calculate tax from appropriate state
        double tax = 0.0;
        if( state.equalsIgnoreCase("NY")){
            tax = 8.875;
        } else if (state.equalsIgnoreCase("NJ")){
            tax = 7.3;
        } else if(state.equalsIgnoreCase("FL")){
            tax = 6.0;
        } else {
            System.out.println("We don't ship to "+ state);
        }
        //add up the entire total of tax including shipping
        double totalTx = productPrice * (tax/100);
        double totalship = express + standard;

        //free shipping for over $100 purchases
        if(productPrice > 100){
            totalship = 0;
        }

        double total = productPrice + totalTx + totalship;
        System.out.println("Your total: "+ total );

    }


}
