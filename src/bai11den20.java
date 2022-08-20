import java.util.Scanner;

public class bai11den20 {
    public static int bai11(int n) {
        int tong = 0;
        for (int i = 1; i <= n; i++) {
            tong += BaseMethod.tinhGiaiThua(i);
        }
        return tong;
    }
    public static int bai12(int n,int x) {
        int tong = 0;
        for (int i = 1; i <= n; i++) {
            tong += Math.pow(x, i);
        }
        return tong;
    }
    public static int bai13(int x,int n) {
        int tong = 0;
        for (int i = 1; i <= n; i++) {
            tong += Math.pow(x, 2 * i);
        }
        return tong;
    }
    public static int bai14(int x,int n) {

        int tong = 0;
        for (int i = 0; i <= n; i++) {
            tong += Math.pow(x, (2 * i) + 1);
        }
        return tong;
    }
    public static float bai15(int n,int x , boolean is15) {
        float tong = 0;
        for (int i = 1; i <= n; i++) {
            tong += (float) (is15 ? 1 : Math.pow(x, i)) / BaseMethod.tinhTongSoTu1DenN(i);
        }
        return tong;
    }
    public static float bai17(int x,int n) {
        float tong = 0;
        for (int i = 1; i <= n; i++) {
            tong += (float) Math.pow(x, i) / BaseMethod.tinhGiaiThua(i);
        }
        return tong;
    }
    public static float bai18 (int x,int n,boolean is18) {
        float tong = is18?0:1;
        for (int i = 0; i <= n; i++) {
            tong += (float) (is18?Math.pow(x,2*i)/BaseMethod.tinhGiaiThua(2*i):Math.pow(x,2*i+1)/BaseMethod.tinhGiaiThua(2*i+1));
        }
        return tong;
    }

    public static void bai20(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }
}
