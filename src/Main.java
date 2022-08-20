import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int so = BaseMethod.nhapsonguyen(scanner, "moi bn nhap baon");
        switch (so) {
            case 6 -> {
                System.out.println(bai6den10.bai6(BaseMethod.ann(scanner)));
            }
            case 7 -> {
                System.out.println(bai6den10.bai7(BaseMethod.ann(scanner)));
            }
            case 8 -> {
                System.out.println(bai6den10.bai8(BaseMethod.ann(scanner)));
            }
            case 9 -> {
                System.out.println(bai6den10.bai9(BaseMethod.ann(scanner)));
            }
            case 10 -> System.out.println(bai6den10.bai10(BaseMethod.ann(scanner),BaseMethod.anx(scanner)));
            case 11 -> {
                System.out.println(bai11den20.bai11(BaseMethod.ann(scanner)));
            }
            case 12 -> {
                System.out.println(bai11den20.bai12(BaseMethod.ann(scanner), (BaseMethod.anx(scanner))));
            }
            case 13 -> {
                System.out.println(bai11den20.bai13(BaseMethod.ann(scanner), (BaseMethod.anx(scanner))));
            }
            case 14 -> {
                System.out.println(bai11den20.bai14(BaseMethod.ann(scanner), (BaseMethod.anx(scanner))));
            }
            case 15 -> System.out.println(bai11den20.bai15(BaseMethod.ann(scanner), BaseMethod.anx(scanner), true));
            case 16 -> System.out.println(bai11den20.bai15(BaseMethod.ann(scanner), BaseMethod.anx(scanner), false));
            case 17 -> {
                System.out.println(bai11den20.bai17(BaseMethod.ann(scanner), (BaseMethod.anx(scanner))));
            }
            case 18 -> {
                System.out.println(bai11den20.bai18(BaseMethod.ann(scanner), BaseMethod.anx(scanner), true));
            }
            case 19 -> {
                System.out.println(bai11den20.bai18(BaseMethod.ann(scanner), BaseMethod.anx(scanner), false));
            }
            case 20 -> {
                bai11den20.bai20(BaseMethod.ann(scanner));
            }
            case 21 -> {
                System.out.println(bai21den40.bai21(BaseMethod.ann(scanner), true));
            }
            case 22 -> {
                System.out.println(bai21den40.bai21(BaseMethod.ann(scanner), false));
            }
            case 23 -> {
                bai21den40.bai23(BaseMethod.ann(scanner));
            }
            case 24 -> {
                bai21den40.bai24(BaseMethod.ann(scanner));
            }
            case 25 -> {
                System.out.println(bai21den40.bai25(BaseMethod.ann(scanner)));
            }
            case 26 -> {
                System.out.println(bai21den40.bai26(BaseMethod.ann(scanner)));
            }
            case 27 -> {
                System.out.println(bai21den40.bai27(BaseMethod.ann(scanner)));
            }
            case 28 -> {
                System.out.println(bai21den40.bai28(BaseMethod.ann(scanner)));
            }
            case 29 -> {
                System.out.println(bai21den40.bai29(BaseMethod.ann(scanner)));
            }
            case 30 -> {
                System.out.println(!bai21den40.bai30(BaseMethod.ann(scanner)) ? "so hoan thien" : "ko hoan thien");
            }
            case 32 -> {
//                bai21den40.bai32(BaseMethod.ann(scanner));
            }
            case 31 -> {
               bai21den40.bai31(BaseMethod.ann(scanner));
            }
            case 33 -> {
                System.out.println(bai21den40.bai33(BaseMethod.ann(scanner)));
            }
            case 34 -> {
                System.out.println(bai21den40.bai34(BaseMethod.ann(scanner)));
            }
            case 35 -> {
                System.out.println(bai21den40.bai35(BaseMethod.ann(scanner)));
            }
            case 36 -> {
                System.out.println(bai21den40.bai36(BaseMethod.ann(scanner)));
            }
            case 37 -> {
                System.out.println(bai21den40.bai37(BaseMethod.ann(scanner)));
            }
            case 38 -> {
                System.out.println(bai21den40.bai38(BaseMethod.ann(scanner)));
            }
            case 39 -> {
                System.out.println(bai21den40.bai39(BaseMethod.ann(scanner)));
            }
            case 40 -> {
                System.out.println(bai21den40.bai40(BaseMethod.ann(scanner), BaseMethod.anx(scanner)));
            }
            case 43 -> {
                bai41den60.bai43(BaseMethod.ann(scanner));
            }
            case 44 -> {
                System.out.println(bai41den60.bai44(BaseMethod.ann(scanner)));
            }
            case 45 -> {
                System.out.println(bai41den60.bai45(BaseMethod.ann(scanner)));
            }
            case 46 -> {
                bai41den60.bai46(BaseMethod.ann(scanner));
            }
            case 47 -> {
                System.out.println(bai41den60.bai47(BaseMethod.ann(scanner), true));
            }
            case 48 -> {
                System.out.println(bai41den60.bai47(BaseMethod.ann(scanner), false));
            }
            case 49 -> {
                bai41den60.bai49(BaseMethod.ann(scanner));
            }
            case 50 -> {
                bai41den60.bai50(BaseMethod.ann(scanner));
            }
            case 51 -> {
                System.out.println(bai41den60.bai51(BaseMethod.ann(scanner)));
            }
            case 52 -> {
                System.out.println(bai41den60.bai52(BaseMethod.ann(scanner)));
            }
            case 53 -> {
                System.out.println(bai41den60.bai53(BaseMethod.ann(scanner)));
            }
            case 54 -> {
                System.out.println(bai41den60.bai54(BaseMethod.ann(scanner)));
            }
            case 56 -> {
                System.out.println(bai41den60.bai56(BaseMethod.ann(scanner)));
            }
            case 57 -> {
                bai41den60.bai57(BaseMethod.ann(scanner));
            }
            case 59 -> {
                System.out.println(bai41den60.bai59(BaseMethod.ann(scanner))?"c0":"sai");
            }
            case 64 -> {
                System.out.println(bai61den80.bai64(BaseMethod.ana(scanner),BaseMethod.anb(scanner)));
            }
            case 65 -> {
                bai61den80.bai65(BaseMethod.ana(scanner),BaseMethod.anb(scanner),BaseMethod.anc(scanner));
            }
            case 67 -> {
                System.out.println(bai61den80.bai67(BaseMethod.ann(scanner), BaseMethod.anx(scanner)));
            }
            case 68 -> {
                System.out.println(bai61den80.bai68(BaseMethod.ann(scanner), BaseMethod.anx(scanner), true));
            }
            case 69 -> {
                System.out.println(bai61den80.bai68(BaseMethod.ann(scanner), BaseMethod.anx(scanner), false));
            }
            case 70 -> {
                System.out.println(bai61den80.bai70(BaseMethod.ann(scanner), true));
            }
            case 71 -> {
                System.out.println(bai61den80.bai70(BaseMethod.ann(scanner), false));
            }
            case 72 -> {
                System.out.println(bai61den80.bai72(BaseMethod.ann(scanner), BaseMethod.anx(scanner), true));
            }
            case 73 -> {
                System.out.println(bai61den80.bai72(BaseMethod.ann(scanner), BaseMethod.anx(scanner), false));
            }
            case 74 -> {
                System.out.println(bai61den80.bai74(BaseMethod.ann(scanner), BaseMethod.anx(scanner)));
            }
            case 75 -> {

                System.out.println(bai61den80.bai75(BaseMethod.ann(scanner),BaseMethod.ank(scanner)));
            }
            case 82 -> {
                System.out.println(bai80den120.bai82(BaseMethod.ana(scanner),BaseMethod.anb(scanner),BaseMethod.anc(scanner)));
            }
            case 83 -> {
                System.out.println( bai80den120.bai83(BaseMethod.ana(scanner),BaseMethod.anb(scanner)));
            }
            case 85 -> bai80den120.bai85(scanner);
            case 86 -> {
                System.out.println(bai80den120.bai86(BaseMethod.ann(scanner)));
            }
            case 88 -> bai80den120.bai88(scanner);
            case 89 -> {
                System.out.println(bai80den120.bai89(BaseMethod.ann(scanner)));
            }
            case 90 -> {
                bai80den120.bai90(BaseMethod.ann(scanner));
            }
            case 91 -> bai80den120.bai91(scanner);
            case 92 -> {
                System.out.println(bai80den120.bai92(BaseMethod.ana(scanner),BaseMethod.anb(scanner)));
            }
            case 94 -> bai80den120.bai94(scanner);
            case 96 -> {
                System.out.println(bai80den120.bai96(BaseMethod.anx(scanner)));
            }
            case 97 ->
                System.out.println(bai80den120.bai97(BaseMethod.ana(scanner),BaseMethod.anb(scanner),BaseMethod.anc(scanner)));

            case 101 -> {
                bai80den120.bai101(BaseMethod.ann(scanner),BaseMethod.ant(scanner));
            }
            case 105 -> {
                bai80den120.bai105(BaseMethod.ann(scanner));
            }
            case 106 -> {
                bai80den120.bai106(BaseMethod.ann(scanner));
            }
            case 107 -> {
                System.out.println(bai80den120.bai107(BaseMethod.ann(scanner), BaseMethod.anx(scanner)));
            }
            case 108 -> {
                System.out.println(bai80den120.bai108(BaseMethod.anx(scanner),BaseMethod.any(scanner)));
            }
            case 109 -> {
                bai80den120.bai109(BaseMethod.ann(scanner));
            }
            case 111 -> {
                bai80den120.bai111(BaseMethod.ann(scanner));
            }
            case 113 -> {
                System.out.println(bai80den120.bai113(BaseMethod.ann(scanner), BaseMethod.anx(scanner)));
            }
            case 115 -> System.out.println(bai80den120.bai115(BaseMethod.ho(scanner),BaseMethod.ten(scanner),BaseMethod.ann(scanner),BaseMethod.ann(scanner)));
            case 121 -> bai80den120.bai121(scanner);
            case 122 -> bai80den120.bai122(scanner);
            case 120 -> bai80den120.bai120(BaseMethod.ann(scanner));
        }
    }
}
