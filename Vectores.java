import java.util.Scanner;

public class Vectores implements Calculadora{
    private double a[];
    private double b[];
    private double c[];
    private int n;

    public int getN() {   //metodos para manejar N
        return n;
        
    }
    public void setN(int n) {
        this.n = n;
        
    }
    
    public void setA() {   //metodo para llenar el vector A
        this.a =new double[this.n]; 
        Scanner entrada = new Scanner(System.in);
        for (int i=0;i<this.n;i++){
            System.out.println(("Ingresa el valor "+(i+1)+" del vector A"));
            this.a[i]=entrada.nextDouble();
        }
        
    }


    public void setB() {   //metodo para llenar el vector B
        this.b =new double[this.n];
        Scanner entrada = new Scanner(System.in);
        for (int i=0;i<n;i++){
            System.out.println(("Ingresa el valor "+(i+1)+" del vector B"));
            this.b[i]=entrada.nextDouble();
        }
        
    }


    @Override
    public void suma(){   //metodo suma de la interface
        this.c = new double[this.n];
        for (int i=0;i<n;i++){
            this.c[i]=this.a[i]+this.b[i];
        }
    }


    @Override
    public void resta(){   //metodo resta de l interface
        this.c = new double[this.n];
        for (int i=0;i<n;i++){
            this.c[i]=this.a[i]-this.b[i];
        }
    }


    @Override
    public void multiplicacion() {   //metodo multiplicacion de la interface
        this.c = new double[this.n];
        for (int i=0;i<n;i++){
            this.c[i]=this.a[i]*this.b[i];
        }
    }


    @Override
    public void divicion() {   //metodo divicion de la interface
        this.c = new double[this.n];
        for (int i=0;i<n;i++){
            this.c[i]=this.a[i] / this.b[i];
        }
    }


    private void printVector(double e[],int d){   //imprecion de resultados implementado in metodo privado 
        for (int i=0;i<d;i++){
            System.out.println("El resultado "+(i+1)+" es:");
            System.out.println(e[i]);
            
        }
    }
    
    public void mostrarResultado(){
        printVector(c, n);
    
    }    
}