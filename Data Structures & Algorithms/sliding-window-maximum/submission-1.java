class Solution {
    public int[] maxSlidingWindow(int[] a, int k) {

        Deque<Integer> d=new ArrayDeque<>();

        int res[]=new int[a.length-k+1];
    int j=0;
        for(int i=0;i<k;i++){
            while(!d.isEmpty() && a[i]>=a[d.peekLast()] )

            d.pollLast();

            d.addLast(i);
        }      

        res[j]=a[d.peekFirst()];
        j++;

        for(int i=k;i<a.length;i++){

        if(i-d.peekFirst() >=k){
            d.pollFirst();

        }

            while(!d.isEmpty() && a[i]>=a[d.peekLast()] )

                d.pollLast();

             d.addLast(i);
             res[j]=a[d.peekFirst()];
             j++;
        }
        return res;

    }
}
