package ss14_excercise_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IllegalTriangle {
    public static int illegalTriangle() throws IIlegalTriangleException {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        try {
            System.out.println("Nhập a :");
            a = scanner.nextInt();
            System.out.println("Nhập b :");
            b = scanner.nextInt();
            System.out.println("Nhập c:");
            c = scanner.nextInt();

            if (a + b < c && a + c < b && a + c < b) {
                throw new IIlegalTriangleException(); // ném
                // throw dùng cho phần thân của method để ném cho catch bắt
            }
            if (a < 0 || b < 0 || c < 0) {
                throw new InputMismatchException();
            }


        } catch (InputMismatchException e) {
            System.out.println("Bạn phải nhập số dương");

        } catch (IIlegalTriangleException e) // bắt
        {
            System.out.println("Bạn phải nhập tổng 2 số lớn số còn lại");
        } finally {
            System.out.println("Kết thúc chương trình");
        }
        return 10;

    }

    public static void main(String[] args) {
        try {
            System.out.println(illegalTriangle());
        } catch (IIlegalTriangleException e) {
            e.printStackTrace();
        }
    }
}
