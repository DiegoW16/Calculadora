import java.util.Scanner;

public class MiPrimerCalculadora {
    public static void main(String[] args) {
        //Definicion e inicializacion de variables scanner y boolean
        Scanner in = new Scanner(System.in);
        boolean seguir = true;

        //Bienvenida a usuario e introduccion del nombre
        System.out.println("Hola, gracias por probar mi calculadora :D ¿Cuál es tu nombre?");
        String nombre = in.nextLine();
        System.out.println("Bienvenido " + nombre + " :D");

        //Continuación del programa, ingreso de los respectivos números junto con su operador.
        while (seguir){
            System.out.print("Ingresa el primer número: ");
            double num1 = in.nextDouble();

            System.out.print("Ingresa el operador (+, -, *, /): ");
            char operador = in.next().charAt(0);

            System.out.print("Ingresa el segundo número: ");
            double num2 = in.nextDouble();

            //Realización del resultado y manejo de división por cero.
            double resultado = 0;
            boolean operacionValida = true;

            switch (operador){
                case '+':
                    resultado = num1 + num2;
                    break;

                case '-':
                    resultado = num1 - num2;
                    break;

                case '*':
                    resultado = num1 * num2;
                    break;

                case '/':
                    if (num2 != 0){
                        resultado = num1 / num2;
                    } else {
                        System.out.println("Error: no es posible dividir por cero");
                        operacionValida = false;
                    }
                    break;
                default:
                    System.out.println("Operador no valido.");
                    operacionValida = false;

            }

            //Si la operacion es valida se mostrará el resultado.
            if (operacionValida){
                System.out.println("El resultado de la operación es: " + resultado);
            }

            //Se le pide al usuario si desea realizar otra operacion.
            System.out.print("¿Desea realizar otra operación? (s/n): ");
            char respuesta = in.next().charAt(0);
            seguir = (respuesta == 's');
        }

        //Fin del programa.
        System.out.println("Gracias " + nombre + " por usar mi calculadora. !Hasta luego¡ :)");

    }
}
