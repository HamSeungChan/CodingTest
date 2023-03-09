package programmers.com.ll.level1.p12917;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public String solution(String s) {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        StringBuilder sb = new StringBuilder(String.valueOf(c)).reverse();
        return sb.toString();
    }
}

class OtherSolution {

    public String solution(String s) {
        return Stream.of(s.split(""))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining());
    }
}


