import java.util.Scanner;

public class Portafolio {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n \n");
            System.out.println("Bienvenidos a mi rockemma java [rockemma Versión 1.0]");
            System.out.println("                _                                  ");
            System.out.println(" _ __ ___   ___| | _____ _ __ ___  _ __ ___   __ _ ");
            System.out.println("| '__/ _ \\ / __| |/ / _ \\ '_ ` _ \\| '_ ` _ \\ / _` |");
            System.out.println("| | | (_) | (__|   <  __/ | | | | | | | | | | (_| |");
            System.out.println("|_|  \\___/ \\___|_|\\_\\___|_| |_| |_|_| |_| |_|\\__,_|");
            System.out.println("");
            System.out.println("[?] Selecciona una opción para continuar");
            System.out.println("Proyecto Iniciado -->> Mar 18 8:45 am 2025");
            System.out.println("");
            System.out.println("[1] Suma de dos números");
            System.out.println("[2] Resta de dos números");
            System.out.println("[3] Multiplicación de dos números");
            System.out.println("[4] División de dos números");
            System.out.println("[5] Módulo (Residuo de una división)");
            System.out.println("[6] Promedio de tres números");
            System.out.println("[7] Número mayor y menor entre dos números");
            System.out.println("[8] Número mayor y menor entre tres números");
            System.out.println("[9] Conversión de metros a centímetros");
            System.out.println("[10] Conversión de kilogramos a gramos");
            System.out.println("[0] Salir");
            System.out.print("[?] ");

            opcion = scanner.nextInt();

            // OPCIONES
            switch (opcion) {
                case 1:
                    System.out.println("----------------------");                   
                    System.out.print("[n1] ");
                    int n1 = scanner.nextInt();
                    System.out.println(n1);
                    System.out.println("----------------------");
                    break;
                default:
                    break;
            }
            
        } while (opcion != 0);
    }
}
