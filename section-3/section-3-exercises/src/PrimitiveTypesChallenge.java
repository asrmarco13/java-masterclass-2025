public class PrimitiveTypesChallenge {
    public static void main(String[] args) {
        /**
         * Your challenge is to create four new variables:
         * A byte variable, set it to any valid byte number, it doesn't matter.
         * A short variable, set it to any valid short number.
         * An int variable, set it to any valid integer number.
         * Lastly, create a variable of type long. Make it equal to 50,000 plus 10 times
         * the sum of the values of the first 3 variables (your byte, your short and
         * your int values). In other words, use the variable names in your expression
         * to calculate the sum.
         * 
         */

        byte myByteValue = 10;
        short myShortValue = 20;
        int myIntValue = 50;
        int sum = 10 * (myByteValue + myShortValue + myIntValue);
        long myLongValue = 50000L + sum;
        System.out.println("My long value is: " + myLongValue);
    }
}
