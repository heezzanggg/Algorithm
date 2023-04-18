package chap01.exam02_Loop;

//양수만 입력하여 1,2,....,n까지 합 구하기
import java.util.Scanner;

public class C_SumFor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;

        System.out.println("1부터 n까지 합 구하기");

        do{
            System.out.println("n값:");
            n=sc.nextInt();
        }while (n<=0);

        int sum = 0;

        for(int i = 1; i<=n ; i++){
            sum += i;
        }

        System.out.println("1부터" +n+"까지의 합은" +sum);
    }
}
