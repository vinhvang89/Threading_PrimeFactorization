public class LazyPrimeFactorization implements Runnable {
    @Override
    public void run() {
        int count = 0;
        int number = 0;
        long start = System.currentTimeMillis();
        while (count < 20) {
            try {
                if (isPrime(number)) {
                    System.out.println("Lazy " + number);
                    count++;
                }
                number++;

                Thread.sleep(10);
            } catch (Exception e) {
                System.out.println("Trash Computer");
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("Time to LazyPrimeFactorization done : " +  (end - start)+ " mini seconds");
    }
    private boolean isPrime(int number){
        if( number < 2)
            return  false;
        else if( number == 2)
            return true;
        else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0)
                    return false;
            }
            return true;
        }
    }
}
