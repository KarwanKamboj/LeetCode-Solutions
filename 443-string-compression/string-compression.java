class Solution {
    public int compress(char[] chars) {
    // t=O(n) , s = O(1)
    // in place string compression using two pointers
    // both loops are taking overall time complexity
    int i= 0;
    int idx = 0;
    while(i<chars.length){
        int count = 0;
        char c = chars[i];
        while(i<chars.length && chars[i]==c){
            count++;
            i++;
        }
        chars[idx++] = c;
        if(count>1){
            String num = String.valueOf(count);
            for(char a :num.toCharArray()){ // if num is more than one digit then it is splitted and stored as char in chars
                chars[idx++] = a;
            }
        }
    }
    return idx;
    }
}