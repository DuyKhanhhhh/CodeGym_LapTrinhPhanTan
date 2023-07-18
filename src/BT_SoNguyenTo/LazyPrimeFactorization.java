package BT_SoNguyenTo;

public class LazyPrimeFactorization implements Runnable {
    private int currentNumber = 2;

    @Override
    public void run() {
        while (true){
            if (isPrime(currentNumber)){
                System.out.println(currentNumber);
            }
            currentNumber++;
        }
    }

    private boolean isPrime(int number){
        if (number < 2){
            return false;
        }
        for (int i = 2; i <= number ; i++) {
            if (number % 2 == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Thread lazyThread = new Thread(new LazyPrimeFactorization());
        lazyThread.start();
    }
}
