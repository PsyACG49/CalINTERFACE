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

    @Override
    public void suma() {   //Suma de Racionales
        Racionales a = new Racionales();
        Racionales b = new Racionales();
        Racionales res = new Racionales();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el numerador y denominador de a:");
        a.setNum(entrada.nextInt());
        System.out.print("/");
        a.setDen(entrada.nextInt());
        System.out.println("Ingresa el numerador y denominador de b:");
        b.setNum(entrada.nextInt());
        System.out.print("/");
        b.setDen(entrada.nextInt());
        res.setNum((a.getNum()*b.getDen())+(a.getDen()*b.getNum()));
        res.setDen(a.getDen()*b.getDen());
        System.out.println("La suma es "+res.getNum()+"/"+res.getDen());
    }

    @Override
    public void resta() {   //Resta de Racionales
        Racionales a = new Racionales();
        Racionales b = new Racionales();
        Racionales res = new Racionales();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el numerador y denominador de a:");
        a.setNum(entrada.nextInt());
        System.out.print("/");
        a.setDen(entrada.nextInt());
        System.out.println("Ingresa el numerador y denominador de b");
        b.setNum(entrada.nextInt());
        System.out.println("/");
        b.setDen(entrada.nextInt());
        res.setNum((a.getNum()*b.getDen())-(a.getDen()*b.getNum()));
        res.setDen(a.getDen()*b.getDen());
        System.out.println("La resta es "+res.getNum()+"/"+res.getDen());

    }

    @Override
    public void multiplicacion() {  //Multiplicacion de Racionales
        Racionales a = new Racionales();
        Racionales b = new Racionales();
        Racionales res = new Racionales();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el numerador y denominador de a");
        a.setNum(entrada.nextInt());
        System.out.print("/");
        a.setDen(entrada.nextInt());
        System.out.println("Ingresa el numerador y denominador de b");
        b.setNum(entrada.nextInt());
        System.out.print("/");
        b.setDen(entrada.nextInt());
        res.setNum(a.getNum()*b.getNum());
        res.setDen(a.getDen()*b.getDen());
        System.out.println("La multiplicacion es "+res.getNum()+"/"+res.getDen());
    }

    @Override
    public void divicion() {  //Divicion de Racionales
        Racionales a = new Racionales();
        Racionales b = new Racionales();
        Racionales res = new Racionales();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el numerador y denominador de a");
        a.setNum(entrada.nextInt());
        System.out.print("/");
        a.setDen(entrada.nextInt());
        System.out.println("Ingresa el numerador y denominador de b");
        b.setNum(entrada.nextInt());
        System.out.print("/");
        b.setDen(entrada.nextInt());
        res.setNum(a.getNum()*b.getDen());
        res.setDen(a.getDen()*b.getNum());
        System.out.println("La divicion es "+res.getNum()+"/"+res.getDen());

    }
}