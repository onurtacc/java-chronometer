public class Main {

    public static void main(String[] args) {
        ChronometerThread thread1 = new ChronometerThread("Thread1");
        ChronometerThread thread2 = new ChronometerThread("Thread2");
        ChronometerThread thread3 = new ChronometerThread("Thread3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}