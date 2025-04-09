public class EjerciciosRecursivos {

    public int llamadasRecursiva = 1;

    // Función para sumar los consecutivos hasta el número n
    public int sumaConsecutivos(int n) {
        int idActual = llamadasRecursiva++;
        System.out.println("Llamada #" + idActual + " con número n = " + n);

        if (n == 1) {
            System.out.println("Llamada #" + idActual + 
                               " -> caso base alcanzado n = 1");
            return 1;
        }

        System.out.println("Llamada #" + idActual + 
                           " -> Llamando recursivamente con n = " + (n - 1));
        int resultadoParcial = sumaConsecutivos(n - 1);

        int resultado = n + resultadoParcial;
        System.out.println("Llamada #" + idActual + 
                           " -> sumando " + n + " + " + resultadoParcial + 
                           " = " + resultado);

        System.out.println("Llamada #" + idActual + " -> Retorno " + resultado);
        return resultado;
    }

    // Función recursiva para calcular la potencia
    public int potencia(int base, int exponente) {
        int idActual = llamadasRecursiva++;
        System.out.println("Llamada #" + idActual + " con base = " + base + " y exponente = " + exponente);

        // Caso base: exponente es 0
        if (exponente == 0) {
            System.out.println("Llamada #" + idActual + " -> caso base alcanzado, exponente = 0");
            return 1;
        }

        // Caso recursivo: multiplicar base por potencia(base, exponente-1)
        System.out.println("Llamada #" + idActual + " -> Llamando recursivamente con exponente = " + (exponente - 1));
        int resultadoParcial = potencia(base, exponente - 1);

        int resultado = base * resultadoParcial;
        System.out.println("Llamada #" + idActual + " -> multiplicando " + base + " * " + resultadoParcial + 
                           " = " + resultado);

        System.out.println("Llamada #" + idActual + " -> Retorno " + resultado);
        return resultado;
    }

    // Función recursiva para sumar los dígitos de un número
    public int sumaDigitos(int numero) {
        int idActual = llamadasRecursiva++;
        System.out.println("Llamada #" + idActual + " con número = " + numero);

        // Caso base: si el número es menor que 10, devolver el mismo número
        if (numero < 10) {
            System.out.println("Llamada #" + idActual + " -> caso base alcanzado, número = " + numero);
            return numero;
        }

        // Caso recursivo: obtener el último dígito y llamar recursivamente
        int ultimoDigito = numero % 10;
        int restoNumero = numero / 10;
        System.out.println("Llamada #" + idActual + " -> último dígito = " + ultimoDigito + ", resto = " + restoNumero);
        int resultadoParcial = sumaDigitos(restoNumero);

        int resultado = ultimoDigito + resultadoParcial;
        System.out.println("Llamada #" + idActual + " -> sumando " + ultimoDigito + " + " + resultadoParcial + 
                           " = " + resultado);

        System.out.println("Llamada #" + idActual + " -> Retorno " + resultado);
        return resultado;
    }
}
