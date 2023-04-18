package chap01.exam02_Loop;

import java.util.Scanner;

//while문으로 1,2,....,n의 합 구하기
public class A_SumWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1부터 n까지의 합 구하기");
        System.out.print("n: ");
        int n = sc.nextInt();

        int sum = 0;
        int i = 1;
        while(i<=n){
            sum += i;
            i++;
        }
        System.out.println(i);
        System.out.println("1부터 "+n+"까지의 합: " +sum);
    }

}
