 

/**
 * Created by dan on 6/14/17.
 */
public class MathUtilities {

    /**
     * @param baseValue  starting value
     * @param difference value to add to starting value
     * @return sum of `baseValue` and `difference`
     */
    public Integer add(int baseValue, int difference) {
        return baseValue+difference;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to add to starting value
     * @return sum of `baseValue` and `difference`
     */
    public Long add(long baseValue, long difference) {
        long value = baseValue + difference;
        return value;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to add to starting value
     * @return sum of `baseValue` and `difference`
     */
    public Short add(short baseValue, short difference) {
        int sum = baseValue + difference;
        short ssum = (short)sum;
        
        return ssum;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to add to starting value
     * @return sum of `baseValue` and `difference`
     */
    public Byte add(byte baseValue, byte difference) {
        int sum = baseValue + difference;
        byte bsum = (byte)sum;
        return bsum;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to add to starting value
     * @return sum of `baseValue` and `difference`
     */
    public Float add(float baseValue, float difference) {
        float sum = baseValue + difference;
        
        return sum;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to add to starting value
     * @return sum of `baseValue` and `difference`
     */
    public Double add(double baseValue, double difference) {
        double sum = baseValue + difference;
        
        return sum;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to subtract from starting value
     * @return difference between `baseValue` and `difference`
     */
    public Integer subtract(int baseValue, int difference) {
        return baseValue - difference;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to subtract from starting value
     * @return difference between `baseValue` and `difference`
     */
    public Long subtract(long baseValue, long difference) {
        long value = baseValue - difference;
        return value;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to subtract from starting value
     * @return difference between `baseValue` and `difference`
     */
    public Short subtract(short baseValue, short difference) {
        int sum = baseValue - difference;
        short ssum = (short)sum;
        
        return ssum;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to subtract from starting value
     * @return difference between `baseValue` and `difference`
     */
    public Byte subtract(byte baseValue, byte difference) {
        int sum = baseValue - difference;
        byte bsum = (byte)sum;
        return bsum;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to subtract from starting value
     * @return difference between `baseValue` and `difference`
     */
    public Float subtract(float baseValue, float difference) {
        float sum = baseValue - difference;
        
        return sum;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to subtract from starting value
     * @return difference between `baseValue` and `difference`
     */
    public Double subtract(double baseValue, double difference) {
        return baseValue - difference;
    }


    /**
     * @param dividend value to be divided
     * @param divisor value to divide by
     * @return division of `dividend` by `divisor
     */
    public Integer divide(int dividend, int divisor) {
        return dividend/divisor;
    }

    /**
     * @param dividend value to be divided
     * @param divisor value to divide by
     * @return division of `dividend` by `divisor
     */
    public Long divide(long dividend, long divisor) {
        return dividend/divisor;
    }

    /**
     * @param dividend value to be divided
     * @param divisor value to divide by
     * @return division of `dividend` by `divisor
     */
    public Short divide(short dividend, short divisor) {
        int div = dividend / divisor;
        short sdiv = (short)div;
        
        return sdiv;
    }

    /**
     * @param dividend value to be divided
     * @param divisor value to divide by
     * @return division of `dividend` by `divisor
     */
    public Byte divide(byte dividend, byte divisor) {
        int div = dividend / divisor;
        byte sdiv = (byte)div;
        
        return sdiv;
    }

    /**
     * @param dividend value to be divided
     * @param divisor value to divide by
     * @return division of `dividend` by `divisor
     */
    public Float divide(float dividend, float divisor) {
        return dividend / divisor;
    }

    /**
     * @param dividend value to be divided
     * @param divisor value to divide by
     * @return division of `dividend` by `divisor
     */
    public Double divide(double dividend, double divisor) {
        return dividend / divisor;
    }


    /**
     * @param multiplicand value to be multiplied
     * @param multiplier value to multiply by
     * @return product of `multiplicand` by `multiplier`
     */
    public Integer multiply(int multiplicand, int multiplier) {
        return multiplicand * multiplier;
    }

    /**
     * @param multiplicand value to be multiplied
     * @param multiplier value to multiply by
     * @return product of `multiplicand` by `multiplier`
     */
    public Long multiply(long multiplicand, long multiplier) {
        return multiplicand * multiplier;
    }

    /**
     * @param multiplicand value to be multiplied
     * @param multiplier value to multiply by
     * @return product of `multiplicand` by `multiplier`
     */
    public Short multiply(short multiplicand, short multiplier) {
        int res = multiplicand * multiplier;
        short sres = (short) res;
        return sres;
    }
    /**
     * @param multiplicand value to be multiplied
     * @param multiplier value to multiply by
     * @return product of `multiplicand` by `multiplier`
     */
    public Byte multiply(byte multiplicand, byte multiplier) {
        int res = multiplicand * multiplier;
        byte sres = (byte) res;
        return sres;
    }

    /**
     * @param multiplicand value to be multiplied
     * @param multiplier value to multiply by
     * @return product of `multiplicand` by `multiplier`
     */
    public Float multiply(float multiplicand, float multiplier) {
        return multiplicand * multiplier;
    }

    /**
     * @param multiplicand value to be multiplied
     * @param multiplier value to multiply by
     * @return product of `multiplicand` by `multiplier`
     */
    public Double multiply(double multiplicand, double multiplier) {
        return multiplicand * multiplier;
    }
}
