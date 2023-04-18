package chap01.exercise;

import java.util.Scanner;

public class test04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.print("a: "); a = sc.nextInt();
        System.out.print("b: "); b = sc.nextInt();
        System.out.print("c: "); c = sc.nextInt();

        int mid = midMethod(a,b,c);
        System.out.println("중앙값: "+mid);

    }

    static int midMethod(int a, int b, int c){

        if(a>=b){
            if(a>b){
                if(b>=c){
                    return b;
                }else{
                    if(a>c){
                        return c;
                    }return a;
                }

            }else{
                return b;
            }
        }else{
            if(a>=c){
                return a;
            }else {
                if(b>=c){
                    return c;
                }return b;
            }

        }
    }
}
