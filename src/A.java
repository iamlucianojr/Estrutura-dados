public class A implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}


