public class BasicThread {

    public static void main(String[] args) {
        long currentTime=System.currentTimeMillis();
        long endTime;
        long difference;
        long Result;
        Thread firstThread=new Thread(new FirstThread(),"First Thread");
        firstThread.start();
        for(int i=0;i<1000;i++){
            System.out.print(i*123+" ["+Thread.currentThread().getName()+"],");
        }
        endTime=System.currentTimeMillis();
        difference=endTime-currentTime;
        Result=difference/1000;
        System.out.println("\nTime needed is "+difference+" secs");
    }

}
