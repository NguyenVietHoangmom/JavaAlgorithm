import java.util.Scanner;

public class bai61den80 {
    public static float bai64(int a,int b) {
        float thuong = 0;
        thuong += (float) (-b) / a;
        return (thuong);
    }
    public static void bai65(int a,int b,int c) {
        double delta;
        double x1;
        double x2;
        if (a == 0) {
            System.out.println("nghiem la"+((float) -c / b));
    }
        if (a != 0) {
            delta = Math.pow(b, 2) - 4 * a * c;
            if (delta == 0) {
                System.out.println("pt co nghiem kep" + (-b / 2 * a));

            }
            if (delta < 0) {
                System.out.println("pt vo nghiem");
            }
            if (delta > 0) {
                System.out.println("pt co 2 nghiem pb");
                x1 = (-b + Math.sqrt(delta)) / 2 * a;
                x2 = (-b - Math.sqrt(delta)) / 2 * a;
                System.out.println(x1 + " " + x2);
            }
        }
    }

    public static int bai67(int x,int n) {
        int tong = 0;
        for (int i = 1; i <= n; i++) {
            tong += Math.pow(-1, i + 1) * Math.pow(x, i);
        }
        return tong;
    }
    public static int bai68(int n,int x, boolean isChanLe) {
        int tong = 0;
        for (int i = 1; i <= n; i++) {
            tong += Math.pow(-1, i) * Math.pow(x, isChanLe ? 2 * i : 2 * i + 1);
        }
        return tong;
    }
    public static float bai70(int n,boolean is70) {
        float x = 0;
        float tong=0;
        for (int i = 1; i <=n ; i++) {
            tong+=(float) (is70?(Math.pow(-1,i+1))*1/BaseMethod.tinhTongSoTu1DenN(i):((Math.pow(-1,i))*Math.pow(x,i))/BaseMethod.tinhTongSoTu1DenN(i));
        }
        return tong;
    }
    public static float bai72(int x,int n,boolean is72) {
        float tong=is72?0:1;
        for (int i = 1; i <= n; i++) {
            tong += (float)(is72?Math.pow(-1,i)*Math.pow(x,i)/BaseMethod.tinhGiaiThua(i)
                    :Math.pow(-1,i+1)*Math.pow(x,2*i)/BaseMethod.tinhGiaiThua(2*i));
        }
        return tong;
    }
    public static float bai74(int x,int n) {
        float tong = 1;
        for (int i =0; i <=n; i++) {
            tong+=Math.pow(-1,i+1)*((float)Math.pow(x,(2*i)+1)/BaseMethod.tinhGiaiThua(2*i+1));
        }
        return tong;
    }
    public static int bai75(int n,int k) {
        if (Math.pow(2, k) == n) {
            System.out.println("la so nguyen");
        }
        if (Math.pow(2, k) != n) {
            System.out.println("ko la so nguyen");
        }
        return k;
    }
}
