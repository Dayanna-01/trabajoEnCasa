import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Recursividad rec = new Recursividad();

        // Ejercicio 1: Suma de los números consecutivos
        System.out.println("-----Ejercicio 1-----");
        System.out.print("Ingrese un número para sumar los numeros hasta el numero que ingreso: ");
        int n = sc.nextInt();
        System.out.println("Resultado: " + rec.sumaConsecutivos(n));

        // Ejercicio 2: Potencia
        System.out.println("-----Ejercicio 2-----");
        System.out.print("Ingrese la base: ");
        int base = sc.nextInt();
        System.out.print("Ingrese el exponente: ");
        int exponente = sc.nextInt();
        System.out.println("Resultado de la potencia: " + rec.potencia(base, exponente));

        // Ejercicio 3: Suma de dígitos
        System.out.println("-----Ejercicio 3-----");
        System.out.print("Ingrese un número para sumar los digitos entre si: ");
        int numero = sc.nextInt();
        System.out.println("Resultado: " + rec.sumaDigitos(numero));

        // Fibonacci
        System.out.println("----Fibonacci-----");
        System.out.print("Ingrese un número: ");
        int n1 = sc.nextInt();
        rec.fibonacci(n1);
    }
}
