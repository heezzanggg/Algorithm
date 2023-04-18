package chap01.exercise;

import java.util.Scanner;

//네값의 최대값을 구하는 max4메서드 작성, main메서드 포함해야함
public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,d;

        System.out.print("a: "); a = sc.nextInt();
        System.out.print("b: "); b = sc.nextInt();
        System.out.print("c: "); c = sc.nextInt();
        System.out.print("d: "); d = sc.nextInt();

        int max = max4(a,b,c,d);

        System.out.println("최대값: "+ max);

    }

    public static int max4(int a, int b , int c, int d){

        int max = a;
        if(b > max) max = b;
        if(c > max) max = c;
        if(d > max) max = d;

        return max;
    }
}
