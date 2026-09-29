class KthLargest {


  Queue<Integer> p=new PriorityQueue<>();

  static int n=0;

    public KthLargest(int k, int[] nums) {

       for(int i=0;i<nums.length;i++){
        p.add(nums[i]);
       }
       n=k;

        
    }
    
    public int add(int val) {

        p.add(val);

        while(p.size()>n){
            p.poll();

        }

        return p.peek();
        
    }
}
