import java.util.Scanner;

public class bai1den120 {
    public static float bai6(int n) {
        float tong = 0;
        for (int i = 1; i <= n; i++) {
            tong += (float) 1 / (i * (i + 1));
        }
        return tong;
    }

    public static float bai7(int n) {
        float tong = 0;
        for (int i = 1; i <= n; i++) {
            tong += (float) i / (i + 1);
        }
        return tong;
    }

    public static float bai8(int n) {
        float tong = 0;
        for (int i = 0; i <= n; i++) {
            tong += (float) (2 * i + 1) / (2 * i + 2);
        }
        return tong;
    }

    public static int bai9(int n) {
        int tich = 1;
        for (int i = 1; i <= n; i++) {
            tich *= i;
        }
        return tich;
    }

    public static int bai10(Scanner scanner) {
        int n = BaseMethod.nhapsonguyen(scanner, "moi ban nhap so n");
        int x = BaseMethod.nhapsonguyen(scanner, "moi ban nhap so x");
        int luythua = 0;
        luythua += Math.pow(x, n);
        return luythua;
    }

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
                if (tong == n) {
                    sohoanthien = false;
                    break;
                }
            }
        }
        return sohoanthien;
    }

    public static boolean bai31(int n) {
        boolean songuyento = true;
        int dem = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {


            } else songuyento = false;
        }
        dem++;
        return songuyento;
    }

    public static void bai32(int n) {
        for (int i = 1; i <= n; i++) {
            if (Math.sqrt(n) == i) {
                System.out.println("la so chinh phuong");
            }
        }
    }

    public static double bai33(double n) {
        double tong = 0;
        for (int i = 1; i <= n; i++) {
            tong += 2;
            tong = Math.sqrt(tong);
        }
        return tong;
    }

    public static double bai34(double n) {
        double tong = 0;
        for (int i = 1; i <= n; i++) {
            tong += i;
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
            tong += BaseMethod.tinhGiaiThua(i);
            tong = Math.pow(tong, (float) (1 / (i + 1)));
        }
        return tong;
    }

    public static double bai40(double x, double n) {
        double tong = 0;
        for (int i = 1; i <= n; i++) {
            tong += Math.pow(x, i);
            tong = Math.sqrt(tong);
        }
        return tong;
    }

    public static void bai43(int n) {
        int dem = 0;
        while (n > 0) {
            n /= 10;
            dem++;
        }
        System.out.println(dem);
    }

    public static int bai44(int n) {
        int tong = 0;
        int du = 0;
        while (n > 0) {
            du = n % 10;
            tong += du;
            n /= 10;
        }
        return (tong);
    }

    public static int bai45(int n) {
        int tich = 1;
        int du = 0;
        while (n > 0) {
            du = n % 10;
            tich *= du;
            n /= 10;
        }
        return tich;
    }

    public static void bai46(int n) {
        int dem = 0;
        int du = 0;
        while (0 < n) {
            du = n % 10;
            if (du % 2 != 0) {
                dem++;
            }
            n /= 10;
        }
        System.out.println(dem);
    }

    public static int bai47(int n, boolean idchanle) {
        int tong = 0;
        int du = 0;
        while (n > 0) {
            du = n % 10;
            if (du % 2 == 0) {
                tong += du;
            }
            n /= 10;
        }
        return tong;
    }

    public static int bai48(int n) {
        int tich = 1;
        int du = 0;
        while (n > 0) {
            du = n % 10;
            if (n % 2 != 0) {
                tich *= du;
            }
            n /= 10;
        }
        return (tich);
    }

    public static void bai49(int n) {
        int du = 0;
        while (n > 0) {
            du = n % 10;
            n /= 10;
        }
        System.out.println(du);
    }

    public static void bai50(int n) {
        int daonguoc = 0;
        int du = 0;
        while (n > 0) {
            du = n % 10;
            daonguoc = daonguoc * 10 + du;
            n /= 10;
        }
        System.out.println(daonguoc);
    }

    public static void bai51(int n) {
        int du = 0;
        int max = 0;
        while (n > 0) {
            du = n % 10;
            if (max < du) {
                max = du;
            }
            n /= 10;
        }
        System.out.println(max);
    }

    public static void bai52(int n) {
        int du = 0;
        int min = 0;
        while (n > 0) {
            du = n % 10;
            if (min < du) {
                min = du;
            }
            n /= 10;
        }
        System.out.println(min);
    }

    public static int bai53(int n) {
        int dem = 0;
        int max = 0;
        while (n > 0) {
            int du = n % 10;
            if (max < du) {
                max = du;
            }
            if (max == du) {
            }
            dem++;
        }
        return dem;
    }

    public static int bai54(int n) {
        int dem = 0;
        int max = 0;
        while (n > 0) {
            int c = n % 10;
            if (max < c) {
                max = c;
            }
            if (c == max) ;
            {
                dem++;
            }
            n /= 10;
        }
        return dem;
    }

    public static void bai56(int n) {
        int du = n % 10;
        while (n > 0) {
            n /= 10;
        }
        if (du % 2 != 0) {
            System.out.println("toan so le");
        }
        if (du % 2 == 0) {
            System.out.println("co so chan");
        }
    }

    public static void bai57(int n) {
        int du = n % 10;
        while (n > 0) {
            n /= 10;
        }
        if (du % 2 == 0) {
            System.out.println("toan so chan");
        }
        if (du % 2 != 0) {
            System.out.println("co so le");
        }
    }

    public static void bai59(int n) {
        int daonguoc = 0;
        int du = 0;
        while (n > 0) {
            du = n % 10;
            if (daonguoc == n) {
                System.out.println("la so doi xung");
                n /= 10;
            }
        }
    }
        public static float bai64(int a, int b) {
            float thuong = 0;
            thuong += (float) (-b) / a;
            return (thuong);
        }

        public static void bai65(int a, int b, int c) {
            double delta;
            double x1;
            double x2;
            if (a == 0) {
                System.out.println("nghiem la" + ((float) -c / b));
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

        public static int bai67(int x, int n) {
            int tong = 0;
            for (int i = 1; i <= n; i++) {
                tong += Math.pow(-1, i + 1) * Math.pow(x, i);
            }
            return tong;
        }

        public static int bai68(int n, int x, boolean isChanLe) {
            int tong = 0;
            for (int i = 1; i <= n; i++) {
                tong += Math.pow(-1, i) * Math.pow(x, isChanLe ? 2 * i : 2 * i + 1);
            }
            return tong;
        }

        public static float bai70(int n, boolean is70) {
            float x = 0;
            if (!is70) {
            }
            float tong = 0;
            for (int i = 1; i <= n; i++) {
                tong += (float) (is70 ? (Math.pow(-1, i + 1)) * 1 / BaseMethod.tinhTongSoTu1DenN(i) : ((Math.pow(-1, i)) * Math.pow(x, i)) / BaseMethod.tinhTongSoTu1DenN(i));
            }
            return tong;
        }

        public static float bai73(Scanner scanner) {
            float n = BaseMethod.nhapsonguyen(scanner, "moi ban nhap so n");
            float x = BaseMethod.nhapsonguyen(scanner, "moi ban nhap so x");
            float tong = 0;
            for (int i = 0; i <= n; i++) {
                tong += Math.pow(-1, i + 1) * ((float) Math.pow(x, 2 * i) / BaseMethod.tinhGiaiThua(2 * i));
            }
            return tong;
        }

        public static float bai72(int x, int n, boolean is72) {
            if (is72) {
            }
            float tong = is72 ? 0 : 1;
            for (int i = 1; i <= n; i++) {
                tong += (float) (is72 ? Math.pow(-1, i) * Math.pow(x, i) / BaseMethod.tinhGiaiThua(i)
                        : Math.pow(-1, i + 1) * Math.pow(x, 2 * i) / BaseMethod.tinhGiaiThua(2 * i));
            }
            return tong;
        }

        public static float bai74(int x, int n) {
            float tong = 1;
            for (int i = 0; i <= n; i++) {
                tong += Math.pow(-1, i + 1) * ((float) Math.pow(x, (2 * i) + 1) / BaseMethod.tinhGiaiThua(2 * i + 1));
            }
            return tong;
        }

        public static int bai75(int n, int k) {
            if (Math.pow(2, k) == n) {
                System.out.println("la so nguyen");
            }
            if (Math.pow(2, k) != n) {
                System.out.println("ko la so nguyen");
            }
            return k;
        }
    public static void bai82(int a, int b, int c) {

        int max = a;
        if (max < b) max = b;
        if (max < c) max = c;
        System.out.println("Max la: " + max);
    }

    public static void bai83(int a, int b) {

        if (a * b > 0) {
            System.out.println("a,b cung dau");
        } else System.out.println("a,b trai dau");
    }

    public static void bai85(Scanner scanner) {
        int t = BaseMethod.nhapsonguyen(scanner, "moi ban nhap so t ");
        switch (t) {
            case 1, 2, 3 -> System.out.println("quy 1");
            case 4, 5, 6 -> System.out.println("quy 2");
            case 7, 8, 9 -> System.out.println("quy 3");
            case 10, 11, 12 -> System.out.println("quy 4");
        }
    }

    public static int bai86(int n) {
        int tong = 0;
        for (int i = 1; i <= n; i++) {
            tong += Math.pow(i, 3);
        }
        return tong;
    }

    public static void bai88(Scanner scanner) {
        char chucai;
        for (chucai = 'A'; chucai <= 'Z'; ++chucai) {
            System.out.println(chucai + " ");
        }
    }

    public static int bai89(int n) {
        int tong = 0;
        for (int i = 1; i <= n; i += 2) {
            tong += i;
        }
        return tong;
    }

    public static void bai90(int n) {
        int tong = 0;
        int max = 0;
        for (int i = 1; i <= n; i++) {
            tong += i;
            if (tong < n) {
                max = i;
            }
        }
        System.out.println(max);
    }

    public static void bai91(Scanner scanner) {
        for (int i = 1; i < 100; i += 2) {
            System.out.println(i);
        }
    }

    public static int bai92(int a, int b) {
        int uoc = 1;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                if (b % i == 0) {
                }
                uoc = i;
            }
        }
        return uoc;
    }

    public static void bai94(Scanner scanner) {

        for (int i = 1; i < 100; i += 2) {
            if (i != 5 && i != 7 && i != 93) {
                System.out.println(i);
            }
        }
    }

    public static int bai96(int x) {
        int tong = 0;
        if (x >= 5) {
            tong += 2 * Math.pow(x, 2) + 5 * x + 9;
        }
        if (x < 5) {
            tong += -2 * Math.pow(x, 2) + 4 * x - 9;
        }
        return tong;
    }

    public static void bai97(int a, int b, int c) {
        if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)) {
            System.out.println("la tam giac vuong");
        }
        if (a == b && b == c && c == a) {
            System.out.println("la tam giac deu");
        }
        if (a != b && a != c && b != c) {
            System.out.println("la tam giac thuong");
        }
    }
    //  public static int bai98(int a,int b,int c,int d,int e,int f){

//    }


    public static void bai101(int n, int t) {
        if (t == 2 && n % 4 == 0) {
            System.out.println("thang  co 29  ");
        }
        if (t == 2 && n % 4 != 0) {
            System.out.println("thang  co 28  ");
        }
        if (t == 1 || t == 3 || t == 5 || t == 7 || t == 8 || t == 10 || t == 12) {
            System.out.println("thang co 31 ngay");
        }
        if (t == 4 || t == 6 || t == 9 || t == 11) {
            System.out.println("thang co 30 ngay");
        }
    }

    public static void bai105(int n) {
        int chuc = 0;
        int dvi = 0;
        chuc = n / 10;
        dvi = n % 10;
        switch (chuc) {
            case 1 -> System.out.print("mot");
            case 2 -> System.out.print("hai");
            case 3 -> System.out.print("ba");
            case 4 -> System.out.print("bon");
            case 5 -> System.out.print("nam");
            case 6 -> System.out.print("sau");
            case 7 -> System.out.print("bay");
            case 8 -> System.out.print("tam");
            case 9 -> System.out.print("chin");
        }
        if (chuc == 1) {
        } else System.out.print("muoi");
        switch (dvi) {
            case 0 -> System.out.print("ko");
            case 1 -> System.out.print("mot");
            case 2 -> System.out.print("hai");
            case 3 -> System.out.print("ba");
            case 4 -> System.out.print("bon");
            case 5 -> System.out.print("nam");
            case 6 -> System.out.print("sau");
            case 7 -> System.out.print("bay");
            case 8 -> System.out.print("tam");
            case 9 -> System.out.print("chin");
        }
    }

    public static void bai106(int n) {
        int tram;
        tram = n / 100;
        switch (tram) {
            case 1 -> System.out.print("mot");
            case 2 -> System.out.print("hai");
            case 3 -> System.out.print("ba");
            case 4 -> System.out.print("bon");
            case 5 -> System.out.print("nam");
            case 6 -> System.out.print("sau");
            case 7 -> System.out.print("bay");
            case 8 -> System.out.print("tam");
            case 9 -> System.out.print("chin");
        }
        System.out.print("tram");

        if (n % 100 == 0) {
            System.out.print("");
        } else {
            int chuc = (n / 10) % 10;
            switch (chuc) {
                case 0 -> System.out.print("linh");
                case 2 -> System.out.print("hai ");
                case 3 -> System.out.print("ba ");
                case 4 -> System.out.print("bon");
                case 5 -> System.out.print("nam");
                case 6 -> System.out.print("sau");
                case 7 -> System.out.print("bay");
                case 8 -> System.out.print("tam");
                case 9 -> System.out.print("chin");
            }
            if (chuc == 0) {
                System.out.println("link");
            } else {
                System.out.println("muoi");
            }
            int dvi = n % 10;
            n /= 10;
            switch (dvi) {
                case 1 -> System.out.print("mot");
                case 2 -> System.out.print("hai");
                case 3 -> System.out.print("ba");
                case 4 -> System.out.print("bon");
                case 5 -> System.out.print("nam");
                case 6 -> System.out.print("sau");
                case 7 -> System.out.print("bay");
                case 8 -> System.out.print("tam");
                case 9 -> System.out.print("chin");
            }
        }
    }

    public static double bai107(int n, int x) {
        double can = 0;
        can = Math.pow(x, 1 / n);
        return (can);
    }

    public static int bai108(int x, int y) {
        int luythua = 0;
        luythua += Math.pow(x, y);
        return luythua;
    }

    public static void bai109(int n) {
        int tich = 0;
        for (int i = 1; i <= 10; i++) {
            tich = n * i;
            System.out.println(n + " * " + i + " = " + tich);
        }
    }

    public static void bai111(int n) {


        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }

    public static void bai121(Scanner scanner) {
        int n = BaseMethod.nhapsonguyen(scanner, "moi ban nhap so n");
        for (int i = 1; i <= n; i++) {
            for (int k = n; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j < i * 2 - 1; j++) {
                if (i == 1 || i == n || j == 1 || j == i) {
                    System.out.println("*");
                } else System.out.println("*");
                System.out.print("*");
                System.out.println("*");
            }
        }
    }

    public static void bai122(Scanner scanner) {
        int n = BaseMethod.nhapsonguyen(scanner, "moi ban nhap chieu dai");
        int x = BaseMethod.nhapsonguyen(scanner, "moi  ban nhapm chieu rong");
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(" * ");
            }
            System.out.println(" * ");
        }
    }

    public static float bai113(int n, int x) {
        float tong = 0;
        for (int i = 0; i <= n; i++) {
            tong += Math.pow(-1, i) * (float) Math.pow(x, 2 * i + 1) / tich(2 * i + 1);
        }
        return tong;
    }

    public static float tich(float n) {
        int tich = 1;
        for (int i = 1; i <= n; i++) {
            tich *= i;
        }
        return tich;
    }

    public static void bai115(Scanner scanner) {
        String ho = BaseMethod.hoten(scanner, "moi ban nhap ho");
        String ten = BaseMethod.hoten(scanner, "moi ban nhap ten");
        int n = BaseMethod.nhapsonguyen(scanner, "moi ban nhap so n");
        int x = BaseMethod.nhapsonguyen(scanner, "moi ban nhap so x");
        int diemtb = 0;
        diemtb += (float) (n + x) / 2;
        System.out.println(ho + " " + ten + "  Dien trung binh : " + diemtb);
    }
    }



