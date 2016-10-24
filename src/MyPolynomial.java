import java.util.Arrays;

/**
 * Created by dbobkova on 24.10.2016.
 */
public class MyPolynomial {
    public MyPolynomial(double... coeffs){
        this.coeffs = coeffs;

    }
    public int getDegree(){
        int degreeValue = coeffs.length-1;
        return  degreeValue;

    }

    @Override
    public String toString() {
        String resultString = "" + Math.abs(coeffs[0]);

        for (int i = 1; i < coeffs.length;i++)
        {
            if(coeffs[i-1]>0){
                resultString = Math.abs(coeffs[i]) +" * x^" + i + " + " +resultString;
            }
            else
            {
                resultString = Math.abs(coeffs[i]) +" * x^" + i + " - " +resultString;
            }

        }
        resultString = "MyPolynomial{" + resultString + "}";
        return  resultString;
    }
    public double evaluate(double x){
        double evaluatingResult = 0;
        for (int i = 0; i <this.coeffs.length; i++)
        {
            evaluatingResult += this.coeffs[i] * x;
        }
        return evaluatingResult;
    }

    public MyPolynomial add(MyPolynomial right){
        int maxLenght = Math.max(coeffs.length, right.coeffs.length);
        int minLenght = Math.min(coeffs.length, right.coeffs.length);

        double[] newCoeff = new double[maxLenght];

        for (int i = 0; i < minLenght; i++)
        {
            newCoeff[i] = this.coeffs[i] + right.coeffs[i];

        }
        //If coeffs.length != right.coeffs.length
            if(coeffs.length > right.coeffs.length) {
                for (int i = minLenght; i < maxLenght; i++)
                {
                    newCoeff[i] = this.coeffs[i];
                }
            }
            else
            {
                for (int i = minLenght; i < maxLenght; i++)
                {
                    newCoeff[i] = right.coeffs[i];
                }
            }
        MyPolynomial newPolynom = new MyPolynomial(newCoeff);
        return newPolynom;
    }


    public MyPolynomial multiple(MyPolynomial right){
        double[] newCoeff = new double[this.coeffs.length*right.coeffs.length -1 ];
        for (int i = 0; i < this.coeffs.length; i++)
        {
            for (int j = 0; j < right.coeffs.length; j++)
            {
                newCoeff[j+i] = newCoeff[j+i] + this.coeffs[i] * right.coeffs[j];
            }
        }
        MyPolynomial newPolynom = new MyPolynomial(newCoeff);
        return newPolynom;
    }

    private  double[] coeffs;
}
