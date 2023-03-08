package programmers.com.ll.level1.p12903;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    }
}

class Solution {
    public String solution(String s) {
        String answer = "";
        int middle = 0;
        if(s.length()%2==0){
            middle = s.length()/2;
            return s.substring(middle-1,middle+1);
        }

        return s.substring(s.length()/2,s.length()/2+1);
    }
}