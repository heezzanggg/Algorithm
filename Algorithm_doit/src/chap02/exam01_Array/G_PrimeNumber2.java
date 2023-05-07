package chap02.exam01_Array;
//1000이하의 소수를 나열
public class G_PrimeNumber2 {
    public static void main(String[] args) {
        int counter = 0; //나눗셈 횟수
        int ptr = 0; //찾은 소수의 개수
        int[] prime = new int[200]; //소수를 저장하는 배열

        prime[ptr++] =2;
        //prime[0]: 2 / prime[1]: 0 //ptr =1

        for(int n=3; n<=1000; n+=2){//조사대상은 홀수만 (짝수는 다 2로 나누어지기때문에 소수가 될수없음)
            int i;
            for(i=1; i<ptr; i++){ //이미 찾은 소수로 나누기
                counter++;
//                System.out.println("n: "+n+" &ptr: "+ptr+" &i: "+i);
                if(n%prime[i]==0){ //나누어 떨어지면 소수 아님
                    break;  //더이상의 반복 불필요
                }
            }
            System.out.println("ptr: "+ptr+" &i: "+i +" &n: "+n);
            if(ptr==i){
                prime[ptr++] = n; //소수를 배열에 넣은 후 ptr 증가시켜서 소수갯수 up
            }
        }

        for(int i = 0; i<prime.length; i++){
            System.out.println(prime[i]);
        }
        System.out.println("반복횟수: "+counter);
    }
}
