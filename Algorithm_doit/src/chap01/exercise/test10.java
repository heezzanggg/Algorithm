package chap01.exercise;

import java.util.Scanner;

public class test10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("양의 정숫값의 자릿수를 구하기");
        int num ;
        do{
            System.out.print("양의 정수 입력:");
            num = sc.nextInt();
        }while (num<=0);

        int no = 0; //자릿수
        while (num>0){
            num/=10;
            no ++;
        }
        System.out.println(no+"자리 입니다.");
    }
}
