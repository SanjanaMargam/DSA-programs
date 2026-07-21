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
    public boolean canAttendMeetings(List<Interval> a) {


if(a.size() ==0) return true;



Collections.sort(a, (i1, i2) -> Integer.compare(i1.start, i2.start));

        Interval i=a.get(0);

        int endy=i.end;

        for(int j=1;j<a.size();j++){
 

            if(endy>=a.get(j).end) return false;

            if(  endy>a.get(j).start) return false;
            

           

            endy=a.get(j).end;

        }

        return true;



    }
}
