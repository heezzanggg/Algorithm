package chap02.exercise;

import java.util.Arrays;
import java.util.Scanner;

//배열b의 모든 요소를 배열 a에 역순으로 복사하는 메서드 rcopy를 작성하시오
public class ex05 {
    static void rcopy(int[] a, int[] b){
        int num = a.length<=b.length? a.length : b.length;

        for(int i =0; i<num; i++){
            a[i] = b[b.length-i-1];
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

        rcopy(a,b);
        System.out.println("배열 b의 모든 요소를 배열 a에 역순으로 copy 하였습니다.");
        for (int i = 0; i < a.length; i++)
            System.out.println("a[" + i + "] = " + a[i]);
    }
}
