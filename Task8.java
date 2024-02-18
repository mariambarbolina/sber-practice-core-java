import java.util.Scanner;
import java.util.Arrays;
public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[30];
        for (int i = 0; i<arr.length; i++){
            arr[i] = (int)(Math.random()*1000);
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++ ){
            for (int j = 0; j < (arr.length-1)-i; j++){
                if (arr[j] > arr[j+1]){
                    int buf = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
