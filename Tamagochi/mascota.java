import java.util.Scanner;
class Mascota {
    static Scanner leer = new Scanner(System.in);

    private int maxEnergia = 100;
    private int minEnergia = 0;

    private String nombre;
    private int energia;
    private double peso;
    private boolean dormido;
    private int humor;
    private boolean estado;

    public boolean isEstado() {
        return estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void nombre() {
        System.out.print("Ingrese el nombre de su mascota: ");
        nombre = leer.nextLine();
        System.out.println("Felicidades!!...Tu mascota " + nombre + " ya fue creada ");
        peso = 30;
        energia = 50;
        estado = true;
    }

    public void comer() {
        if (estado) {
            System.out.println("Su mascota está comiendo...");
            System.out.println("Peso aumentado...\nEnergía aumentando...");
            energia += 20;
            peso += 5;
            System.out.println("El peso de " + nombre + " ahora es de " + peso + "kg");
            if (peso >= 100) {
                System.out.println(nombre + " ha fallecido debido a que pesa " + peso + "kg.");
                estado = false;
            }
        } else {
            System.out.println(nombre + " no puede comer. Está muerto.");
        }
    }

    public void dormir() {
        if (estado) {
            System.out.println("Su mascota está durmiendo...");
            dormido = true;
            energia+=10;
            System.out.println("energia de " + nombre + " aumentando... " );
        } else {
            System.out.println(nombre + " no puede dormir. Está muerto.");
        }
    }

    public void despertar() {
        if (estado) {
            System.out.println("Su mascota se ha despertado...");
            dormido = false;
        } else {
            System.out.println(nombre + " no puede despertar. Está muerto.");
        }
    }

    public void caminar() {
        if (estado) {
            System.out.println("Su mascota está caminando...\nEnergía reduciendo...");
            energia -= 20;
            if (energia <= minEnergia) {
                System.out.println("Su mascota ha fallecido debido a falta de energía.");
                estado = false;
            }
        } else {
            System.out.println(nombre + " no puede caminar. Está muerto.");
        }
    }

    public void correr() {
        if (estado) {
            System.out.println("Su mascota está corriendo...\nEnergía reduciendo mucho...\nPeso reduciendo mucho...");
            energia -= 40;
            peso -= 10;
            if (energia <= minEnergia) {
                System.out.println("Su mascota ha fallecido debido a falta de energía.");
                estado = false;
            } else if (peso <= 0) {
                System.out.println("Su mascota ha fallecido debido a bajo peso.");
                estado = false;
            }
        } else {
            System.out.println(nombre + " no puede correr. Está muerto.");
        }
    }

    public void obtenerEnergia() {
        if (estado) {
            System.out.println("Obteniendo energía...");
            energia += 30;
            if (energia > maxEnergia) {
                energia = maxEnergia;
            }
            System.out.println("Energía de " + nombre + " ahora es de " + energia);
        } else {
            System.out.println(nombre + " no puede obtener energía. Está muerto.");
        }
    }
}