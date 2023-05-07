package chap02.exercise;

import java.util.Scanner;

//년,월,일을 필드로 갖는 클래스 만들기
public class ex08 {

    static class YMD{
        int y; //년
        int m; //월 (1~12월)
        int d; //일 (1~31일)

        //각월의 마지막 날
        static int[][] mdays={
                {31,28,31,30,31,30,31,31,30,31,30,31},
                {31,29,31,30,31,30,31,31,30,31,30,31}
        };

        //윤년확인 (윤년:1 / 평년: 0)
        static int isLeap(int year) {
            return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
        }


        //생성자
        YMD(int y, int m, int d){
            this.y = y;
            this.m = m;
            this.d = d;
        }

        //n일 뒤의 날짜 봔환
        YMD after(int n){
            YMD temp = new YMD(this.y,this.m,this.d);

            if(n<0){
                before(-n);
            }

            temp.d += n;

            if(temp.d<1){
                temp.m -= 1;
                if(temp.m<1){
                    temp.m =12;
                }
            }

            return null;
        }

        //n일 앞의 날짜 봔환
        YMD before(int n){
            YMD temp = new YMD(this.y, this.m, this.d);

            if(n<0){
                return after(n);
            }
            return null;
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("날짜를 입력하세요");
        System.out.print("년: ");
        int y = sc.nextInt();
        System.out.print("월: ");
        int m = sc.nextInt();
        System.out.print("일: ");
        int d = sc.nextInt();

        YMD ymd = new YMD(y,m,d);

        System.out.print("며칠 전/후의 날짜를 구할까요? ");
        int n = sc.nextInt();


    }



}
