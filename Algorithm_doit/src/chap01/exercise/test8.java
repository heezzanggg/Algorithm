package chap01.exercise;

import java.util.Scanner;

public class test8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a :");
        int a = sc.nextInt();
        System.out.print("b: ");
        int b = sc.nextInt();

        int result = sumof(a,b);

        System.out.println(a+"부터 "+b+" 까지의 합:"+result);
    }

    static int sumof(int a, int b){

        int min,max ;

        if(a>b) { min = b; max = a;}
        else{min = a; max = b;}

        int sum = 0 ;

        for(int i=min; i<=max; i++){
            sum += i;
        }
        return sum;
    }

}
