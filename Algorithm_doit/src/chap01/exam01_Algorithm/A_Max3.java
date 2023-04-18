package chap01.exam01_Algorithm;

import java.util.Scanner;

//3개의 정수값을 입력하고 최대값을 구하여 출력
public class A_Max3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("세 정수의 최댓값 구하기");
        System.out.print("a의 값:"); int a = sc.nextInt();
        System.out.print("b의 값:"); int b = sc.nextInt();
        System.out.print("c의 값:"); int c = sc.nextInt();

        int max = a; //max에 a 값 넣기
        if(b>max){max = b;} //b값이 max보다 크면 max에 b값 넣기
        if(c>max){max = c;} //c값이 max보다 크면 max에 c값 넣기

        System.out.println("최대값: "+max);

    }
}
