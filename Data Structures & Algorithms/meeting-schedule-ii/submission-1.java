/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> a) {

        

PriorityQueue<Integer> heap=new PriorityQueue<>();
Collections.sort(a,(x,y)->Integer.compare(x.start,y.start));

for(Interval p:a){

    int start=p.start;
    int end=p.end;

    if(heap.isEmpty()){
        heap.add(end);
        continue;
    }

    if(start<heap.peek()){
        heap.add(end);

    }
    else{
        heap.poll();
        heap.add(end);
    }

}

return heap.size();

    }
}
