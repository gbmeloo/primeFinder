import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Prime {
    
    private int limit;
    private List<Integer> primes;

    public Prime(int limit) {
        this.limit = limit;
        this.primes = new ArrayList<>();
    }

    public void primeFinder() {
        BigDecimal[] divisionResult;

        for (int i = 2; i <= this.limit; i++) {
            BigDecimal fac = factorial(i - 1);
            BigDecimal convert = BigDecimal.valueOf(i);
            divisionResult = fac.add(BigDecimal.ONE).divideAndRemainder(convert);
            BigDecimal remainder = divisionResult[1];
            if (remainder.compareTo(BigDecimal.ZERO) == 0) {
                this.primes.add(i);
            } else {
                continue;
            }
        }
    }
    

    public static BigDecimal factorial(int num) {
        BigDecimal result = BigDecimal.ONE;
        
        for (int i = 1; i <= num; i++) {
            result = result.multiply(BigDecimal.valueOf(i));
        }

        return result;
    }

    public List<Integer> getPrimes() {
        return this.primes;
    }

}
