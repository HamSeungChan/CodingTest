package programmers.com.ll.level1.p12941;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {

    public int solution(int[] A, int[] B) {

        int sum= 0;

        Integer [] arr = new   Integer[B.length];
        for(int i=0;i<B.length;i++){
            arr[i] = B[i];
        }


        Arrays.sort(A);
        Arrays.sort(arr, Collections.reverseOrder());

        for(int i=0;i<A.length;i++){
            sum +=A[i]*arr[i];
        }

        return sum;
    }
}

