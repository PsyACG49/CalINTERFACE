public class Reales implements Calculadora {
    private double a;
    private double b;
    private double c;


    public double getA() {
        return a;
    }


    public double getC() {
        return c;
    }


    public void setC(double c) {
        this.c = c;
    }


    public double getB() {
        return b;
    }


    public void setB(double b) {
        this.b = b;
    }


    public void setA(double a) {
        this.a = a;
    }


    @Override
    public void suma() {   //suma de reales  
        this.c = this.a + this.b;

    }


    @Override
    public void resta() {   //resta de Reales 
        this.c = this.a - this.b;

    }


    @Override
    public void multiplicacion() {   //multiplicacion de Reales
        this.c = this.a * this.b;

    }


    @Override
    public void divicion() {   //division de Reales 
        this.c = this.a / this.b;

    }    
}