package chap02.exam01_Array;

import java.util.Arrays;

public class H_CloneArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = a.clone();

        b[3]=0;

        System.out.println("a = "+Arrays.toString(a)); //a = [1, 2, 3, 4, 5]

        System.out.println("b = "+ Arrays.toString(b)); //b = [1, 2, 3, 0, 5]

    }
}
