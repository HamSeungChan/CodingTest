package programmers.com.ll.level1.p12928;

public class Main {
    public static void main(String[] args) {
    System.out.print(new Solution().solution(12));
    }
}

class Solution {
    public int solution(int n){
        int answer = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0)
                answer += i;
        }
        return answer;
    }
}