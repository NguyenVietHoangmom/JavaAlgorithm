import java.util.Scanner;

public class bai21den40 {
    public static int bai21(int n, boolean isTong) {
        int ketqua = isTong ? 0 : 1;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                ketqua = isTong ? (ketqua + i) : (ketqua * i);
            }
        }
        return ketqua;
    }

    public static void bai23(int n) {
        int dem = 0;
        for (int j = 1; j <= n; j++) {
            if (n % j == 0) {
                dem++;
            }
        }
        System.out.println(dem);
    }

    public static void bai24(int n) {
        for (int i = 1; i <= n; i += 2) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }

    public static int bai25(int n) {
        int tong = 0;
        for (int i = 2; i <= n; i += 2) {
            if (n % i == 0) {
                tong += i;
            }
        }
        return tong;
    }

    public static int bai26(int n) {
        int tich = 1;
        for (int i = 1; i <= n; i += 2) {
            if (n % i == 0) {
                tich *= i;
            }
        }
        return tich;
    }

    public static int bai27(int n) {
        int dem = 0;
        for (int i = 2; i <= n; i += 2) {
            if (n % i == 0)
                dem++;
        }
        return dem;
    }

    public static int bai28(int n) {
        int tong = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                tong += i;
            }
        }
        return tong;
    }

    public static int bai29(int n) {
        int start = n % 2 == 0 ? n - 1 : n;
        for (int i = start; i >= 1; i -= 2) {
            if (n % i == 0) {
                return i;
            }
        }
        return n;
    }

    public static boolean bai30(int n) {
        boolean sohoanthien = true;
        int tong = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                tong += i;
            }
        }
        if (tong == n) {
            sohoanthien = false;
        }
        return sohoanthien;
    }

    public static void bai31(int n) {
        int dem = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                dem++;
            }
        }
        if (dem == 2) {
            System.out.println("la so nguyen to");
        }
        if (dem != 2) {
            System.out.println("ko la so nguyen to");
        }

    }


    public static double bai33(int n) {
        double tong = 0;
        for (int i = 1; i <= n; i++) {
            //bươc 1: cộng tổng với 2
            tong += 2;

            // bước 2: căn tất cả tổng
            tong = Math.sqrt(tong);
        }
        return tong;
    }

    public static double bai34(double n) {
        double tong = 0;
        for (int i = 1; i <= n; i++) {
            // bước 1: cộng tổng voi i
            tong += i;

            //
            tong = Math.sqrt(tong);
        }
        return tong;
    }

    public static double bai35(double n) {
        double tong = 0;
        for (int i = 0; i < n; i++) {
            tong += n - i;
            tong = Math.sqrt(tong);
        }
        return tong;
    }

    public static double bai36(double n) {
        double tong = 0;
        for (int i = 1; i <= n; i++) {
            tong += BaseMethod.tinhGiaiThua(i);
            tong = Math.sqrt(tong);
        }
        return tong;
    }

    public static double bai37(int n) {
        double tong = 0;
        for (int i = 2; i <= n; i++) {
            tong += i;
            tong = (float) Math.pow(tong, (float) 1 / i);
        }
        return tong;
    }

    public static double bai38(double n) {
        double tong = 0;
        for (int i = 2; i <= n; i++) {
            tong += i;
            tong = Math.pow(tong, (float) 1 / (i + 1));
        }
        return tong;
    }

    public static double bai39(double n) {
        double tong = 0;
        for (int i = 1; i <= n; i++) {
            //
            tong += BaseMethod.tinhGiaiThua(i);

            //
            tong = Math.pow(tong, (float) (1 / (i + 1)));
        }
        return tong;
    }

    public static double bai40(double x, double n) {
        double tong = 0;
        for (int i = 1; i <= n; i++) {

            // bươc 1: cong tong voi x mu i
            tong += Math.pow(x, i);

            //buoc 2: can cả tong
            tong = Math.sqrt(tong);
        }
        return tong;
    }
}
