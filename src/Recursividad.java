public class Recursividad {
    // Método para sumar los números consecutivos desde 1 hasta n
    public int sumaConsecutivos(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumaConsecutivos(n - 1);
        }
    }

    // Método para calcular la potencia de un número base elevado a un exponente
    public int potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return base * potencia(base, exponente - 1);
        }
    }

    // Método para sumar los dígitos de un número
    public int sumaDigitos(int numero) {
        if (numero < 10) {
            return numero;
        } else {
            return (numero % 10) + sumaDigitos(numero / 10);
        }
    }

    // Método para imprimir los primeros n números de la serie de Fibonacci
    public void fibonacci(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRecursivo(i) + " ");
        }
        System.out.println();  // Para que el resultado aparezca en una nueva línea
    }

    // Método recursivo para calcular el n-ésimo número de Fibonacci
    private int fibonacciRecursivo(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
    }
}
