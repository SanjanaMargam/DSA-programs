class Solution {
    public int evalRPN(String[] a) {

        Stack<String> st = new Stack<>();

        for(int i = 0; i < a.length; i++) {

            if(a[i].equals("+") || a[i].equals("-") ||
               a[i].equals("*") || a[i].equals("/")) {

                int a2 = Integer.parseInt(st.pop());
                int b = Integer.parseInt(st.pop());

                if(a[i].equals("+"))
                    st.push(String.valueOf(b + a2));

                else if(a[i].equals("-"))
                    st.push(String.valueOf(b - a2));

                else if(a[i].equals("*"))
                    st.push(String.valueOf(b * a2));

                else
                    st.push(String.valueOf(b / a2));
            }
            else {
                st.push(a[i]);
            }
        }

        return Integer.parseInt(st.peek());
    }
}