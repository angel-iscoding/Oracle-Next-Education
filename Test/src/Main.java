import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String nameItem;

        DinamicArray da = new DinamicArray();

        int op;

        do {
            System.out.println("Ingrese un valor: ");
            nameItem = sc.nextLine();

            da.add(nameItem);
            System.out.println("¿Desea salir del programa?");

            op = sc.nextInt();
            sc.nextLine();
            if(op == 1)
                break;
        } while (true);

        for (int i = 0; i != da.getCount(); ++i) {
            System.out.println(da.getItem(i));
        }
    }
}
