import java.math.BigInteger;

class Factorial {
    public static BigInteger calcDoubleFactorial(int n) {
        BigInteger number = BigInteger.valueOf(n);

        if (n == 0 || n == 1) {
            return BigInteger.ONE;
        }
        if (n == 2) {
            return BigInteger.TWO;
        }

        return number.multiply(calcDoubleFactorial(n - 2));
    }
}

