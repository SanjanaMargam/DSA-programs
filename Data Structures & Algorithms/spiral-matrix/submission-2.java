class Solution {
    public List<Integer> spiralOrder(int[][] a) {

        int top=0, down=a.length-1, r=a[0].length-1, le=0;


        List<Integer> l=new ArrayList<>();

        while(top<=down && le<=r)
        {

            for(int i=le;i<=r;i++){

                l.add(a[top][i]);


            }
            top++;

 
            for(int i=top;i<=down;i++){
                l.add(a[i][r]);
            }
            r--;

 
             
        if(top<=down){
            for(int i=r;i>=le;i--){
                l.add(a[down][i]);
            }

            down--;
        }

 

 if(le<=r){

            for(int i=down;i>=top;i--){
                l.add(a[i][le]);
            }
            le++;
 }

 

        }

        return l;
        
    }
}
