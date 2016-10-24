/**
 * Created by dbobkova on 24.10.2016.
 */
public class MyComplex {
    public  MyComplex(){
        real= 0.0;
        imag = 0.0;
    }
    public MyComplex(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }
    public void setValue(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        String resultString;
        if (imag >0) {
        resultString =  "MyComplex{" +
                "(real + imag), e.g., (" + real +
                " + " +
                + imag +
                "i)}";
        }
        else {
        resultString =  "MyComplex{" +
                "(real + imag), e.g., (" + real +
                " - " +
                + imag * (-1) +
                "i)}";
        }
        return resultString;


    }

    public boolean isReal(){
        boolean isRealVal = false;
        if (imag==0.0){
            isRealVal = true;
        }
        return  isRealVal;
    }
    public boolean isImaginary(){
        boolean isImgVal = false;
        if (real==0.0){
            isImgVal = true;
        }
        return  isImgVal;
    }


    public boolean equals(MyComplex secondComplex) {
        boolean isEqual = false;
        if (this.real == secondComplex.getReal() && this.imag == secondComplex.getImag())
        {
            isEqual = true;
        }
        return isEqual;
    }

    public boolean equals(double real, double imag) {
        boolean isEqual = false;
        if (this.real == real && this.imag == imag)
        {
            isEqual = true;
        }
        return isEqual;
    }

    public double magnitude(){
        double magnitudeVal = Math.sqrt(Math.pow(real,2) + Math.pow(imag,2));
        return magnitudeVal;
    }
    public double argument(){
        double argumentValue = Math.atan(imag/real);//fi = arctg(y/x)
        return  argumentValue;
    }
    public MyComplex add(MyComplex right){
        this.real = this.real + right.getReal();
        this.imag = this.imag + right.getImag();
        return  this;
    }
    public MyComplex substract(MyComplex right){
        this.real = this.real - right.getReal();
        this.imag = this.imag - right.getImag();
        return  this;
    }
    public MyComplex multiply(MyComplex right){
        this.real = this.real * right.getReal();
        this.imag = this.imag * right.getImag();
        return  this;
    }
    public MyComplex divide(MyComplex right){
        this.real = this.real / right.getReal();
        this.imag = this.imag / right.getImag();
        return  this;
    }
    public MyComplex addNew(MyComplex right){
        MyComplex newComplex = new MyComplex();
        newComplex.real = this.real + right.getReal();
        newComplex.imag = this.imag + right.getImag();
        return  newComplex;
    }
    public MyComplex substractNew(MyComplex right){
        MyComplex newComplex = new MyComplex();
        newComplex.real = this.real - right.getReal();
        newComplex.imag = this.imag - right.getImag();
        return  newComplex;
    }
    public MyComplex conjugate(){
        MyComplex newComplex = new MyComplex();
        newComplex.real = this.real;
        newComplex.imag = - this.imag;
        return  newComplex;
    }




    private double real= 0.0;
    private  double imag = 0.0;

}
