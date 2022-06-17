import java.util.Scanner;

public class SquareGame {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Lütfen oynamak istediğiniz kare için kenar boyutu veriniz(tek sayı):");
        int dimention = inp.nextInt();
        int sayac = 0;
        System.out.println(" ");
        System.out.println("Oyununuzun ana ekranı aşağıdaki gibidir! ");
        System.out.println(" ");

        for (int i = 0; i < dimention; i++) {
            for (int j = 0; j < dimention; j++) {
                if ((i < (dimention - 1) / 2) || i > (dimention - 1) / 2
                        || (j < (dimention - 1) / 2) || (j > (dimention - 1) / 2)) {
                    System.out.print(" . ");
                } else {
                    System.out.print(" * ");
                }
            }
            System.out.println("");
        }
        System.out.println(" ");
        System.out.println("Lütfen yıldızı hareket ettirmek için aşağıdaki rakamları kullanınız:");
        System.out.println("     8     \n 4       6 \n     2    ");
        System.out.println(" ");


        int leftAndRight = (dimention - 1) / 2;
        int upAndDown = (dimention - 1) / 2;
        int x = 1;

        while (x == 1) {

            System.out.println("Yön seç:");
            int direction = inp.nextInt();
            if (direction == 8) {
                if (upAndDown == 0) {
                    upAndDown = dimention;
                }
                upAndDown--;
                for (int i = 0; i < dimention; i++) {
                    for (int j = 0; j < dimention; j++) {
                        if (i < upAndDown || i > upAndDown || j < leftAndRight || j > leftAndRight) {
                            System.out.print(" . ");
                        } else {
                            System.out.print(" * ");
                        }
                    }
                    System.out.println("");
                }
            } else if (direction == 2) {
                if (upAndDown == dimention - 1) {
                    upAndDown = -1;
                }
                upAndDown++;
                for (int i = 0; i < dimention; i++) {
                    for (int j = 0; j < dimention; j++) {
                        if (i < upAndDown || i > upAndDown || j < leftAndRight || j > leftAndRight) {
                            System.out.print(" . ");
                        } else {
                            System.out.print(" * ");
                        }
                    }
                    System.out.println("");
                }
            } else if (direction == 6) {
                if (leftAndRight == dimention - 1) {
                    leftAndRight = -1;
                }
                leftAndRight++;
                for (int i = 0; i < dimention; i++) {
                    for (int j = 0; j < dimention; j++) {
                        if (i < upAndDown || i > upAndDown || j < leftAndRight || j > leftAndRight) {
                            System.out.print(" . ");
                        } else {
                            System.out.print(" * ");
                        }
                    }
                    System.out.println("");
                }
            } else if (direction == 4) {
                if (leftAndRight == 0) {
                    leftAndRight = dimention;
                }
                leftAndRight--;
                for (int i = 0; i < dimention; i++) {
                    for (int j = 0; j < dimention; j++) {
                        if (i < upAndDown || i > upAndDown || j < leftAndRight || j > leftAndRight) {
                            System.out.print(" . ");
                        } else {
                            System.out.print(" * ");
                        }
                    }
                    System.out.println("");
                }
            } else
                System.out.println("Geçerli bir tuşa basınız!");
        }
    }
}








