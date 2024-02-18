import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел: ");
        int i = in.nextInt();
        int k = 1;
        if (i <= 0)
            System.out.println("Введено недопустимое число "+i+". Допустимый диапазон значений: 1 - 500");
        else {
            if (i > 500)
                System.out.println("Введено недопустимое число "+i+". Допустимый диапазон значений: 1 - 500");
            else {
                int r = 0;
                for(int j = 0; j < i; j++){
                    r += 7;
                    System.out.println(r);
                }
            }
        }
    }
}

