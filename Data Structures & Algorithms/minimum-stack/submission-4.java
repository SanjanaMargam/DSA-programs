class MinStack {

    Stack<Long> st;
    long min=Integer.MAX_VALUE;
   

    public MinStack() {

       st= new Stack<>();
        
    }
    
    public void push(int val) {
        
        if(st.isEmpty()){
                st.push((long)val);
                min=val;

        }
        else if(val<min)
        {

            st.push(2L*val-min);
            min=val;

        }
        else
        {
            st.push((long)val);

        }
      
    }
    
    public void pop() {
        long ele=st.peek();

        if(ele>=min) {
            st.pop();
        }
        else
        {
            min=(2L*min)-ele;
            st.pop();
        }
        
    }
    
    public int top() {
        long ele=st.peek();
         if(ele<min) return (int)min;

         else return  (int)ele;   
    }
    
    public int getMin() {

        return (int) min;
        
    }
}
