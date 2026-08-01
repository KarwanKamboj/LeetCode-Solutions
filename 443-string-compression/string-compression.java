class Solution {
    // t=O(n) ,s = O(n), due to stringbuilder
    // string compression using two pointers
    // both loops are taking overall time complexity
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        int i = 0 ;
        while(i<chars.length){
            char c = chars[i];
            int count = 0;
            while(i<chars.length && chars[i]==c){
                count++;
                i++;
            }
            sb.append(c);//put c not chars[i], i is incremented
            if(count>1){
                sb.append(count);
            }
        }
        for(int j=0; j<sb.length();j++){
            chars[j] = sb.charAt(j); 
        }       
        return sb.length();
    }
}