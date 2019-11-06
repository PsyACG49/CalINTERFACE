import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int eleccion;
        System.out.println("----Calculadora----\nIngresa la calculadora a utilizar\n1)Calculadora racional\n2)Calcularoda vector\n3)Calculadora reales");
        //eleccion = entrada.nextInt();
        Racionales r = new Racionales();
        r.suma();
    }
}