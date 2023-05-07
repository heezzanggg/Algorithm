package chap02.exercise;

import java.util.Arrays;
import java.util.Scanner;

//배열 b의 모든 요소를 배열 a에 복사하는 메서드 copy를 작성하라
public class ex04 {
    static void copy(int[] a, int[] b){
        int num = a.length<= b.length?a.length:b.length;
        for(int i =0; i<num; i++){
            a[i]=b[i];
        }
        System.out.println(Arrays.toString(a));

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("numA(요솟수): ");
        int numA = sc.nextInt();
        int[] a = new int[numA];
        for(int i =0 ;i<a.length; i++){
            System.out.print("a[" + i + "] : ");
            a[i] = sc.nextInt();
        }

        System.out.print("numB(요솟수): ");
        int numB = sc.nextInt();
        int[] b = new int[numB];
        for(int i =0 ;i<b.length; i++){
            System.out.print("b[" + i + "] : ");
            b[i] = sc.nextInt();
        }

        copy(a,b);
        System.out.println("배열 b의 모든 요소를 배열 a에 copy 하였습니다.");
        for (int i = 0; i < a.length; i++)
            System.out.println("a[" + i + "] = " + a[i]);

    }
}
