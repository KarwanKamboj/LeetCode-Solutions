class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;   // no. of rows
        int n = matrix[0].length;  // no. of columns

        boolean rows[] = new boolean[m];
        boolean cols[] = new boolean[n];
        for(int  i = 0 ; i<m ;i++){
            for(int j = 0 ; j<n ;j++){
                if(matrix[i][j] == 0){
                    rows[i] = true;
                    cols[j] = true ;
                }
            }
        }
        for(int i = 0 ;i < m ;i++){
            for(int j =0 ; j < n ;j++){
                if(rows[i] || cols[j] == true){
                    matrix[i][j] = 0;
                }
            }
        }
        return ;
    }
}