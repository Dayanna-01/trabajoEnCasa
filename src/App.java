import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        EjerciciosRecursivos er = new EjerciciosRecursivos();
        Scanner scanner = new Scanner(System.in);

        // Solicitar número para la suma de consecutivos
        System.out.print("Introduce el número para la suma de consecutivos: ");
        int numeroSuma = scanner.nextInt();
        int resultadoSuma = er.sumaConsecutivos(numeroSuma);
        System.out.println("Resultado de la suma: " + resultadoSuma);
        System.out.println()
        ;
        // Solicitar base y exponente para calcular la potencia
        System.out.print("Introduce la base para la potencia: ");
        int base = scanner.nextInt();
        System.out.print("Introduce el exponente para la potencia: ");
        int exponente = scanner.nextInt();
        int resultadoPotencia = er.potencia(base, exponente);
        System.out.println("Resultado de la potencia: " + resultadoPotencia);
        System.out.println();

        // Solicitar número para sumar los dígitos
        System.out.print("Introduce un número para sumar sus dígitos: ");
        int numeroDigitos = scanner.nextInt();
        int resultadoSumaDigitos = er.sumaDigitos(numeroDigitos);
        System.out.println("Resultado de la suma de los digitos: " + resultadoSumaDigitos);

        // Cerrar el scanner
        scanner.close();
    }
}
