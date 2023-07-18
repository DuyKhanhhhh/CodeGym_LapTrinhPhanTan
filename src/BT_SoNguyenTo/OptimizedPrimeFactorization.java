package BT_SoNguyenTo;

public class OptimizedPrimeFactorization implements Runnable {

    @Override
    public void run(){
        int number = 2;
        while (true){
            if (isPrime(number)){
                System.out.println(number);
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (number >= 100){
                break;
            }
            number++;
        }
    }
    private boolean isPrime(int number){
        int sqrt = (int) Math.sqrt(number);
        if (number < 2){
            return false;
        }
        for (int i = 2; i <= sqrt; i++) {
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}
