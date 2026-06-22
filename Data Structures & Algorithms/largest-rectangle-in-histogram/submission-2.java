class Solution {
    public int largestRectangleArea(int[] a) {


        Stack<Integer> s=new Stack<>();
        int maxA=Integer.MIN_VALUE;

        for(int i=0;i<a.length;i++){


            while(!s.isEmpty() && a[i] <a[s.peek()]){


                int ele=s.pop();

                int pse=0;
                int nse=i;

                if(s.isEmpty()) pse=-1;
                else pse=s.peek();


                maxA=Math.max(maxA,a[ele]*(nse-pse-1));

            }
          
            s.push(i);
        }

       while(!s.isEmpty()){
        int nse=   a.length;
        int pse=0;
        int ele=s.pop();

        if(s.isEmpty()) pse=-1;
        else pse=s.peek();

        
                maxA=Math.max(maxA,a[ele]*(nse-pse-1));


       }


       return maxA;
        
    }
}
