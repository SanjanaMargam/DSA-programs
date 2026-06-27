class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {

        int res[]=new int[a.length+b.length];

       

        int p1=0,p2=0,i=0;

        while(p1<a.length && p2<b.length){
           

           if(a[p1]<b[p2]){
            res[i]=a[p1];
            p1++;
           }
           else{
            res[i]=b[p2];
            p2++;


           }

           i++;
        }

        while(p1<a.length){
            res[i]=a[p1];
            p1++;
            i++;
        }
        while(p2<b.length){
            res[i]=b[p2];
            p2++;
            i++;
        }


         if(res.length==2) return (double)(res[0]+res[1])/2;

        for(int i2=0;i2<res.length;i2++) System.out.print(res[i2]);


        int low=0,h=res.length-1;

   int mid= (low+h)/2;

        if(res.length%2!=0){
            return (double)res[mid];
        }

     

       return (double)(res[mid]+res[mid+1])/2;




        
    }
}
