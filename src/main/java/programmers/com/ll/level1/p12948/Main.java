package programmers.com.ll.level1.p12948;

class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public String solution(String phone_number) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < phone_number.length() - 4; i++)
            sb.append("*");

        sb.append(phone_number.substring(phone_number.length() - 4));

        return sb.toString();
    }
}

class OtherSolution {
    public String solution(String phone_number) {

        char[] c = phone_number.toCharArray();

        for (int i = 0; i < phone_number.length() - 4; i++)
            c[i] = '*';


        return String.valueOf(c);
    }
}
