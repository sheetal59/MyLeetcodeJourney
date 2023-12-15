class Solution {
    public String destCity(List<List<String>> paths) {
        HashMap<String, String> revMap = new HashMap<>();
        for(List<String> path : paths){
            revMap.put(path.get(0), path.get(1));
        }
        String dest = paths.get(0).get(1);
        while(revMap.containsKey(dest)){
            dest = revMap.get(dest);
        }
        return dest;
    }
}