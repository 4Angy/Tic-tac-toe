import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
    //Se pide al jugador 1 que seleccione un caracter
        System.out.println("Jugador/a 1 ,seleccioná un símbolo (x - o)");
        char p1 = scanner.next().charAt(0);
    //Verifica que sea válido
        while (p1 != 'o' && p1 != 'x'){
            System.out.println("Eso no es un caracter válido,bobis \uD83D\uDE44 .");
             p1 = scanner.next().charAt(0);

        };
    //Se le asigna el caracter "contrario" a el jugador 2
        char p2 = (p1 == 'x') ? 'o':'x';

    //muestra los caracteres seleccionados, en azul para p1 y verde para el p2
        System.out.println("Los simbolos seleccionados fueron:\n----------------");
        System.out.println("\u001B[34mP1: " + p1 + "\u001B[0m");
        System.out.println("\u001B[32mP2: " + p2 + "\u001B[0m");


             String [][] tateti = {
                    {"a1","a2","a3"},
                    {"b1","b2","b3"},
                    {"c1","c2","c3"}


             };

    }
}
