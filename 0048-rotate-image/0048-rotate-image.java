class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp; 
                }
        }
                for(int[]arr:matrix){
                    for(int k=0;k<n/2;k++){
                        int temp1=arr[k];
                        arr[k]=arr[n-k-1];
                        arr[n-k-1]=temp1;

                    }
                    

                }
        }
        
    }
