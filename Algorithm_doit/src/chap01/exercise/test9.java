package chap01.exercise;

import java.util.Scanner;

//b-a
public class test9 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.print("a:");
        int a = sc.nextInt();
//        System.out.print("b:");
//        int b = sc.nextInt();
//
//        while (a>=b){
//            System.out.println("a보다 큰 값을 입력하세요!");
//            System.out.print("b:");
//            b = sc.nextInt();
//        }

        int b ;
        while (true){
            System.out.print("b:");
            b = sc.nextInt();
            if(a>=b){
                System.out.println("a보다 큰 값을 입력하세요!");;
            }else {
                break;
            }
        }


        int result = b-a;

        System.out.println("b-a: "+result);
    }
}
