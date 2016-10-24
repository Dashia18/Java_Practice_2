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

        //Ball
        Ball ballObject = new Ball(2, 2, 1, 5, 30 );
        System.out.println(ballObject.toString());
        ballObject.reflectHorizontal();
        System.out.println();
        System.out.println(ballObject.toString());

        //Container
        Container containerObject = new Container(0,0, 2,3);
        System.out.println(containerObject.toString());
        System.out.println(containerObject.getHeight());
        System.out.println(containerObject.getWidth());






    }
}
