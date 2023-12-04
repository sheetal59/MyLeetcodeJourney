class Solution {
    public String largestGoodInteger(String num) {
        int i = 9;
        while(i >= 1){
            String search = String.valueOf(111*i);
            if(num.contains(search)){
                return search;
            }
            i--;
        }
         if(num.contains("000")){
             return "000";
         }


        return "";
    }
}