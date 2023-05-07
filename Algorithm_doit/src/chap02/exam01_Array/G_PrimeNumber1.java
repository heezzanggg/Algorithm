package chap02.exam01_Array;

//1000이하의 소수를 나열
public class G_PrimeNumber1 {
    public static void main(String[] args) {
        int counter = 0 ; //나눗셈 횟수

        for(int n =2 ; n<=1000; n++){
            int i;
            for(i=2; i<n; i++){
                counter ++;
                if(n%i ==0){//나누어 떨어지면 소수가 아님
                    break;
                }
            }
           // System.out.println("n:"+n+" &i: "+i);
            if(n==i){
                System.out.println("소수: "+n);
            }
        }
        System.out.println("나눗셈을 수행한 횟수:" + counter);
    }
}
