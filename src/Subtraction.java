public class Subtraction implements Operations {
    //Subtraction

    @Override
    public ComplexNumber calculate(ComplexNumber complex1, ComplexNumber complex2) {
        float complex2NewA;
        float complex2NewB;
        System.out.println(complex2.getA());

        float complexResult = complex1.getA() - complex2.getA();

        float complexResultImaginary = complex1.getB() - complex2.getB();

            ComplexNumber newComplex;
            newComplex = new ComplexNumber(complexResult, complexResultImaginary);

            return newComplex;
        }


    }
