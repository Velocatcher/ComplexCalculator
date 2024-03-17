public class ComplexNumber{
    private float a;
    private float b;

//    ComplexNumber newComplex;
    public ComplexNumber(float a, float b){
        this.a = a;
        this.b = b;
    }
    public float getA(){
        return a;
    }
    public float getB(){
        return b;
    }

    public String toString(){
        if (a == 0 & b==0) return "0";
        if (a == 0){
            return "("+ b + "i)";
        }
        if (b == 0){
            return "("+ a + ")";
        }
        if (b > 0) {
            return "(" + a + "+" + b + "i)";
        } else return "(" + a + " " + b + "i)";
    }
}
