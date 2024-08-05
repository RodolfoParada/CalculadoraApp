import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        while (true) {
            System.out.println("**** Aplicacion Calculadora *****");
            //Mostrarmos el menu
            mostrarMenu();
            try {
                var operacion = Integer.parseInt(consola.nextLine());
                //Revisar que este dentro de las opciones
                if (operacion >= 1 && operacion <= 4) {
               // ejecutamos la operación deseada
                    ejecutarOperacion(operacion, consola);
                } else if (operacion == 5) { //Salir
                    System.out.println("Hasta pronto...");
                    break;
                } else {
                    System.out.println("opcion erronea " + operacion);
                }
                // Imprimimos un salto de linea antes de repetir el cicle
                System.out.println();
            }// fin try
            catch (Exception e) {
                System.out.println("Ocurrio un error: " + e.getMessage());
            }
        } // fin while
    }//fin main

    private static void mostrarMenu(){
        // Mostramos el menu
        System.out.println("1.Suma \n2.Resta \n3.Multiplicacion \n4.Division \n5.Salir");
        System.out.println("¿Operacion a realizar?");
    }
    private static void ejecutarOperacion(int operacion, Scanner consola){
        System.out.println("Proporciona  valor operando1: ");
        var operando1 = Double.parseDouble(consola.nextLine());
        System.out.println("Proporciona  valor operando2: ");
        var operando2 = Double.parseDouble(consola.nextLine());

        double resultado;
        switch (operacion) {
            case 1 -> { //Suma
                resultado = operando1 + operando2;
                System.out.println("Resultado Suma: " + resultado);

            }
            case 2 -> { //Resta
                resultado = operando1 - operando2;
                System.out.println("Resultado Resta: " + resultado);

            }
            case 3 -> { //Multiplicacion
                resultado = operando1 * operando2;
                System.out.println("Resultado Multiplicacion: " + resultado);

            }
            case 4 -> { //Division
                resultado = operando1 / operando2;
                System.out.println("Resultado Division: " + resultado);

            }
            default -> {
                System.out.println("Opcion erronea: " + operacion);
            }
        }
    }
}// fin clase