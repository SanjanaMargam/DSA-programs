class Solution {
    public int[][] kClosest(int[][] a, int k) {


        Queue<int[]> p=new PriorityQueue<>(
            (a1,b)->Integer.compare(
                b[0]*b[0]+b[1]*b[1],
                a1[0]*a1[0]+a1[1]*a1[1]
            )
        );

    for(int i=0;i<a.length;i++){

        p.add(new int[]{a[i][0],a[i][1]});

        while(p.size()>k){
            p.poll();
        }
    }

    int ans[][]=new int[k][2];

    for(int i=0;i<k;i++){
        ans[i]=p.poll();
    }
    return ans;








        

    }
}
