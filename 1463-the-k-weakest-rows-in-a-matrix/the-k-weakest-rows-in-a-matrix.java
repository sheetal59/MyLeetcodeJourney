class Solution {
    class Pair{
        int key;
        int val;

        public Pair(int key, int val){
            this.key = key;
            this.val = val;
        }
    }

    class PairComparator implements Comparator<Pair>{
        public int compare(Pair p1, Pair p2){
            Integer key1 = p1.key;
            Integer key2 = p2.key;
            Integer val1 = p1.val;
            Integer val2 = p2.val;
            if(val1!=val2)
                return val1.compareTo(val2);
            else
                return key1.compareTo(key2);
        }
    }

    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<Pair> q = new PriorityQueue<>(new PairComparator()); 
        for(int i=0; i<mat.length; i++){
            int count = 0;
            for(int j=0; j<mat[0].length; j++){
                if(mat[i][j] == 1)
                    count++;
                else
                    break;
            }
            q.add(new Pair(i, count));
        }
        int[] ans = new int[k];
        for(int i=0; i<k; i++){
            ans[i] = q.poll().key;
        }

        return ans;
    }
}