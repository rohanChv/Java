public class ThreadDemo {
    public static void main(String[] args) {
        NewThread firstThread=new NewThread("firstThread");
        NewThread secondThread=new NewThread("secondThread");
        NewThread thirdThread=new NewThread("thirdThread");
        try{
            firstThread.t.start();
            secondThread.t.start();
            thirdThread.t.start();
        }catch (Exception e){

        }
    }
}
