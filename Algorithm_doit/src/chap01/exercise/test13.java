package chap01.exercise;

import java.util.Scanner;

public class test13 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("정사각형을 출력합니다.");
        int num;
        do{
            System.out.print("변의 길이: ");
            num = sc.nextInt();
        }while (num<=0);


//        for(int i = 1 ; i<=num;i++){
//            System.out.println("*".repeat(num));
//        }

        for(int i =1; i<=num;i++){
            for(int j = 1; j<=num; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }

}
