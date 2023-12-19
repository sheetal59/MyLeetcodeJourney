class Solution {
    public double angleClock(int hour, int minutes) {
        hour = hour %12;
        double hourHand = hour *30 + minutes *0.5;
        double minHand = minutes *6;
        double angle = Math.abs(minHand-hourHand);
        return Math.min(360-angle,angle);
    }
}