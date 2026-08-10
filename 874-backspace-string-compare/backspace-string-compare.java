class Solution {
    //t = O(n+m), s=O(1)
    public boolean backspaceCompare(String s, String t) {
        int i = s.length()-1;
        int j = t.length()-1;
        while(i>=0 ||j>=0){
            int skip =0 ;
            while(i>=0){
                if(s.charAt(i)=='#'){
                    skip++;
                    i-- ; // move left
                }else if(skip>0){
                    skip--;  //skip that character
                    i--;
                }else{
                    break;  // valid character
                }
            }
            skip = 0;

            while(j>=0){
                if(t.charAt(j) == '#'){
                    skip++;
                    j--;
                }else if(skip>0){
                    skip--;
                    j--;
                }else{
                    break; // valid character
                }
            }
             if(i>=0&&j>=0 &&  s.charAt(i) != t.charAt(j)){
                return false;
            } 
            if ((i>=0)!=(j>=0)){// One has a character and other doesn't
                return false;
            }    
            i--;// Move to next character
            j--;
        }
        return true;
}
}
