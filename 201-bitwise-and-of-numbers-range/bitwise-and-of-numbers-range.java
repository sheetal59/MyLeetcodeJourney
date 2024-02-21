class Solution {
    public int rangeBitwiseAnd(int m, int n) {
    int i = 0;
    for (; m != n; ++i) {
        m >>= 1;
        n >>= 1;
    }
    return n << i;
}

// 8266 / 8266 test cases passed.
// Status: Accepted
// Runtime: 8 ms
}