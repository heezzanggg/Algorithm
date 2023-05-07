package chap02.exam01_Array;

import java.io.Reader;
import java.util.Arrays;
import java.util.Scanner;

public class F_CardConvRev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no;     //변환하는 정수
        int cd;     //기수
        int dno;    //변환후의 자릿수
        int retry;  //다시한번?
        char[] cno = new char[32]; //변환 후 각 자리의 숫자를 넣어 두는 문자 배열

        System.out.println("10진수를 기수 변환 함");
        do{
            do{
                System.out.print("음이 아닌 변환하는 정수:");
                no = sc.nextInt();
            }while (no<0);
            do{
                System.out.print("어떤 진수로 변환할까요?(2~36): ");
                cd = sc.nextInt();
            }while (cd>36 || cd<2);

            dno = cardConv(no,cd,cno); //no를 cd진수로 변환

            System.out.println(cd+"진수로");
            for(int i = 0 ; i<dno; i++){
                System.out.print(cno[i]);
            }
            System.out.println("입니다.");

            do{
                System.out.println("한번 더? (1:예 / 0: 아니오)");
                retry = sc.nextInt();
            }while (!(retry==1 ||retry==0));
        }while (retry ==1);
    }

    //정숫값 x를 r진수로 변환하여 배열 d에 아랫자리부터 넣어 두고 자릿수를 반환
    static int cardConv(int x, int r, char[] d){
        int digits = 0 ; //변환 후의 자릿수
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //System.out.println(Arrays.toString(d));
        do{
            d[digits++] = dchar.charAt(x%r);
            x /= r;
        }while (x != 0);

        System.out.println(Arrays.toString(d));

        for(int i = 0; i<digits/2; i++){
            char idx = d[i];
            d[i] = d[digits-i-1];
            d[digits-i-1] = idx;
        }
        return digits;
    }

}
