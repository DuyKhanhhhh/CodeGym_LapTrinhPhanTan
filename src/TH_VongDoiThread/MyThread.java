package TH_VongDoiThread;

public class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("MyThread Start");
        Thread myRunnableThread = new Thread(new MyRunnable());
        myRunnableThread.start();

        try {
            myRunnableThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("MyThread End");

    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();

        myThread.start();

        try {
            Thread.sleep(20000);
            System.out.println("MyThread State: " + myThread.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
