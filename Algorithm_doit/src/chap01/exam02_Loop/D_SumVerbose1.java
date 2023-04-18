package chap01.exam02_Loop;

import java.util.Scanner;

//1,2,...,n의 합과 그 값을 구하는 과정 출력
public class D_SumVerbose1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("1부터 n까지 합 구하기");

        do{
            System.out.print("n:");
            n = sc.nextInt();
        }while (n<=0);

        int sum = 0;
        for(int i = 1; i<=n ; i++){
            if(i<n){
                System.out.print(i+"+");
            }else {
                System.out.print(i+"=");
            }
            sum += i;
        }
        System.out.println(sum);
    }
}
