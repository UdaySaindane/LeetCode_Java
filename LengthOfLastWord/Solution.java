package LengthOfLastWord;


class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        // String a = " ";
        for(int i=s.length()-1;i>0;i--){
            if(s.charAt(i) != ' '){
                count++; 
                    if(s.charAt(i-1) == ' '){
                    break;     
            }
            }
            else if(s.charAt(i) == ' '){
                continue;
            }
            }     
           
        return count;
    
}
}