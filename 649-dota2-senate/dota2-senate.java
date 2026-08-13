class Solution { // t = O(n), S = O(n)
    public String predictPartyVictory(String senate) {
        Queue<Character>q=new ArrayDeque<>();
        int r = 0;
        int d = 0;
        for(int i = 0 ; i < senate.length();i++){
            char c = senate.charAt(i);
            q.offer(c);

            if(c == 'R'){
                r++;
            }else{
                d++;
            }
        }
        int banR =0;
        int banD=0;
        while(r>0 && d>0){
            char senator = q.poll();
            if(senator == 'R'){
                if(banR>0){
                    r--;
                    banR--;
                }else{
                    banD++;
                    q.offer('R'); //still alive and can get anotherr round
                }
            }else{
                if(banD>0){
                    d--;
                    banD--;
                }else{
                    banR++;
                    q.offer('D'); //still alive and can get anotherr round
                }
            }
        }
         return r > 0 ? "Radiant" : "Dire";
    }
}
/**
//note:
When R comes:
R already banned?
    YES → remove R
    NO  → ban one D + put R at back
When D comes:
D already banned?
    YES → remove D
    NO  → ban one R + put D at back  */