class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        int curr_time = 0;
        int prev_time = 0;
        int [] exe_t = new int[n]; // array for exection time of each functiom
        String prev_event = "";
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < logs.size(); i++){
            String [] words = logs.get(i).split(":");
            int fn_id = Integer.parseInt(words[0]);
            curr_time = Integer.parseInt(words[2]);
            if(words[1].equals("start")){
                //start
                if(!st.isEmpty()){
                    int fid = st.peek();
                    exe_t[fid] += curr_time - prev_time;
                     prev_time = curr_time;
                }
                st.push(fn_id);
            } else {
                //end
                exe_t[fn_id] += curr_time - prev_time+1;
                prev_time = curr_time + 1;
                st.pop();
            }
           // System.out.println(fn_id);
        }
        return exe_t;
    }
}