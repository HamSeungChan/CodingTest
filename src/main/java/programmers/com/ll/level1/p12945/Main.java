package programmers.com.ll.level1.p12945;

class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(5));
    }
}

class Solution {

    int answer =0;
    public int solution(int n) {

        //init
        array = new int [n+1];
        array[0] = 0;
        array[1] = 1;

        recursiveFunction(2);

        return answer;
    }


    public void recursiveFunction(int i){
        if(i == array.length-1){
            answer = array[i-2]% 1234567+array[i-1]% 1234567;
            return;
        }
        array[i] = array[i-2] + array[i-1];
        recursiveFunction(i+1);
    }

}