/**
 * Created by dbobkova on 24.10.2016.
 */
public class Runner {
    public static void main(String[] args) {


        //Class MyComplex
        MyComplex complexValue = new MyComplex(1.0, 1.0);
        System.out.println(complexValue.toString());
        System.out.println();

        //MyPolynomial
        MyPolynomial polynomialValue = new MyPolynomial(-1, -2);
        MyPolynomial polynomialValue2 = new MyPolynomial(1, 2);
        System.out.println(polynomialValue.multiple(polynomialValue2));
        System.out.println();

        //Ball
        Ball ball = new Ball(2, 2, 2, 5, 30 );
        System.out.println(ball.toString());

        //Container
        Container container = new Container(0, 0, 5, 5);
        System.out.println(container.toString());
        System.out.println("ball is in container: "+container.collides(ball));
        System.out.println();

        //move ball
        ball.move();
        System.out.println(ball.toString());
        System.out.println(container.toString());
        System.out.println("ball is in container: "+container.collides(ball));






    }
}
