package BT_Chanle;

public class OddThread extends Thread{
    public void run(){
        for (int i = 1; i < 10; i +=2) {
            try {
                Thread.sleep(10);

            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}
