import java.util.HashSet;

public class main {

    public static HashSet<Integer> primes = new HashSet<>();
    public static HashSet<Integer> notPrimes = new HashSet<>();

    public static int countPrimes(int n) {
        return helper(n-1);
    }

    public static int helper(int n){
        int val = n;

        if(val <= 1){
            return 0;
        }

        if(notPrimes.contains(n))
            return helper(n-1);

        if(primes.contains(n))
            return 1 + helper(n-1);

        if(n % 2 == 0 || n % 5 == 0){
            return helper(n-1);
        }


        int divider = val-1;
        while(divider > 1){
            if(val % divider == 0){
                notPrimes.add(divider);
                return helper(val-1);
            }

            divider--;
        }
        primes.add(divider);
        return 1 + helper((val-1));
    }

    public static void main(String args[]){
        System.out.println(countPrimes(499979));
    }
}
