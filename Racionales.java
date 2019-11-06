import java.util.IllegalFormatWidthException;
import java.util.Scanner;

public class Racionales implements Calculadora {
    private int num;
    private int den;

    Racionales() {

    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        this.den = den;
    }
    public void suma() {
        Racionales a = new Racionales();
        Racionales b = new Racionales();
        Racionales res = new Racionales();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el numerador de a");
        a.setNum(entrada.nextInt());
        System.out.println("Ingresa el denominador de a");
        a.setDen(entrada.nextInt());
        System.out.println("Ingresa el numerador de b");
        b.setNum(entrada.nextInt());
        System.out.println("Ingresa el denominador de b");
        b.setDen(entrada.nextInt());
        res.setNum((a.getNum()*b.getDen())+(a.getDen()*b.getNum()));
        res.setDen(a.getDen()*b.getDen());
        System.out.println("La suma es "+res.getNum()+"/"+res.getDen());
    }

    public void resta() {
        Racionales a = new Racionales();
        Racionales b = new Racionales();
        Racionales res = new Racionales();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el numerador de a");
        a.setNum(entrada.nextInt());
        System.out.println("Ingresa el denominador de a");
        a.setDen(entrada.nextInt());
        System.out.println("Ingresa el numerador de b");
        b.setNum(entrada.nextInt());
        System.out.println("Ingresa el denominador de b");
        b.setDen(entrada.nextInt());
        res.setNum((a.getNum()*b.getDen())-(a.getDen()*b.getNum()));
        res.setDen(a.getDen()*b.getDen());
        System.out.println("La suma es "+res.getNum()+"/"+res.getDen());

    }


    public void multiplicacion() {
        Racionales a = new Racionales();
        Racionales b = new Racionales();
        Racionales res = new Racionales();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el numerador de a");
        a.setNum(entrada.nextInt());
        System.out.println("Ingresa el denominador de a");
        a.setDen(entrada.nextInt());
        System.out.println("Ingresa el numerador de b");
        b.setNum(entrada.nextInt());
        System.out.println("Ingresa el denominador de b");
        b.setDen(entrada.nextInt());
        res.setNum(a.getNum()*b.getNum());
        res.setDen(a.getDen()*b.getDen());
        System.out.println("La suma es "+res.getNum()+"/"+res.getDen());
    }

    public void divicion() {
        Racionales a = new Racionales();
        Racionales b = new Racionales();
        Racionales res = new Racionales();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el numerador de a");
        a.setNum(entrada.nextInt());
        System.out.println("Ingresa el denominador de a");
        a.setDen(entrada.nextInt());
        System.out.println("Ingresa el numerador de b");
        b.setNum(entrada.nextInt());
        System.out.println("Ingresa el denominador de b");
        b.setDen(entrada.nextInt());
        res.setNum(a.getNum()*b.getDen());
        res.setDen(a.getDen()*b.getNum());
        System.out.println("La suma es "+res.getNum()+"/"+res.getDen());

    }
    
}