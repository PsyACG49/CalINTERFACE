import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Racionales r = new Racionales();
        int e_racional;
        int e_vector;
        int e_real;
        int eleccion;
        System.out.println("----Calculadora----\nIngresa la calculadora a utilizar\n1)Calculadora racional\n2)Calcularoda vector\n3)Calculadora reales");
        eleccion = entrada.nextInt();
        if (eleccion==1){
            System.out.println("Operacion a realizar\n1)Suma\n2)Resta\n3)multipicaion\n4)Divicion");
            e_racional=entrada.nextInt();
            switch (e_racional){
                case 1: r.suma();
                    break;
                case 2: r.resta();
                    break;
                case 3: r.multiplicacion();
                    break;
                case 4: r.divicion();
                    break;
                default: System.out.println("error");
                    break;
            }
        } 
        if (eleccion==2){
            Vectores v = new Vectores();
            System.out.println("Ingresa el tamaño del los vectores:");
            v.setN(entrada.nextInt());
            v.setA();
            v.setB();
            System.out.println("Operacion a realizar\n1)Suma\n2)Resta\n3)multipicaion\n4)Divicion");
            e_vector=entrada.nextInt();
            switch (e_vector){
                case 1: v.suma();
                        v.mostrarResultado();
                    break;
                case 2: v.resta();
                        v.mostrarResultado();
                    break;
                case 3: v.multiplicacion();
                        v.mostrarResultado();
                    break;
                case 4: v.divicion();
                        v.mostrarResultado();
                    break;
                default: System.out.println("error");
                    break;
            }
        }
        if (eleccion==3){
            Reales real = new Reales();
            System.out.println("Ingresa el primer valor:");
            real.setA(entrada.nextDouble());
            System.out.println("Ingresa el segundo valor:");
            real.setB(entrada.nextDouble());
            System.out.println("Operacion a realzar:\n1)Suma\n2)Resta\n3)Multiplicion\n4)Divicion");
            e_real=entrada.nextInt();
            switch (e_real) {
                case 1: real.suma();
                        System.out.println(real.getC());
                    break;
                case 2: real.resta();
                        System.out.println(real.getC());
                    break;
                case 3: real.multiplicacion();
                        System.out.println(real.getC());
                    break;
                case 4: real.divicion();
                        System.out.println(real.getC());
                    break;
                default: System.out.println("error");
                    break;
            }

        }
    }
}