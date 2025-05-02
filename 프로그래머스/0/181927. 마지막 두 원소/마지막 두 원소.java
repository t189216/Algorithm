import java.util.*;

class Solution {
    public List solution(int[] num_list) {
        List<Integer> answer = new ArrayList<>();
        int tmp = 0;
        
        int last = num_list[num_list.length - 1];
        int lastb = num_list[num_list.length - 2];
        
        for (int i = 0; i < num_list.length; i++) {
            answer.add(num_list[i]);
        }       
        
        tmp = last > lastb ? last - lastb : (last) * 2;
        
        answer.add(tmp);
            
        return answer;
    }
}