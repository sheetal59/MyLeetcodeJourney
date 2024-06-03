class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int idx = -1; 
        int count =0;
        switch(ruleKey){
            case"type" : idx=0;
            break;
            case "color" : idx=1;
            break;
            default : idx = 2;
        }
        for(List<String> item : items){
            if(item.get(idx).equals(ruleValue)){
                count ++;
            }
        }
        return count;
    }
}