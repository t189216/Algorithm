class Solution {
    public String solution(String code) {
        String ret = "";
        int mode = 0;
        
        for (int idx = 0; idx < code.length(); idx++) {
            if (code.charAt(idx) == '1') mode = 1 - mode;
            else if(idx % 2 == mode) ret += code.charAt(idx);
        }
        
        return ret.equals("") ? "EMPTY" : ret;
    }
}