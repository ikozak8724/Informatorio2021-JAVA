import java.util.*;

public class EJERCICIO3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un número por favor: ");
        int a = scan.nextInt();
        Escalon(a);
        scan.close();
    }
    public static void Escalon(int a){
        for(int i = 1; i <= a; i++){
            String linea="";
            for(int j = 1; j <= i; j++){
                linea +=j + " ";
            }
            System.out.println(linea);
        }
    }
}