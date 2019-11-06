public class Vectores implements Calculadora{
    private double a[];
    private double b[];
    private double c[];
    private int n;

    public void suma(){
        for (int i=0;i<n;i++){
            this.c[i]=this.a[i]+this.b[i];
        }
    }
    public void resta(){
        for (int i=0;i<n;i++){
            this.c[i]=this.a[i]-this.b[i];
        }
    }

    public void multiplicacion() {
        for (int i=0;i<n;i++){
            this.c[i]=this.a[i]*this.b[i];
        }
    }
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