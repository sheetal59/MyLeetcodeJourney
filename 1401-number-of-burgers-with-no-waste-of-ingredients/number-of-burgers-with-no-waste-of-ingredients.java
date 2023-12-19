class Solution {
    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        List<Integer> result = new ArrayList<Integer>();
        int jumboBurger = tomatoSlices - 2*cheeseSlices;
        int smallBurger = cheeseSlices - jumboBurger/2;
        if(jumboBurger<0 || jumboBurger%2!=0 || smallBurger<1){
            if(tomatoSlices !=0 || cheeseSlices !=0){
                return result;
            }
        }
        result.add(jumboBurger/2);
        result.add(smallBurger);
        return result;
    }
}