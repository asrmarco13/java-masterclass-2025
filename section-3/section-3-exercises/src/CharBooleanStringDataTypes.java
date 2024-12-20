public class CharBooleanStringDataTypes {
    public static void main(String[] args) {
        /**
         * Char example
         */
        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println("My char is " + myChar);
        System.out.println("My unicode char is " + myUnicodeChar);

        /**
         * Boolean example
         */
        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
        System.out.println("My true boolean value is " + myTrueBooleanValue);
        System.out.println("My false boolean value is " + myFalseBooleanValue);

        /**
         * String example
         */
        String myString = "This is a string";
        System.out.println("My string is " + myString);

        myString = myString + ", and this is more.";
        System.out.println("My string is " + myString);

        myString = myString + " \u00A9 2019";
        System.out.println("My string is " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("The result is " + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("The result is " + lastString);

        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("The result is " + lastString);
    }
}
