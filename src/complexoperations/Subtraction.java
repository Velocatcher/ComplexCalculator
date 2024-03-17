package complexoperations;
import complex.ComplexNumber;
public class Subtraction implements Operations {
    //Subtraction

    @Override
    public ComplexNumber calculate(ComplexNumber complex1, ComplexNumber complex2) {

        System.out.println(complex2.getA());

        float complexResult = complex1.getA() - complex2.getA();

        float complexResultImaginary = complex1.getB() - complex2.getB();

            ComplexNumber newComplex;
            newComplex = new ComplexNumber(complexResult, complexResultImaginary);

            return newComplex;
        }


    }
