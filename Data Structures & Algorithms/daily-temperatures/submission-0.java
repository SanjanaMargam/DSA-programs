class Solution {
    public int[] dailyTemperatures(int[] a) {

        int nge[]=new int[a.length];

        Stack<Integer> st=new Stack<>();

        for(int i=a.length-1;i>=0;i--){
            while(!st.isEmpty() && a[i]>=a[st.peek()]){

                st.pop();

            }

            if(st.isEmpty()){
                nge[i]=0;
                
            }
            else{
                nge[i]=st.peek()-i;

                System.out.println(st.peek()-i);
            }
            st.push(i);

        }

        return nge;

        
    }
}
