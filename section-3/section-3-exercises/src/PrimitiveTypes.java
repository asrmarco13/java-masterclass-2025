public class PrimitiveTypes {
    /**
     * @param args
     */
    public static void main(String[] args) {
        /**
         * Min integer value
         */
        int minIntValue = Integer.MIN_VALUE;
        System.out.println("Min integer value = " + minIntValue);

        /**
         * Min integer value
         */
        int maxIntValue = Integer.MAX_VALUE;
        System.out.println("Max integer value = " + maxIntValue);

        System.out.println("Integer value range ( " + minIntValue + ", " + maxIntValue + " )");

        /**
         * Byte value
         */
        byte minByteValue = Byte.MIN_VALUE;
        System.out.println("Min byte value = " + minByteValue);

        byte maxByteValue = Byte.MAX_VALUE;
        System.out.println("Max byte value = " + maxByteValue);

        System.out.println("Byte value range ( " + minByteValue + ", " + maxByteValue + " )");

        /**
         * Short value
         */
        short minShortValue = Short.MIN_VALUE;
        System.out.println("Min short value = " + minShortValue);

        short maxShortValue = Short.MAX_VALUE;
        System.out.println("Max short value = " + maxShortValue);

        System.out.println("Short value range ( " + minShortValue + ", " + maxShortValue + " )");

        /**
         * Long value
         */
        long minLongValue = Long.MIN_VALUE;
        System.out.println("Min long value = " + minLongValue);

        long maxLongValue = Long.MAX_VALUE;
        System.out.println("Max long value = " + maxLongValue);
        
        System.out.println("Long value range ( " + minLongValue + ", " + maxLongValue + " )");

        /**
         * Numeric literal example
         */
        long longValue = 2147483647; // this is an int. If you change the value to 2147483647000, the result will be
                                     // an out of range error
        long anotherLongValue = 2147483647L; // this is a long. With 'L' suffix the value 2147483647 will be considered
                                             // as a long

    }
}
