import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Recursividad rec = new Recursividad();

        System.out.println("Seleccione un ejercicio:");
        System.out.println("1. Suma de los números consecutivos");
        System.out.println("2. Potencia");
        System.out.println("3. Suma de dígitos");
        System.out.println("4. Fibonacci");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                // Ejercicio 1: Suma de los números consecutivos
                System.out.println("-----Ejercicio 1-----");
                System.out.print("Ingrese un número para sumar los números hasta el número que ingresó: ");
                int n = sc.nextInt();
                System.out.println("Resultado: " + rec.sumaConsecutivos(n));
                break;

            case 2:
                // Ejercicio 2: Potencia
                System.out.println("-----Ejercicio 2-----");
                System.out.print("Ingrese la base: ");
                int base = sc.nextInt();
                System.out.print("Ingrese el exponente: ");
                int exponente = sc.nextInt();
                System.out.println("Resultado de la potencia: " + rec.potencia(base, exponente));
                break;

            case 3:
                // Ejercicio 3: Suma de dígitos
                System.out.println("-----Ejercicio 3-----");
                System.out.print("Ingrese un número para sumar los dígitos entre sí: ");
                int numero = sc.nextInt();
                System.out.println("Resultado: " + rec.sumaDigitos(numero));
                break;

            case 4:
                // Fibonacci
                System.out.println("----Fibonacci-----");
                System.out.print("Ingrese un número: ");
                int n1 = sc.nextInt();
                rec.fibonacci(n1);
                break;

            default:
                System.out.println("Opción no válida.");
                break;
        }
    }
}
