class Solution { // t = O(nlog n), s = O(n)
    public int[] arrayRankTransform(int[] arr) {
        int n =arr.length;
        int ar1[] = new int[n];
        for(int i = 0 ; i<n;i++){
            ar1[i] = arr[i];
        }
        Arrays.sort(ar1);
       HashMap<Integer,Integer>map = new HashMap<>();
       int rank = 1 ;
       for(int i = 0 ;i<n;i++){
        if(!map.containsKey(ar1[i])){
            map.put(ar1[i],rank++);
        }
       }
       int res[] = new int[n];
       for(int i = 0 ; i< n ;i++){
            res[i] = map.get(arr[i]);
       }
       return res;
    }
}