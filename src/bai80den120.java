import java.util.Scanner;

public class bai80den120 {
    public static int bai82(int a, int b, int c) {

        int max = a;
        if (max < b) max = b;
        if (max < c) max = c;
        return max;
    }

    public static String bai83( float a, float b) {
        if (a * b > 0) {
            return (" cung dau");
        }
        if (a * b < 0) {
            return (" trai dau");
        }
        return ("cung dau,trai dau");
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

    public static String bai97(int a, int b, int c) {
        if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)) {
            return ("tam raz vuong");
        }
        if (a == b && b == c && c == a) {
            return ("la tam giac deu");
        }
        if (a == b && a!= c && b != c) {
            return ("la tam giac can");
        }
        return  ("tam giac thg");
        }

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
        can = Math.pow(x,(float)(1 / n));
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

  public static float bai115(String ho,String ten,float n ,float x){
        float dtb ;
        dtb = (n+x)/2;
      System.out.println(ho + " " + ten + "  Dien trung binh : ");
      return dtb;
  }

    public static void bai120(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                if (Math.sqrt(i) == j) {
                    System.out.println(j);
                }
            }
        }
    }
}




