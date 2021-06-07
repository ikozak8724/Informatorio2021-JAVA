import java.util.Scanner;

public class EJERCICIO5 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el primer número entero: ");

        int n1 = scan.nextInt();

        System.out.println("Ingrese el segundo número entero: ");
        
        int n2 = scan.nextInt();

        int res = 0;

        for ( int i= 0; i < n1; ++i){

            res += n2;       

        }

        System.out.println(n1 + " x " + n2 + " = " + res);

        scan.close();



    }
}