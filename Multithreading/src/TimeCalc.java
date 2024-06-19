public class TimeCalc {
    public static void main(String[] args) {
        long currentTime=System.currentTimeMillis();
        long endTime;
        long difference;
        long Result;
        for(int i=0;i<1000;i++){
            System.out.print(i*123+" ["+Thread.currentThread().getName()+"],");
        }
        ForObject f1=new ForObject();
        f1.loop();
        endTime=System.currentTimeMillis();
        difference=endTime-currentTime;
        Result=difference/1000;
        System.out.println("\nTime needed is "+difference+" secs");
    }
}
