class Solution {
    public int lengthOfLIS(int[] a) {

        List<Integer> l=new ArrayList<>();



        for(int i=0;i<a.length;i++){

            if(l.isEmpty()) l.add(a[i]);

            else{


                int peek=l.get(l.size()-1);

                if(a[i]>peek){
                    l.add(a[i]);
                }
                else{

                    int pos=ceil(a[i],l);

                    l.set(pos,a[i]);
                    
                }
            }
        }

        return l.size();
        
    }

    int ceil(int ele,List<Integer> a){

        int low=0,h=a.size()-1,ans=0;

        while(low<=h){

            int mid=(low+h)/2;

            if(a.get(mid)>=ele){
                ans=mid;
                h=mid-1;
            }
            else low=mid+1;
        }

        return ans;
    }
}
