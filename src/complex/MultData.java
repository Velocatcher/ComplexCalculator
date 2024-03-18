package complex;
import complexoperations.*;
import java.util.Scanner;
public class MultData {
    Scanner input = new Scanner(System.in);
    ComplexNumber complex1;
    ComplexNumber complex2;
    ComplexNumber complex3;

    float a;
    float b;

    public void multData() {
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
}
