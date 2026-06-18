class Solution {
    public int[] topKFrequent(int[] a, int k) {


        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<a.length;i++){
          map.put(a[i],map.getOrDefault(a[i],0)+1);
        }

List<Map.Entry<Integer, Integer>> list =
        new ArrayList<>(map.entrySet());

list.sort((a2, b) -> b.getValue().compareTo(a2.getValue()));
List<Integer> l=new ArrayList<>();

for (Map.Entry<Integer, Integer> entry : list) {
    if(k==0){
        break;
       
    }
     l.add(entry.getKey());
     k--;

}

int res[]=new int[l.size()];

for(int i=0;i<res.length;i++){
    res[i]=l.get(i);
}

return res;



        
    }
}
