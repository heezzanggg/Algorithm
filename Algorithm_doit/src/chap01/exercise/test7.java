package chap01.exercise;

import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n:");
        int n = sc.nextInt();

        int sum = (1+n)*(n/2)+(n%2==1? n/2+1 : 0);
        System.out.println(sum);
    }
}
