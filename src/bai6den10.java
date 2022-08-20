import javax.swing.plaf.synth.SynthLookAndFeel;
import java.nio.FloatBuffer;
import java.util.Scanner;
public class bai6den10 {
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
    public static int bai10(int n,int x) {
        int luythua = 0;
        luythua += Math.pow(x, n);
        return luythua;
    }
}















