public class Expressions {
    public static void main(String[] args) {
        /**
         * Example of an expression
         * [primitive type] [variable] = [expression] [expression]
         **/
        int myFirstNumber = (10 + 5) + (2 * 10);
        int mySecondNumber = (6 + 6);
        int myThirdNumber = (3 *2);
        System.out.println( "My variable myFirstNumber is " + myFirstNumber);
        System.out.println("My variable mySecondNumber is " + mySecondNumber);
        System.out.println("My variable myThirdNumber is " + myThirdNumber);
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println("Total: " + myTotal);
    }
}
