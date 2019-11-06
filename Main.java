import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Racionales r = new Racionales();
        int e_racional;
        int e_vector;
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
            System.out.println("Operacion a realizar\n1)Suma\n2)Resta\n3)multipicaion\n4)Divicion");
            e_vector=entrada.nextInt();
        }
    }
}