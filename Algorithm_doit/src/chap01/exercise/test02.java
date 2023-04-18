package chap01.exercise;

import java.util.Scanner;

//세값의 초솟값 구하기
public class test02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.print("a:"); a=sc.nextInt();
        System.out.print("b:"); b=sc.nextInt();
        System.out.print("c:"); c=sc.nextInt();

        int min = min3(a,b,c);
        System.out.println("최소값: "+ min);

    }

    static int min3(int a, int b, int c){
        int min = a;
        if(b<min){
            min = b;}
        if(c<min){
            min = c;}

        return min;
    }
}
