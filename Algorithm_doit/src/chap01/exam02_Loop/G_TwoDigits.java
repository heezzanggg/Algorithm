package chap01.exam02_Loop;

//2자리의 양수(10~99)입력
import java.util.Scanner;
public class G_TwoDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no;
        System.out.println("2자리의 양수 입력하시오");
        do{
            System.out.print("no:");
            no = sc.nextInt();
        }while (no<10 || no>99);
        //while(!(no>=10 && no<=99) );

        System.out.println("변수 no값:" + no);
    }
}
