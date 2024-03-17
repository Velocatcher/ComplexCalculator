package complexoperations;
import complex.ComplexNumber;
public class Division implements Operations {
    //Division

    @Override
    public ComplexNumber calculate(ComplexNumber complex1, ComplexNumber complex2) {
        if (Math.pow(complex2.getA(), 2) + Math.pow(complex2.getB(), 2) != 0)
        {
            float complexResult = (float) (((complex1.getA() * complex2.getA())
                    + (complex1.getB() * complex2.getB()))
                    / (Math.pow(complex2.getA(), 2) + Math.pow(complex2.getB(), 2)));
            float complexResultImaginary = (float) (((complex1.getB() * complex2.getA())
                    - (complex1.getA() * complex2.getB()))
                    / (Math.pow(complex2.getA(), 2) + Math.pow(complex2.getB(), 2)));
            ComplexNumber newComplex;
            newComplex = new ComplexNumber(complexResult, complexResultImaginary);
            return newComplex;
        } else throw new RuntimeException("Unsupported math operation");

    }

}
