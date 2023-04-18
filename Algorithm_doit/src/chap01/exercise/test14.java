package chap01.exercise;

import java.util.Scanner;

//직각이등변삼각형을 출력
public class test14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("n:");
            n = sc.nextInt();
        }while (n<=0);

        System.out.println("왼쪽 아래 직각삼각형");
        triangleLB(n);			// 왼쪽 아래가 직각인 직각삼각형

        System.out.println("왼쪽 위 직각삼각형");
        triangleLU(n);			// 왼쪽 위가 직각인 직각삼각형

        System.out.println("오른쪽 위 직각삼각형");
        triangleRU(n);			// 오른쪽 위가 직각인 직각삼각형

        System.out.println("오른쪽 아래 직각삼각형");
        triangleRB(n);			// 오른쪽 아래가 직각인 직각삼각형
    }

    static void triangleLB(int n){//왼쪽 아래가 직각인 이등변삼각형 출력
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }

    static void triangleLU(int n){//왼쪽 위가 직각인 이등변삼각형 출력
        for(int i =1; i<=n;i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print('*');
            }
            System.out.println();
        }

    }
    static void triangleRU(int n){//오른쪽 위가 직각인 이등변삼각형 출력
        for(int i =1; i<=n; i++){
            for(int j=1; j<=i-1; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n-i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    static void triangleRB(int n){//오른쪽 아래가 직각인 이등변삼각형 출력
        for(int i =1; i<=n; i++){
            for(int j =1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j =1; j<=i; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }

}
