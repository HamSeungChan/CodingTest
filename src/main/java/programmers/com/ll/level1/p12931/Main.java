package programmers.com.ll.level1.p12931;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(123));
    }
}

class Solution{
    public int solution(int n){
        int sum = 0;
        while(n>0){
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }
}