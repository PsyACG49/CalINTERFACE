import java.util.Scanner;

public class Vectores implements Calculadora{
    private double a[];
    private double b[];
    private double c[];
    private int n;

    public int getN() {
        return n;
        
    }
    public void setN(int n) {
        this.n = n;
        
    }
    
    public void setA() {
        Scanner entrada = new Scanner(System.in);
        for (int i=0;i<n;i++){
            System.out.println(("Ingresa el valor "+i+"del vector A"));
            this.a[i]=entrada.nextDouble();
        }
        
    }


    public void setB() {
        Scanner entrada = new Scanner(System.in);
        for (int i=0;i<n;i++){
            System.out.println(("Ingresa el valor "+i+"del vector B"));
            this.b[i]=entrada.nextDouble();
        }
        
    }


    @Override
    public void suma(){
        for (int i=0;i<n;i++){
            this.c[i]=this.a[i]+this.b[i];
        }
    }


    @Override
    public void resta(){
        for (int i=0;i<n;i++){
            this.c[i]=this.a[i]-this.b[i];
        }
    }


    @Override
    public void multiplicacion() {
        for (int i=0;i<n;i++){
            this.c[i]=this.a[i]*this.b[i];
        }
    }


    @Override
    public void divicion() {
        for (int i=0;i<n;i++){
            this.c[i]=this.a[i] / this.b[i];
        }
    }


    private void printVector(double e[],int d){
        for (int i=0;i<d;i++){
            System.out.println(e[i]+"");
            
        }
    }
    
    
    public void mostrarResultado(){
        printVector(a, n);
        printVector(b, n);
        printVector(c, n);
    
    }    
}