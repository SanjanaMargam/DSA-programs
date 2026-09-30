class Solution {
    public int lastStoneWeight(int[] a) {

        

        Queue<Integer> p=new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<a.length;i++){
            p.add(a[i]);
        }
        
        while(p.size()>1){

            int a1=p.poll();
            int b=p.poll();

            if(a1!=b){
                p.add(Math.abs(a1-b));
            }


        }
        

        if(!p.isEmpty()) return p.poll();
        return 0;


        
    }
}
