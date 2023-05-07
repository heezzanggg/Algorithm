package chap02.exam01_Array;
//1000이하의 소수를 나열

public class G_PrimeNumber3 {
    public static void main(String[] args) {

        int counter = 0; //나눗셈 횟수
        int ptr = 0; //찾은 소수의 개수
        int[] prime = new int[200]; //소수를 저장하는 배열

        prime[ptr++] = 2; //prime[0] =2 -> ptr=1
        prime[ptr++] = 3; //prime[1] =3 -> ptr=2

        for(int n = 5; n<=1000; n+=2){//홀수만 소수 여부 조회
            boolean flag = false;
            for(int i =1; prime[i]*prime[i]<=n; i++){
                counter+=2;
                if(n %prime[i] == 0){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                prime[ptr++] = n;
                counter ++;
            }
        }

        for(int i =0 ; i<prime.length; i++){
            System.out.println(prime[i]);
        }
        System.out.println("곱셈과 나눗셈을 수행한 횟수: "+counter);
    }
}
