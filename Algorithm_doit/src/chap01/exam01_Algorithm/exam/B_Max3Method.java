package chap01.exam01_Algorithm.exam;
//3개의 정숫값 가운데 최대값을 구하여 출력

public class B_Max3Method {
    static int max3(int a,int b, int c){
        int max = a;
        if(b>max){max = b;}
        if(c>max){max = c;}

        return max;
    }

    public static void main(String[] args) {
        System.out.println("max3(3,2,1) = " +max3(3,2,1));
        System.out.println("max3(1,2,3) = " +max3(1,2,3));
        System.out.println("max3(2,3,1) = " +max3(2,3,1));
    }


}
