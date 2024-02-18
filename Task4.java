import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите натуральное число: ");
        int ch = in.nextInt();
        boolean f = true;
        int i;
        for(i=2; i<ch ;i++)
        {
            if (ch%i==0) {
                f = false;
                break;
            }
        }
        if (f)
            System.out.println("ДА");
        else
            System.out.println("НЕТ ");
    }
}

