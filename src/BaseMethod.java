import java.util.Scanner;

public class BaseMethod {
    public static int nhapsonguyen(Scanner scanner, String chuoi) {
        System.out.println(chuoi);
        return scanner.nextInt();
    }

    public static float nhapsothuc(Scanner scanner, String chuoi) {
        System.out.println(chuoi);
        return scanner.nextFloat();
    }

    public static String hoten(Scanner scanner, String chuoi) {
        System.out.println(chuoi);
        return scanner.next();
    }
    public static String ho(Scanner scanner) {
        return BaseMethod.hoten(scanner,"moi ban nhap ho");
    }
    public static String ten(Scanner scanner) {
        return BaseMethod.hoten(scanner,"moi ban nhap ten");
    }
    public static int tinhGiaiThua(int n) {
        int tich = 1;
        for (int i = 1; i <= n; i++) {
            tich *= i;
        }
        return tich;
    }

    public static int tinhTongSoTu1DenN(int n) {
        int tong = 0;
        for (int i = 1; i <= n; i++) {
            tong += i;
        }
        return tong;
    }

    public static int ann(Scanner scanner) {
        return BaseMethod.nhapsonguyen(scanner, "moi ban nhap so n");
    }

    public static int anx(Scanner scanner) {
        return BaseMethod.nhapsonguyen(scanner, "moi ban nhap so x");
    }

    public static int ana(Scanner scanner) {
        return BaseMethod.nhapsonguyen(scanner, "moi ban nhap so a");
    }
    public static int anb(Scanner scanner) {
        return BaseMethod.nhapsonguyen(scanner, "moi ban nhap so b");
    }
    public static int anc(Scanner scanner) {
        return BaseMethod.nhapsonguyen(scanner, "moi ban nhap so c");
    }
    public static int ant(Scanner scanner) {
        return BaseMethod.nhapsonguyen(scanner, "moi ban nhap so t");
    }
    public static int ank(Scanner scanner) {
        return BaseMethod.nhapsonguyen(scanner, "moi ban nhap so k");
    }
    public static int any(Scanner scanner) {
        return BaseMethod.nhapsonguyen(scanner, "moi ban nhap so y");
    }
}
