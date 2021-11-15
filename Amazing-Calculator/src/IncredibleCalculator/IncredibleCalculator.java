import java.util.Scanner;

public class IncredibleCalculator {

    public static void main (String [] args) {

        System.out.println ("Selecciona la operación que prefieras realizar:");
        System.out.println ("1. Sumar");
        System.out.println ("2. Restar");
        System.out.println ("3. Multiplicar");
        System.out.println ("4. Dividir (división entera)");
        System.out.println ("5. Dividir (división con decimales)");

        int opcion = leerEnteroEntrada ();


        cambiar (opcion) {
            caso 1: // Sumar. Debes leer dos numeros enteros de entrada e imprimir su suma
                    rotura;
            caso 2: // Restar. Debes leer dos números enteros de entrada e imprimir su resta
                    rotura;
            caso 3: // Multiplicar. Debes leer dos números enteros de entrada e imprimir su producto.
                    rotura;
            caso 4: // Multiplicador. Debes leer dos números enteros de entrada e imprimir su división entera.
                    rotura;
            caso 5: // Multiplicador. Debes leer dos números enteros de entrada e imprimir su división con decimales.
                    rotura;

        }

    }

    public static int suma (int a, int b) {
        devuelve a + b;
    }

    public static int resta (int a, int b) {
        volver a - b;
    }

    public static int multiplicacion (int a, int b) {
        return a * b;
    }

    public static int divisionEntera (int a, int b) {
        return a / b;
    }

    public static double divisionConDecimales (int a, int b) {
        devuelve a / (b * 1.0);
    }

    public static int leerEnteroEntrada () {
        tratar {
            Scanner sc = nuevo escáner (System.in);
            int resultado = Integer.parseInt (sc.next ());
            sc.close ();
            devolver resultado;
        } catch (NumberFormatException ex) {
            System.err.println ("Lo que has introducido no es un número entero!");
            System.exit (1);
            return -1;
        }

    }

}