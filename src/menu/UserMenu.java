package menu;
import complex.*;
import java.util.Scanner;

public class UserMenu {
    Scanner input = new Scanner(System.in);

    int choice = 0;
    //Main menu
    public void userMenu() {
        System.out.println("\n===COMPLEX CALCULATOR===");
        while (choice != 5) {
            System.out.println("\nWhat would you like to do?\n");
            System.out.println("1: Add");
            System.out.println("2: Subtract");
            System.out.println("3: Multiply");
            System.out.println("4: Divide");
            System.out.println("5: Quit\n");
            choice = input.nextInt();
            //Addition
            if (choice == 1) {
                AddData resultAdd = new AddData();
                resultAdd.addData();
            }
//            Subtraction
            if (choice == 2) {
                SubData resultSub = new SubData();
                resultSub.subData();
            }
            //Multiplication
            if (choice == 3) {
                MultData resultMult = new MultData();
                resultMult.multData();
            }
            //Division
            if (choice == 4) {
                DivData resultDiv = new DivData();
                resultDiv.divData();
            }
        }
        System.out.println("\nHave a nice day!\n");
    }

}