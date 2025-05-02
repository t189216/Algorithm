class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int pow = 1;
        
        for (int i : num_list) {
            sum += i;
            pow *= i;
        }
        
        answer = pow < (int)Math.pow(sum, 2) ? 1 : 0;
        return answer;
    }
}