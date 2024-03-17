public class Multiplication implements Operations {
    //Multiplication

    @Override
    public ComplexNumber calculate(ComplexNumber complex1, ComplexNumber complex2) {
        float complexResult = (complex1.getA() * complex2.getA()) - (complex1.getB()*complex2.getB());
        float complexResultImaginary = (complex1.getA() * complex2.getB()) + (complex1.getB() * complex2.getA()) ;
        ComplexNumber newComplex;
        newComplex = new ComplexNumber(complexResult, complexResultImaginary);

        return newComplex;
    }

}
