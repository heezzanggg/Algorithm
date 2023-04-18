package chap01.exam02_Loop;

import java.util.Scanner;

public class E_Alternative1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;

        System.out.println("+와 -를 번갈아 n개 출력");

        do{
            System.out.print("n:");
            n=sc.nextInt();
        }while (n<=0);

        for(int i = 0; i<n; i++){
            if(i%2==0){//짝수
                System.out.print("+");
            }else{//홀수
                System.out.print("-");
            }
        }
    }
}
