import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 1;
        int b = 1;
        int n;
        int sum_fib;
        System.out.println("Введите количество чисел");
        n = in.nextInt();
        if (n<=100 && n>=2){
            for (int i = 0; i < n; i++) {
                sum_fib = a + b;
                a = b;
                b = sum_fib;
                System.out.print(sum_fib + " ");
            }
        }
        else
            System.out.println("Недопустимое количество");

    }
}

