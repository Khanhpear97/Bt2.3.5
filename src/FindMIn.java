import java.util.Scanner;

public class FindMIn {
    public static void main(String[] args) {
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap kich thuoc mang: ");
        int size = scanner.nextInt();
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhap phan tu thu " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        int min = getMin(arr);
        System.out.println("Phan tu nho nhat trong mang la: " + min);
    }
    public static int getMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
