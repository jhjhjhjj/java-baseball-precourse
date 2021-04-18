package utils;

import java.util.Random;

public class RandomUtils 
{
    private static final Random RANDOM = new Random();
    private int num = 0;
    //private RandomUtils() {
    //}
    
    public void setRandomNum()
    {
        num = RANDOM.nextInt(9999);
    }

    public String getRandom()
    {
        int tmpNum = num;
        return Integer.toString(tmpNum);
    }

    public static int nextInt(final int startInclusive, final int endInclusive) {
        if (startInclusive > endInclusive) {
            throw new IllegalArgumentException();
        }

        if (startInclusive < 0) {
            throw new IllegalArgumentException();
        }

        if (startInclusive == endInclusive) {
            return startInclusive;
        }

        return startInclusive + RANDOM.nextInt(endInclusive - startInclusive + 1);
    }
}
