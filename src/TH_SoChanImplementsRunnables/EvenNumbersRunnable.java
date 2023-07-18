package TH_SoChanImplementsRunnables;

public class EvenNumbersRunnable implements Runnable{
    @Override
    public void run(){
        for (int i = 2; i <=10; i+=2){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        EvenNumbersRunnable evenNumbersRunnable = new EvenNumbersRunnable();
        Thread evenThead = new Thread(evenNumbersRunnable);
        evenThead.start();
    }
}
