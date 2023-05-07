package chap02.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ex06 {
    //--- 정숫값 x를 r 진수로 변환하여 배열 d에 아랫자리부터 저장하고 자릿수를 반환 ---//
    static int cardConvEx(int x, int r, char[] d) {
        int n = ((Integer)x).toString().length();		// 변환 전의 자릿수
        int digits = 0;								// 변환 후의 자릿수
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.printf(String.format("%%2d | %%%dd\n",n),r,x);
        do{
            System.out.printf("   +");
            for(int i = 0; i<n+2; i++){
                System.out.print('-');
            }
            System.out.println();

            if(x/r != 0){
                System.out.printf(String.format("%%2d | %%%dd    ... %%d\n", n),r, x / r, x % r);
            }else{
                System.out.printf(String.format("     %%%dd    ... %%d\n", n),x / r, x % r);
            }
            d[digits++] = dchar.charAt(x % r);
            x /= r;
        }while (x!=0);

        for(int i = 0; i<digits/2; i++){
            char temp = d[i];
            d[i] = d[digits-i-1];
            d[digits-i-1] = temp;
        }


        return digits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int no;										// 변환하는 정수
        int cd;										// 기수
        int dno;								    // 변환 후의 자릿수
        int retry;									// 한 번 더?
        char[] cno = new char[32];	// 변환 후의 각자리를 저장할 문자 배열

        System.out.println("10진수를 가수 변환 함");

        do{
            do{
                System.out.print("음이아닌 변환하는 정수: ");
                no = sc.nextInt();
            }while (no<0);
            do{
                System.out.print("어떤 진수로 변환할까요?(2~36): ");
                cd = sc.nextInt();}
            while (cd>36 || cd<2);

            dno = cardConvEx(no,cd,cno);

            System.out.println(cd+"진수로");
            for(int i =0 ; i<dno ; i++){
                System.out.print(cno[i]);
            }
            System.out.println("입니다.");

            do{
                System.out.print("한번더 할까요?(예:1 / 아니오:0) ");
                retry = sc.nextInt();
            }while (!(retry==1 || retry ==0));
        }while (retry ==1);

    }

}
