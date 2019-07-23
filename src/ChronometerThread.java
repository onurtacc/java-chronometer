public class ChronometerThread implements Runnable {

    private Thread thread;
    private String threadName;

    public ChronometerThread(String threadName) {
        this.threadName = threadName;
        System.out.println("Thread Starting : " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Running : " + threadName);

        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(threadName + " : " + i);
                Thread.sleep(1000);
            }

        } catch (InterruptedException exception) {
            System.out.println("Exception : " + threadName);
        }

        System.out.println("Thread Finish : " + threadName);
    }

    public void start() {
        System.out.println("Thread Object Creating");
        if (thread == null) {
            thread = new Thread(this, threadName);
            thread.start();
        }
    }
}
