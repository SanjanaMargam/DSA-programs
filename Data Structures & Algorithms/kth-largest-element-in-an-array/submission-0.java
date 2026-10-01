class Solution {
    public int findKthLargest(int[] a, int k) {

        Queue<Integer> p=new PriorityQueue<>( );

        for(int i=0;i<a.length;i++){

            p.add(a[i]);


            while(p.size()>k){
                p.poll();
            }
          }

          return p.peek();





        
    }
}
