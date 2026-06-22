class Solution {
    public boolean searchMatrix(int[][] a, int t) {

        int m=a.length,n=a[0].length;

      
       

        int low=0,h=m*n-1;

        while(low<=h){
            int mid=(low+h)/2;

            int row=mid/n;
            int col=mid%n;

            if(a[row][col]==t) return true;

            else if(a[row][col]<t) low=mid+1;

            else h=mid-1;
        }

        return false;
        
    }
}
