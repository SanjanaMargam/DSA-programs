class Solution {
    public void rotate(int[][] a) {


        int m=a.length, n =a[0].length;

        for(int i=0;i<a.length/2;i++){

            for(int j=0;j<a[0].length;j++){

              int temp=a[i][j];

              a[i][j]=a[m-i-1][j];

              a[m-i-1][j]=temp;

            }
        }
        

        for(int i=0;i<a.length;i++){

            for(int j=i+1;j<a[0].length;j++){

                int tep=a[i][j];
                a[i][j]=a[j][i];

                a[j][i]=tep;
            }
        }

        
    }
}
