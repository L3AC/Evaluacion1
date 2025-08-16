package com.mycompany.task1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task1 {

    private static Map<String, String> alumnos = new HashMap<>();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion=0;
        do {
            System.out.println("\n--- Menú UDB VIRTUAL ---");
            System.out.println("1. Ingresar alumno");
            System.out.println("2. Buscar alumno");
            System.out.println("3. Eliminar alumno");
            System.out.println("4. Mostrar todos los alumnos");
            System.out.println("5. Salir");
            System.out.print("Seleccione un número de las opciones válidas: ");

            if (input.hasNextInt()) {
                opcion = input.nextInt();
                input.nextLine();//Leer todos los caracteres del input
                
                switch (opcion) {
                    case 1:
                        ingresar();
                        break;
                    case 2:
                        buscar();
                        break;
                    case 3:
                        eliminar();
                        break;
                    case 4:
                        mostrar();
                        break;
                    case 5:
                        System.out.println("Saliendo del sistema...");
                        break;
                    default:
                        System.out.println("\n--- Opción inválida ---");
                        break;
                }
            } else {
                System.out.println("Solo se permiten números");
                input.next();//limpia la linea
            }

        } while (opcion != 5);
        input.close();
    }

    private static void ingresar() {
        System.out.print("\nIngrese carnet: ");
        String carnet = input.nextLine();

        System.out.print("Ingrese nombre completo: ");
        String nombre = input.nextLine();

        alumnos.put(carnet, nombre);
        System.out.println("Alumno ingresado exitosamente");
    }

    private static void buscar() {
        System.out.print("\nIngrese carnet a buscar: ");
        String carnet = input.nextLine();

        if (alumnos.containsKey(carnet)) {
            System.out.println("\n--- Alumno encontrado ---");
            System.out.println("Carnet: " + carnet);
            System.out.println("Nombre: " + alumnos.get(carnet));
        } else {
            System.out.println("Alumno no encontrado, no se puede mostrar");
        }
    }

    private static void eliminar() {
        System.out.print("\nIngrese carnet a eliminar: ");
        String carnet = input.nextLine();

        if (alumnos.containsKey(carnet)) {
            alumnos.remove(carnet);
            System.out.println("Alumno eliminado exitosamente");
        } else {
            System.out.println("Alumno no encontrado, no se puede eliminar");
        }
    }

    private static void mostrar() {
        if (alumnos.isEmpty()) {
            System.out.println("\nNo hay alumnos registrados");
            return;
        }

        System.out.println("\n--- Listado de Alumnos ---");
        for (Map.Entry<String, String> alumno : alumnos.entrySet()) {
            System.out.println("Carnet: " + alumno.getKey() + " | Nombre: " + alumno.getValue());
        }
    }
}
