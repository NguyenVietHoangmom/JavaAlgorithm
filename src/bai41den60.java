public class bai41den60 {
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

    public static int bai51(int n) {
        int sodu = 0;
        int max = 0;
        while (n > 0) {
            sodu = n % 10;
            if (max < sodu) {
                max = sodu;
            }
            n /= 10;
        }
        return max;
    }


    public static int bai52(int n) {
        int du = 0;
        int min = 1;
        if (n / 10 == 0) {
        }
        while (n > 0) {
            min = n % 10;
            du = n % 10;
            if (min < du) {
                min = du;
            }
            n /= 10;
        }
        return min;
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

    public static boolean bai56(int n) {

        boolean checkChan = false;
        while (n>0) {
            //buoc 1: tach chu so
            int character = n % 10;
            //buoc 2: kiem tra chan le
            if (character % 2 == 0) {
                checkChan=true;
                break;
            }
            //buoc 3: neu k phai chan, giam n
            n = n / 10;
        }
        return checkChan;

//        int du = n % 10;
//        while (n > 0) {
//            n /= 10;
//            if (n % 2 == 0)
//                System.out.println("co sochan");
//            if (n % 2 != 0)
//                System.out.println("full le");
//        }
//        return n ;
    }


    public static void bai57(int n) {
        int du = n % 10;
        while (n > 0) {
            n /= 10;
        }
        if (du % 2 == 0) {
            System.out.println("toan  so chan");
        }
        if (du % 2 != 0) {
            System.out.println("co so le");
        }
    }

    public static boolean bai59(int n) {
        boolean dao = true;
        int daonguoc = 0;
        while (n > 0) {
            int du = n % 10;
            daonguoc = (daonguoc * 10) + du;
            if (daonguoc - n == 0) {
                n /= 10;
                dao = false;
                break;
            }
        }
        return dao;
    }
}
