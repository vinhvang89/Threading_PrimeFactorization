public class Test {
    public static void main(String[] args) {
        LazyPrimeFactorization lazyPrimeFactorization = new LazyPrimeFactorization();
        OptimizedPrimeFactorization optimizedPrimeFactorization = new OptimizedPrimeFactorization();
        Thread lazy = new Thread(lazyPrimeFactorization);
        Thread optimize = new Thread(optimizedPrimeFactorization);

        lazy.start();
        optimize.start();
    }
}
