class Solution {
    public int solution(int n, String control) {
        int answer = n;
        
        for (char ch : control.toCharArray()) {
            switch (ch) {
                case 'w': answer++; break;
                
                case 's': answer--; break;
                    
                case 'd': answer += 10; break;
                    
                case 'a': answer -= 10; break;
                    
                default: break;
            }
        }
        
        return answer;
    }
}