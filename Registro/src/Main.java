
import java.io.*;
import java.util.Scanner;
import java.util.logging.Logger;

import java.io.EOFException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Michael Daniel Murillo López
 */
public class Main {

    public static void main(String[] args) throws EOFException {
        Scanner tec = new Scanner(System.in);
        int menu, nit;
        String nombre, apellido, sexo, edad, direccion, Ncelular, correo, fecha, Cedula, Nit, lugar_de_nacimiento, pais, Tipo_Sangre_o_Rh;

        Usuario a = new Usuario();
        do {
            System.out.println("menu operacionl ");
            System.out.println("1. Capturar datos\n"
                    + "2. Editar datos\n"
                    + "3. Mostrar datos\n"
                    + "4. Guardar datos\n"
                    + "5. Salir ");
            System.out.println("para escojer una actividad colocar el numero");
            menu = tec.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Ingrese datos");
                    a.Datos();
                    System.out.println();
                    break;
                case 2:
                    System.out.println("corregir datos");
                    System.out.println();
                    a.Datos();
                    System.out.println();
                    break;
                case 3:
                    System.out.println("mostrar datos");
                    System.out.println();
                    System.out.println("Nombre: " + a.getNombre());
                    System.out.println("Apellido: " + a.getApellido());
                    System.out.println("NIT: " + a.getNit());
                    System.out.println("Fecha de nacimiento: " + a.getFecha());
                    System.out.println("N° de contacto: " + a.getNcelular());
                    System.out.println("Correo electronico: " + a.getCorreo());
                    System.out.println("Direccion recidencial: " + a.getDireccion());
                    System.out.println("sexo: " + a.getSexo());
                    System.out.print("ingrese Edad:" + a.getEdad());
                    System.out.print("Pais:" + a.getPais());

                    System.out.println();
                    break;
                case 4:
                    System.out.println("guardar datos");
                    guardar b = new guardar();
                    b.guardar();
                    System.out.println();
                    break;
                case 5:
                    System.out.println("--------------------------------------");
                    System.out.println("Gracias por usar nuestro software ☻");
                    System.out.println("--------------------------------------");
                    System.exit(0);
                    break;
            }
        } while (menu != 5);
    }

   
}
