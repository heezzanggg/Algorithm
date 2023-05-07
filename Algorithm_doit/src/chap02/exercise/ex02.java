package chap02.exercise;

import java.util.Arrays;

//배열요소를 역순으로 정렬하는 과정을 하나하나 나나태는 프로그램을 작성해라
public class ex02 {
    public static void main(String[] args) {
        int[] a = {2,5,1,3,9,6,7};

        for(int i =0; i<a.length/2; i++){
            int idx1 = i;
            int idx2 = a.length-i-1;
            System.out.println("a["+i+"]과 a["+idx2+"]을 교환합니다.");
            int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
            System.out.println(Arrays.toString(a));
        }
        System.out.println("역순 정렬을 마쳤습니다.");
    }

}
