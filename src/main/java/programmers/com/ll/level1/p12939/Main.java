package programmers.com.ll.level1.p12939;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("1 2 4 3"));
    }
}

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] array = s.split(" ");
        int [] intArray = new int [array.length];

        for(int i=0;i<array.length;i++){
            intArray[i] = Integer.valueOf(array[i]);
        }

        Arrays.sort(intArray);

        return intArray[0] +" "+ intArray[intArray.length-1];
    }
}