import java.util.Arrays;
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int j=0;
        double sum=0;
        int[] arr = new int[100];
        for (int i = 0; i<arr.length; i++){
            arr[i] = (int)(Math.random()*1000);
            if (arr[i]>max) {
                max = arr[i];
                j = i;
            }
            sum = sum + arr[i];
        }
        System.out.println("Максимальное значение = "+max+" находится в элементе под индексом "+j);
        System.out.println("Среднее значение = "+sum/arr.length);
    }
}

