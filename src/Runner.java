/**
 * Created by dbobkova on 24.10.2016.
 */
public class Runner {
    public static void main(String[] args) {


        //Class MyComplex
        MyComplex complexValue = new MyComplex(1.0, 1.0);
        System.out.println(complexValue.toString());

        //MyPolynomial
        MyPolynomial polynomialValue = new MyPolynomial(-1, -2);
        MyPolynomial polynomialValue2 = new MyPolynomial(1, 2);
        System.out.println(polynomialValue.multiple(polynomialValue2));







    }
}
