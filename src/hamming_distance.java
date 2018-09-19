public class hamming_distance {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x^y); //bitCount- count the 1's of binary number
        // x ^ y --- x XOR y, if the bit is different ,set it to 1, otherwise,set to 0
    }
}
