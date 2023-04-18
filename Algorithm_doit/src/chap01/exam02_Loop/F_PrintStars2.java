package chap01.exam02_Loop;
//*를 n개 출력, w개마다 줄바꿈
import java.util.Scanner;

public class F_PrintStars2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,w;

        System.out.println("w개마다 줄바꿔 *를 n개 출력");

        do{
            System.out.print("n:");
            n=sc.nextInt();
        }while (n<=0);
        do{
            System.out.print("w:");
            w=sc.nextInt();
        }while (w<=0);

        for(int i =0; i<n/w; i++){
            System.out.println("*".repeat(w));
        }
        int rest = n%w;
        if(rest !=0){
            System.out.println("*".repeat(rest));
        }
    }
}
