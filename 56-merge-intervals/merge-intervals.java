class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1)
			return intervals;
    Arrays.sort(intervals, (o1,o2) -> Integer.compare(o1[0],o2[0]));

    List<int []> res = new ArrayList<>();
    int[] newInterval = intervals[0];
    res.add(newInterval);
    for(int[] interval : intervals){
        if(interval[0]<=newInterval[1]){
            newInterval[1] = Math.max(newInterval[1], interval[1]);
        }else{
            newInterval = interval;
            res.add(newInterval);
        }
    }
    return res.toArray(new int[res.size()][]);
    }
}