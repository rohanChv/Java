public class FirstThread extends  Thread{
    int i=0;
    public void run(){
        System.out.println("The thread being executed is :" + Thread.currentThread().getName());
        for(i=0;i<1000;i++){
            System.out.print(i*123+" ["+Thread.currentThread().getName()+"],");
        }
    }
}
