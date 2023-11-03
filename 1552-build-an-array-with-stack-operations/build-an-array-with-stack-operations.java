class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<>();
        int current=1;
        for(int i=0; i<target.length; i++){
            while(current<target[i]){
                list.add("Push");
                list.add("Pop");
                current++;
            }
            list.add("Push");

            current++;
        }
        return list;
    }
}