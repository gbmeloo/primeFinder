
public class Main {

    public static void main(String[] args) {
        
        Prime primes = new Prime(200);
        primes.primeFinder();
        
        System.out.println(primes.getPrimes());

    }

}