import java.util.Scanner;

public class TimGiaTriNhoNhat {
    public static int minValue(int[]mang) {
        int min = mang[0];
        int index = 0;
        for (int i = 1; i < mang.length; i++) {
            if (min > mang[i]) {
                min = mang[i];
                index = i;
            }
        }
        return  index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao do dai mang: ");
        int size = sc.nextInt();
        int[] mang = new int[size];
        System.out.println("Nhap gia tri vao mang: ");
        for (int i = 0; i < size; i++) {
           mang[i]=sc.nextInt();
        }
        int index = minValue(mang);
        System.out.println("Gia tri nho nhat trong mang la: "+ mang[index]);
    }
}
