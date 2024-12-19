public class Casting {
    public static void main(String[] args) {
        int myNumber = 100;
        System.out.println("My number is: " + myNumber);
        int myNewNumber = (myNumber / 2);
        System.out.println("If I divide my number by 2, my new number is: " + myNewNumber);

        /**
         * This example if uncommented generates an error
         */
        // byte myByteNumber = 10;
        // System.out.println("My byte number is: " + myByteNumber);
        // byte myNewByteNumber = (myByteNumber / 2);
        // System.out.println("If divide my byte number by 2, my new byte number is: " +
        // myNewByteNumber);

        /**
         * Casting example
         */
        byte myByteNumber = 20;
        System.out.println("My byte number is: " + myByteNumber);
        byte myNewByteNumber = (byte) (myByteNumber / 2);
        System.out.println("If I divide my byte number by 2, my new byte number is: " + myNewByteNumber);

        short myShortNumber = 12;
        System.out.println("My short number is: " + myShortNumber);
        short myNewShortNumber = (short) (myShortNumber / 2);
        System.out.println("If I divide my short number by 2, my new byte number is: " + myNewShortNumber);
    }
}
