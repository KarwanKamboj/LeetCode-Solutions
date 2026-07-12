class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;   //HashMap
        int copy[] = Arrays.copyOf(arr,n);

        Arrays.sort(copy);
        HashMap<Integer,Integer> mp =new HashMap<>();
        int rank = 1;
        for(int m : copy){
            if(!mp.containsKey(m)){
                mp.put(m,rank++);
            }
           
        }
        int res[] = new int[n];
        for(int i = 0 ; i < n ;i++){
            res[i] = mp.get(arr[i]);
        }
        return res;
    }
}