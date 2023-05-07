package chap02.exam01_Array;

import java.util.Random;
import java.util.Scanner;

//배열 요소의 최댓값 출력(걊을 난수로 생성)
public class D_MaxOfArrayRand {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("키의 최댓값 구하기");
        System.out.print("사람수: ");
        int num = sc.nextInt();

        int[] height = new int[num];

        System.out.println("=====키의 값=====");
        for(int i = 0; i<height.length; i++){
            height[i] = 100+random.nextInt(90); //0~89
            System.out.println("height["+i+"]: "+height[i]);
        }

        System.out.println("최대값: "+maxOf(height));

    }

    static int maxOf(int[] a){
        int max = a[0];
        for(int i =1; i<a.length; i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        return max;
    }
}
