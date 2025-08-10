import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        int saldo = 1000;

        String bienvenida = "Bienvenido Usuario al banco MiCredito\n\n";
        String opciones = "(1) Consultar saldo\n(2) Agregar saldo\n(3) Retirar saldo\n(4) Salir\n\n";
        String usuario = "Usuario -> ";

        boolean salir = false;

        while (salir != true) {
                System.out.print(bienvenida + opciones + usuario);
                
                int select = user.nextInt();

                switch (select) {
                case 1:
                    System.out.print("\nSaldo actual:" + saldo);
                    break;
                case 2:
                    System.out.print("\nPor favor, digite la cantidad a depositar.\n\n" + usuario);

                    int deposito = user.nextInt();

                    saldo += deposito;

                    System.out.println("\n\nSu nuevo saldo es: " + saldo);
                    break;
                case 3:
                    System.out.print("\nPor favor, digite la cantidad a retirar.\n\n" + usuario);

                    int retiro = user.nextInt();

                    saldo -= retiro;

                    System.out.println("\n\nSu nuevo saldo es: " + saldo);
                    break;
                case 4:
                    salir = true;

                    System.out.println("\n\n¡Muchas gracias por usar nuestro servicio!");
                    break;
                default:
                    System.out.println("\n\nOpcion no valida");
                    break;
            }

            System.out.println("\n");
        }
    }
}