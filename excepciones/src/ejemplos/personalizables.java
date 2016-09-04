package ejemplos;

import java.util.Scanner;

public class personalizables {

    public static void main(String[] args) throws edadException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su edad");
        int edad = sc.nextInt();

        final int edad_maxima = 100;

        //try {

            if (edad < edad_maxima) {

                System.out.println("Bienvenido");

            } else {

                throw new edadException("edad no permitida");

            }

        /*} catch (Exception e) {

            System.out.println(e.getMessage());
        }*/

    }

}

class edadException extends Exception {

    public edadException(String mensaje) {

        super(mensaje);//asignar a la clase que herede

    }

}
