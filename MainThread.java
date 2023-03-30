package LabMarch30;

public class MainThread {
	  
    public static void main(String[] args) throws InterruptedException {
        ListLoader loader = new ListLoader();
        long startTime = System.currentTimeMillis();
        LoaderThread thread1 = new LoaderThread(0, 5000000, loader);
        LoaderThread thread2 = new LoaderThread(5000001, 10000000, loader);
        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        long endTime = System.currentTimeMillis();
        long responseTime = endTime - startTime;
        System.out.println("Time taken to load list: " + responseTime + "ms");
    }
}
