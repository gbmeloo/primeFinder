
public class PrimeFinder {

    public static void main(String[] args) {
        
        if (args.length == 0) {
            System.out.println("Please provide a limit for the prime numbers.");
            return;
        }

        try {
            // Parse the first argument as an integer
            int limit = Integer.parseInt(args[0]);

            // Pass the limit to the Prime class
            Prime primes = new Prime(limit);
            primes.primeFinder();

            System.out.println(primes.getPrimes());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format. Please provide an integer.");
        }


    }

}