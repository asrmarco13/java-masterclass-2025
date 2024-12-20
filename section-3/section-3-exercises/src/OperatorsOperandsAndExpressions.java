public class OperatorsOperandsAndExpressions {
    public static void main(String[] args) {
        // 1. Create a double variable with a value of 20.00
        double myDouble = 20.00d;

        // 2. Create a second variable of type double with the value 80.00
        double mySecondDouble = 80.00d;

        // 3. Add both numbers together and multiply by 100.00
        double myTotal = (myDouble + mySecondDouble) * 100.00d;

        // 4. Use the remainder operator to figure out what the remainder from the result of the operation in step 3 and 40.00
        double myRemainder = myTotal % 40.00d;

        // 5. Create a boolean variable that assigns the value true if the remainder in #4 is 0, or false if it's not zero
        boolean isZero = (myRemainder == 0) ? true : false;

        // 6. Output the boolean variable
        System.out.println(isZero);

        // 7. Write an if-then statement that displays a message "Got some remainder" if the boolean in step 5 is not true
        if (!isZero) {
            System.out.println("Got some remainder");
        }
    }
}
