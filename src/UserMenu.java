import java.util.Scanner;

public class UserMenu {
    Scanner input = new Scanner(System.in);
    ComplexNumber complex1;
    ComplexNumber complex2;
    ComplexNumber complex3;

    float a;
    float b;
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

                System.out.println("(a + ai) + (b + bi)\n");
                System.out.println("Input a:");
                a = input.nextFloat();
                System.out.println("Input a.imaginary (ai):");
                b = input.nextFloat();
                complex1 = new ComplexNumber(a, b);
                System.out.println("Input b:");
                a = input.nextFloat();
                System.out.println("Input b.imaginary (bi):");
                b = input.nextFloat();
                complex2 = new ComplexNumber(a, b);
                Addition add = new Addition();
                complex3 = add.calculate(complex1,complex2);
                System.out.println("The result is: " + complex1.toString()+ " + " + complex2.toString() +" = " + complex3.toString());
            }
//            Subtraction
            if (choice == 2) {

                System.out.println("(a + ai) - (b + bi)\n");
                System.out.println("Input a:");
                a = input.nextFloat();
                System.out.println("Input a.imaginary (ai):");
                b = input.nextFloat();
                complex1 = new ComplexNumber(a, b);
                System.out.println("Input b:");
                a = input.nextFloat();
                System.out.println("Input b.imaginary (bi):");
                b = input.nextFloat();
                complex2 = new ComplexNumber(a, b);
                Subtraction subtraction = new Subtraction();
                complex3 = subtraction.calculate(complex1,complex2);
                System.out.println("The result is: " + complex1.toString()+ " - " + complex2.toString() +" = " + complex3.toString());
            }
            //Multiplication
            if (choice == 3) {
                System.out.println("(a + ai) * (b + bi)\n");
                System.out.println("Input a:");
                a = input.nextFloat();
                System.out.println("Input a.imaginary (ai):");
                b = input.nextFloat();
                complex1 = new ComplexNumber(a, b);
                System.out.println("Input b:");
                a = input.nextFloat();
                System.out.println("Input b.imaginary (bi):");
                b = input.nextFloat();
                complex2 = new ComplexNumber(a, b);
                Multiplication multiplication = new Multiplication();
                complex3 = multiplication.calculate(complex1,complex2);
                System.out.println("The result is: " + complex1.toString()+ " * " + complex2.toString() +" = " + complex3.toString());

            }
            //Division
            if (choice == 4) {
                System.out.println("(a + ai) / (b + bi)\n");
                System.out.println("Input a:");
                a = input.nextFloat();
                System.out.println("Input a.imaginary (ai):");
                b = input.nextFloat();
                complex1 = new ComplexNumber(a, b);
                System.out.println("Input b:");
                a = input.nextFloat();
                System.out.println("Input b.imaginary (bi):");
                b = input.nextFloat();
                complex2 = new ComplexNumber(a, b);
                Division division = new Division();
                complex3 = division.calculate(complex1,complex2);
                System.out.println("The result is: " + complex1.toString()+ " / " + complex2.toString() +" = " + complex3.toString());

            }
        }
        System.out.println("\nHave a nice day!\n");
    }

}
