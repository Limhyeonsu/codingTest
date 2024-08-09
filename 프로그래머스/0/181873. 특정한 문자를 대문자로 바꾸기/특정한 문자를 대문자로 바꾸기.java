class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        for(char x : my_string.toCharArray()) {
            if(x == alp.charAt(0)) {
                x = Character.toUpperCase(x);
            }
            answer += x;
            
        }
        return answer;
    }
}