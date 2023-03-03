package exceptions;

public class PrimeFinderTester {
    public static void main(String[] args) {

        try {
            PrimeFinder pf = new PrimeFinder(134);
            pf.run();
            System.out.println(pf.prime);

            System.out.println(pf.isPrime(29));

        } catch (NegativeNumberException e) {
            System.out.println("Podano ujemną liczę " + e.getMessage());
        }
    }
}
