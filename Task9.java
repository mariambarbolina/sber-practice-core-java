import java.util.Scanner;
import java.util.Random;
public class Task9 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        char b;
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random r = new Random();
        char c = alphabet.charAt(r.nextInt(alphabet.length()));
        System.out.println(c);
        System.out.println("Задумана буква от А до Z, попытайтесь ее угадать: ");
        do{

            b = in.next().charAt(0);
            if (b < c) {
                System.out.println("Нужная буква ближе к концу алфавит, вводи еще: ");
                continue;
            }
            else if (b > c){
                System.out.println("нужная буква ближе к началу алфавита, вводи еще: ");
                continue;
            }
        }
        while (b != c);
        System.out.print("** Правильно! **");
    }
}
