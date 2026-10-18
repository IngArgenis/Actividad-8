import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // Variables de tipo flotante para los números 
        float num1 = 0;
        float num2 = 0;
        int opcion = 0;

        System.out.println("=== CALCULADORA BÁSICA ===");

        // Validamos que el primer dato ingresado sea un número flotante
        boolean valido1 = false;
        while (!valido1) {
            System.out.print("Ingresa el primer número: ");
            // Checamos si lo que escribió el usuario es un número flotante
            if (teclado.hasNextFloat()) {
                num1 = teclado.nextFloat();
                valido1 = true; // Salimos del ciclo al confirmar que sí es número
            } else {
                System.out.println("Error: No ingresaste un número válido. Intenta de nuevo.");
                teclado.next();
            }
        }

        // Validamos que el segundo dato ingresado sea un número flotante
        boolean valido2 = false;
        while (!valido2) {
            System.out.print("Ingresa el segundo número: ");
            if (teclado.hasNextFloat()) {
                num2 = teclado.nextFloat();
                valido2 = true;
            } else {
                System.out.println("Error: No ingresaste un número válido. Intenta de nuevo.");
                teclado.next();
            }
        }

        // Mostramos el menú de opciones al usuario
        System.out.println("\n¿Qué operación quieres realizar?");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Elevar al cuadrado");
        
        System.out.print("Elige una opción (1-5): ");
        opcion = teclado.nextInt(); // Guardamos la opción seleccionada

        System.out.println("\n--- RESULTADOS ---");
        
        // Usamos el switch para ejecutar la operación seleccionada
        switch (opcion) {
            case 1:// Suma
                System.out.println("La suma es: " + (num1 + num2));
                break;
            case 2:// Resta
                System.out.println("La resta es: " + (num1 - num2));
                break;
            case 3:// Multiplicación
                System.out.println("La multiplicación es: " + (num1 * num2));
                break;
            case 4:// División
                // Usamos un condicional para que el programa muestre un error si intentan dividir entre cero
                if (num2 == 0) {
                    System.out.println("Error matemático: No se puede dividir entre cero.");
                } else {
                    System.out.println("La división es: " + (num1 / num2));
                }
                break;
            case 5:// Elevar al cuadrado 
                // Calculamos el cuadrado de ambos números y mostramos el resultado
                System.out.println("El cuadrado de " + num1 + " es: " + (num1 * num1));
                System.out.println("El cuadrado de " + num2 + " es: " + (num2 * num2));
                break;
            default:
                System.out.println("Opción no válida. Por favor reinicia el programa.");
                break;
        }

        teclado.close();
    }
}