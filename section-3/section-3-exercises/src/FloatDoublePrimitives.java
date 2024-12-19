public class FloatDoublePrimitives {
    public static void main(String[] args) {
        /**
         * Float example
         */
        float minFloatValue = Float.MIN_VALUE;
        float maxFloatValue = Float.MAX_VALUE;
        System.out.println("Float value range ( " + minFloatValue + ", " + maxFloatValue + " )");

        float myFloatValue = 5f;
        System.out.println("My float value is " + myFloatValue);

        float myNewFloatValue = 5f / 3f;
        System.out.println("My new float value is " + myNewFloatValue);

        /**
         * Uncommented the line below to generates an error
         */
        // float myNewFloatValue = 5.25;

        /**
         * Double example
         */
        double minDoubleValue = Double.MIN_VALUE;
        double maxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double value range ( " + minDoubleValue + ", " + maxDoubleValue + " )");

        // Java default type for real numbers are double
        double myDoubleValue = 5d;
        System.out.println("My double value is " + myDoubleValue);

        double myNewDoubleValue = 5d / 3d;
        System.out.println("My new double value is " + myNewDoubleValue);

        /**
         * Double example
         * 1 pound = 0.45359237 kg
         */
        double myPound = 120d;
        double kgConversion = myPound * 0.45359237;
        System.out.println("My kg is " + kgConversion);
    }
}
