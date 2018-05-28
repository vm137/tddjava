package epam.com.javalab.tdd.param;

class Factorial {

    static int factorial(int n) throws IllegalArgumentException {

        if (n < 0) {
            throw new IllegalArgumentException("Negative agrument.");
        }

        if (n <= 1)
            return 1;
        else
            return n * factorial(n - 1);
    }

}
