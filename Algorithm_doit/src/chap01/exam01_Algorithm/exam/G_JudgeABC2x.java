package chap01.exam01_Algorithm.exam;

import java.util.Scanner;
public class G_JudgeABC2x {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요.: ");
        int n = sc.nextInt();

        if (n == 1)
            System.out.println("Ａ");
        else if (n == 2)
            System.out.println("Ｂ");
        else if (n == 3)
            System.out.println("Ｃ");
        else
            ;
    }
}
