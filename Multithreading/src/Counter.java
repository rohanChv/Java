public class Counter extends Thread{
    @Override
    public void run() {
        System.out.println("Created Thread :"+Thread.currentThread().getName());
        for (int i=0;i<20;i++){
            System.out.println("name of thread "+ Thread.currentThread().getName()+" "+i);
        }
    }
}
