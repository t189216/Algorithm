class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        int de = denom1 * denom2;
        int n = numer1 * denom2 + numer2 * denom1;
        
        int max = 1;
        for (int i = 1; i <= de && i <= n; i++) {
            if (n % i == 0 && de % i == 0) {
                max = i;
            }
        }
        
        answer[0] = n / max;
        answer[1] = de / max;
        
        return answer;
    }
}