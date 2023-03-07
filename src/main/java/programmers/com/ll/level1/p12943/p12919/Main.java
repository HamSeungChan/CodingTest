package programmers.com.ll.level1.p12943.p12919;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public String solution(String[] seoul) {
        String answer = "";

        for(int i=0;i<seoul.length;i++){
            if(seoul[i].equals("Kim")){
                return "김서방은 " + i+"에 있다";
            }
        }

        return answer;
    }
}