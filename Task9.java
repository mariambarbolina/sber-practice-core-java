import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Task9 {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random r = new Random();
        char c, answer = alphabet.charAt(r.nextInt(alphabet.length()));
        System.out.println(c);

        System.out.println("Задумана буква от А до Z");
        System.out.print("Попытайтесь ее угадать: ");
        char b = in.next().charAt(0);
        while ((b = (char)System.in.read()) != answer) {
            System.out.print("Не угадал, ");

            if (ch < answer) System.out.println("нужная буква ближе к концу алфавита");
            else System.out.println("нужная буква ближе к началу алфавита");

            System.out.print("Вводи еще: ");
            System.in.read();
        }
        System.out.print("** Правильно! **");

    }
}
