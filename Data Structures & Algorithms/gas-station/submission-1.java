class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int tg=0;
        int tc=0;


        for(int i=0;i<gas.length;i++){

            tg+=gas[i];

        }
        for(int i=0;i<cost.length;i++){

            tc+=cost[i];

        }

        if(tg<tc) return -1;

        int cg=0,idx=0;

        for(int i=0;i<gas.length;i++){

            cg=cg+gas[i]-cost[i];

            if(cg<0){
                idx=i+1;
                cg=0;

            }
            


        }


        return idx;
        
    }
}
