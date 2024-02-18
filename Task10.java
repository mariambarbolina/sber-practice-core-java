import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите Ваше имя: ");
        String name = in.nextLine();
        javax.swing.JOptionPane.showMessageDialog(null, "Привет, "+name);
    }
}
