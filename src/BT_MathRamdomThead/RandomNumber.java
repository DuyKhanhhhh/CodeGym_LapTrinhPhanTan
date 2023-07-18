package BT_MathRamdomThead;

import java.util.Scanner;

public class RandomNumber extends Thread {
    private int guessNumber;
    private int count;
    public RandomNumber (int guessNumber){
        this.guessNumber = guessNumber;
    }

    @Override
    public void run() {
        int randomNumber = 0;
        do {
            randomNumber = (int) (Math.random() * 100 + 1);
            count++;
            System.out.println(getName() + " Đoán số: " + randomNumber);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }while (randomNumber != guessNumber);
            System.out.println(getName() + "Đã đoán đúng số: " + guessNumber + "Trong: " + count + "lần đếm");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy Đoán Số: ");
        int number = scanner.nextInt();

        RandomNumber randomNumber1 = new RandomNumber(number);
        RandomNumber randomNumber2 = new RandomNumber(number);

        randomNumber1.start();
        randomNumber2.start();

        randomNumber1.setName("Player 1");
        randomNumber2.setName("Player 2");
    }
}
