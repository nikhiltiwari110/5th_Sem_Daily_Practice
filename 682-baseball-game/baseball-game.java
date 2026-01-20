class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < operations.length; i++) {
            char ch = operations[i].charAt(0);
            if (ch == '+'){
                int x = st.pop();
                int y = st.pop();
                st.push(y);
                st.push(x);
                st.push(x+y);
            } else if (ch == 'D') {
                st.push(st.peek()*2);
            } else if (ch == 'C') {
                st.pop();
            }else {
                int x = Integer.parseInt(operations[i]);
                st.push(x);
            }
        }
        int s = 0;
        while (!st.isEmpty()){
            s+=st.pop();
        }
        return s;
    }
}