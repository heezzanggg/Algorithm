package chap01.exercise;

import java.util.Scanner;

//네 값의 최솟값 구하기
public class test03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,d;

        System.out.print("a:"); a=sc.nextInt();
        System.out.print("b:"); b=sc.nextInt();
        System.out.print("c:"); c=sc.nextInt();
        System.out.print("d:"); d=sc.nextInt();

        int min = min4(a,b,c,d);

        System.out.println("최소값: "+min);

    }

    static int min4(int a, int b, int c, int d){
        int min = a;
        if(b<min) min = b;
        if(c<min) min = c;
        if(d<min) min = d;

        return min;
    }
}
