package programmers.com.ll.level1.p12940;



public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {};

        int a = 1;
        int b = Integer.MAX_VALUE;
        int i = 1;

        while(true){
            if(n%i==0 && m%i==0) a = i;
            if(i%n==0 && i%m==0) {
                b = i; break;
            }
            i++;
        }

        return new int[]{a,b};
    }
}