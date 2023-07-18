package BT_MathRandomRunnable;

import java.util.Scanner;

public class NumberRandom implements Runnable{
    private int gussNumber;
    private int count;
    public NumberRandom (int gussNumber){
        this.gussNumber = gussNumber;
    }

    @Override
    public void run() {
        int numberRandom = 0;
        do {
            numberRandom = (int) (Math.random() * 100 + 1);
            count++;
            System.out.println(Thread.currentThread().getName() + " Đoán Số: " + numberRandom);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }while (gussNumber != numberRandom);
        System.out.println(Thread.currentThread().getName() + " Đã đoán ra số: " + numberRandom + " Trong: " + count + " Lần đoán");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Player 1 đoán số(Chỉ được đoán 2 số): ");
        int number1 = scanner.nextInt();

        System.out.print("Player 2 đoán số(Chỉ được đoán 2 số): ");
        int number2 = scanner.nextInt();

        NumberRandom numberRandom1 = new NumberRandom(number1);
        NumberRandom numberRandom2 = new NumberRandom(number2);

        Thread thread1 = new Thread(numberRandom1);
        Thread thread2 = new Thread(numberRandom2);

        thread1.setName("Player1");
        thread2.setName("Player2");

        thread1.start();
        thread2.start();
    }
}
