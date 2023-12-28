import java.util.Scanner;

public class tamagochi {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        Mascota tamagotchi = new Mascota();
        int num;

        System.out.println("BIENVENIDO A SU MASCOTA VIRTUAL");
        System.out.print("Ingrese el nombre de su mascota: ");
        tamagotchi.nombre();

        do {
            System.out.println("\n¿Qué acción desea realizar?");
            System.out.println("1- Comer ");
            System.out.println("2- Dormir ");
            System.out.println("3- Despertar ");
            System.out.println("4- Caminar ");
            System.out.println("5- Obtener Energía ");
            System.out.println("6- Correr ");
            System.out.println("0- Salir ");

            System.out.print("Ingrese el número de la acción: ");
            num = leer.nextInt();

            switch (num) {
                case 1:
                    tamagotchi.comer();
                    break;
                case 2:
                    tamagotchi.dormir();
                    break;
                case 3:
                    tamagotchi.despertar();
                    break;
                case 4:
                    tamagotchi.caminar();
                    break;
                case 5:
                    tamagotchi.obtenerEnergia();
                    break;
                case 6:
                    tamagotchi.correr();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }

        } while (num != 0 && tamagotchi.isEstado());

        System.out.println("Gracias por jugar con " + tamagotchi.getNombre() + "!");
    }
}