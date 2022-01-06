import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập size mảng: ");
        int size = sc.nextInt();

        int [] arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.print("Nhập phần tử " + i);
            arr[i] = sc.nextInt();
            i++;
        }
        System.out.println("mảng được nhập");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
        System.out.print("\nNhập phần tử cần xóa");
        int num = sc.nextInt();
        int index = timViTri(num, arr);

        System.out.println(index);

        int [] newArr = xoaPhantu(index, arr);

        System.out.println("mảng đã xóa");
        for (int j = 0; j < newArr.length; j++) {
            System.out.print(newArr[j] + "\t");
        }
    }

    public static int timViTri(int num, int[] arr) {
        int index = -1;
        for (int i = 0; i< arr.length; i++) {
            if (arr[i] == num) {
                index = i;
                break;
            }
        }
        return index;
    }
    public static int[] xoaPhantu(int index, int[] arr) {
        int[]newArr = new int[arr.length-1];
        for (int i = 0; i < newArr.length; i++) {

            if (i < index) {
                newArr[i] = arr[i];
            }
            else {
                newArr[i] = arr[i+1];
            }
        }
        return newArr;
    }

}
