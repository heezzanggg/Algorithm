package chap02.exam01_Array;
//확장 for문 이용하여 배열의 모든 요소의 합 구하여 출력
public class I_ArraySumForIn {
    public static void main(String[] args) {

        double[] a= {1.0,2.0,3.0,4.0,5.0};

        for(int i =0; i<a.length; i++){
            System.out.println("a["+i+"] = "+a[i]);
        }

        double sum1 = 0;
        //확장 for문
        for(double i : a){ //배열a의 처음부터 끝까지 모든 요소를 한 개씩 스캔 후, 루프 본문에서는 현재 선택한 요소를 i라고 표현한다.
            sum1 += i;
        }

        double sum2 = 0;
        //기본 for문
        for(int i = 0; i<a.length; i++){
            sum2 += a[i];
        }

        System.out.println("모든 요소의 합: "+sum1);
        System.out.println("모든 요소의 합: "+sum2);
    }
}
