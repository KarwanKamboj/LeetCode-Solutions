class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>ans = new ArrayList<>();  // by checking list size
        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0;
        int right = cols -1;
        int top = 0;
        int bottom = rows -1;

        while(ans.size()< rows *cols){
            for(int i = left ; i<= right && ans.size()< rows *cols;i++){
                ans.add(matrix[top][i]);
            }
            for(int i = top+1; i <= bottom && ans.size()< rows *cols;i++){
                ans.add(matrix[i][right]);
            }
            for(int i = right-1 ; i>=left && ans.size()< rows *cols;i--){
                ans.add(matrix[bottom][i]);;
            }
            for(int i = bottom -1 ; i>top && ans.size()< rows *cols;i--){
                ans.add(matrix[i][left]);
            }
            left++;right--;top++;bottom--;
        }
        return ans;
    }
}