package chap02.exercise;

import java.util.Random;

public class ex01 {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("키의 최댓값 구하기");
        int num = 1+random.nextInt(10);
        System.out.println("사람수: "+num);

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
