import java.util.*;

class Solution {
    public List solution(int[] num_list) {
        List<Integer> answer = new ArrayList<>() ;
        int tmp = 0;
        
        for (int i = 0; i < num_list.length; i++) {
            answer.add(num_list[i]);
        }       
        
        tmp = num_list[num_list.length - 1] > num_list[num_list.length - 2] ? num_list[num_list.length - 1] - num_list[num_list.length - 2] : (num_list[num_list.length - 1]) * 2;
        
        answer.add(tmp);
            
        return answer;
    }
}